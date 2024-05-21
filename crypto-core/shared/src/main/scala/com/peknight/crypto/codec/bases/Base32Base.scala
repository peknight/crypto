package com.peknight.crypto.codec.bases

import cats.Applicative
import com.peknight.codec.error.DecodingFailure
import com.peknight.crypto.codec.bases
import scodec.bits.Bases.Base32Alphabet
import scodec.bits.{Bases, ByteVector}

trait Base32Base extends Base:
  def alphabet: Base32Alphabet
  override def decode[F[_]: Applicative]: F[Either[DecodingFailure, ByteVector]] =
    Base32Base.stringCodecBaseStringWithAlphabet[F](alphabet).decode(value)
object Base32Base extends Base32Platform[Base32Alphabet, Base32Base]:
  private[this] case class Base32Base(value: String, alphabet: Base32Alphabet)
    extends bases.Base32Base
  def apply(value: String, alphabet: Base32Alphabet): bases.Base32Base =
    Base32Base(value, alphabet)
  protected def toBaseWithAlphabet: (String, Base32Alphabet) => bases.Base32Base = apply
end Base32Base
