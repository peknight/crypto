package com.peknight.crypto.codec.bases

import cats.Applicative
import cats.parse.{Parser, Parser0}
import com.peknight.codec.Codec
import com.peknight.codec.cursor.Cursor
import com.peknight.codec.error.DecodingFailure
import com.peknight.codec.sum.StringType
import scodec.bits.Bases.{Alphabet, PaddedAlphabet}
import scodec.bits.ByteVector

import scala.reflect.ClassTag
import scala.util.Try

trait BasePlatform[A <: Alphabet, B <: Base : ClassTag]:
  protected def fromBaseDescriptiveWithAlphabet: (String, A) => Either[String, ByteVector]
  protected def toBaseStringWithAlphabet: (ByteVector, A) => String
  protected def maxPadLength: Int
  protected def toBaseWithAlphabet: (String, A) => B

  def stringCodecBaseStringWithAlphabet[F[_]: Applicative](alphabet: A)
  : Codec[F, String, String, ByteVector] =
    Codec.applicative[F, String, String, ByteVector](toBaseStringWithAlphabet(_, alphabet))(t =>
      fromBaseDescriptiveWithAlphabet(t, alphabet).left.map(DecodingFailure.apply)
    )

  def codecBaseStringSWithAlphabet[F[_]: Applicative, S: StringType](alphabet: A)
  : Codec[F, S, Cursor[S], ByteVector] =
    given Codec[F, String, String, ByteVector] = stringCodecBaseStringWithAlphabet[F](alphabet)
    Codec.codecS[F, S, ByteVector]

  private[this] def paddingParserWithAlphabet(alphabet: A): Parser0[String] =
    alphabet match
      case a: PaddedAlphabet if a.pad != 0.toChar => Parser.char(a.pad).rep0(0, maxPadLength).string
      case _ => Parser.unit.string

  def baseStringParserWithAlphabet(alphabet: A): Parser0[String] =
      (Parser.charsWhile0(ch => Try(alphabet.toIndex(ch)).isSuccess) ~ paddingParserWithAlphabet(alphabet)).string

  def baseParserWithAlphabet(alphabet: A): Parser0[B] =
    baseStringParserWithAlphabet(alphabet).map(toBaseWithAlphabet(_, alphabet))

  def stringCodecBaseWithAlphabet[F[_]: Applicative](alphabet: A): Codec[F, String, String, B] =
    Codec.applicative[F, String, String, B](_.value)(t =>
      baseParserWithAlphabet(alphabet).parseAll(t).left.map(DecodingFailure.apply)
    )

  def codecBaseSWithAlphabet[F[_]: Applicative, S: StringType](alphabet: A): Codec[F, S, Cursor[S], B] =
    given Codec[F, String, String, B] = stringCodecBaseWithAlphabet[F](alphabet)
    Codec.codecS[F, S, B]
end BasePlatform
