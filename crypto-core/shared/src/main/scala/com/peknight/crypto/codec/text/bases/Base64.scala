package com.peknight.crypto.codec.text.bases

import cats.parse.{Parser, Parser0}
import cats.{Applicative, Id}
import com.peknight.codec.Codec
import com.peknight.codec.cursor.Cursor
import com.peknight.codec.error.DecodingFailure
import com.peknight.codec.sum.StringType
import scodec.bits.Bases.Base64Alphabet
import scodec.bits.{Bases, ByteVector}

import scala.util.Try

trait Base64 extends Base:
  def alphabet: Base64Alphabet
  override def decode: Either[DecodingFailure, ByteVector] = Base64.stringCodecBase64[Id](alphabet).decode(value)
object Base64:

  def stringCodecBase64[F[_]: Applicative](alphabet: Base64Alphabet): Codec[F, String, String, ByteVector] =
    Codec.applicative[F, String, String, ByteVector](_.toBase64(alphabet))(t =>
      ByteVector.fromBase64Descriptive(t, alphabet).left.map(DecodingFailure.apply)
    )

  def codecBase64S[F[_]: Applicative, S: StringType](alphabet: Base64Alphabet): Codec[F, S, Cursor[S], ByteVector] =
    given Codec[F, String, String, ByteVector] = stringCodecBase64[F](alphabet)
    Codec.codecS[F, S, ByteVector]

  def base64StringParser(alphabet: Base64Alphabet): Parser0[String] =
    (
      Parser.charsWhile0(ch => Try(alphabet.toIndex(ch)).isSuccess) ~
      (if alphabet.pad == 0.toChar then Parser.pure(List.empty[Char]) else Parser.char(alphabet.pad).rep0(0, 3))
    ).string

  private[this] case class Base64(value: String, alphabet: Base64Alphabet)
    extends com.peknight.crypto.codec.text.bases.Base64

  def apply(value: String, alphabet: Base64Alphabet): com.peknight.crypto.codec.text.bases.Base64 =
    Base64(value, alphabet)

  def base64Parser(alphabet: Base64Alphabet): Parser0[com.peknight.crypto.codec.text.bases.Base64] =
    base64StringParser(alphabet).map(value => apply(value, alphabet))
end Base64
