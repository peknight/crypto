package com.peknight.crypto.codec.text.bases

import cats.Applicative
import com.peknight.codec.error.DecodingFailure
import scodec.bits.Bases.Base64Alphabet
import scodec.bits.{Bases, ByteVector}

trait Base64Base extends Base:
  def alphabet: Base64Alphabet
  override def decode[F[_]: Applicative]: F[Either[DecodingFailure, ByteVector]] =
    Base64Base.stringCodecBaseStringWithAlphabet[F](alphabet).decode(value)
object Base64Base extends Base64Platform[Base64Alphabet, com.peknight.crypto.codec.text.bases.Base64Base]:
  private[this] case class Base64Base(value: String, alphabet: Base64Alphabet)
    extends com.peknight.crypto.codec.text.bases.Base64Base
  def apply(value: String, alphabet: Base64Alphabet): com.peknight.crypto.codec.text.bases.Base64Base =
    Base64Base(value, alphabet)
  protected def toBaseWithAlphabet: (String, Base64Alphabet) => com.peknight.crypto.codec.text.bases.Base64Base = apply
end Base64Base
