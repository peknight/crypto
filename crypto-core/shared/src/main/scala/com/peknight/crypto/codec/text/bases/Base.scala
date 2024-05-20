package com.peknight.crypto.codec.text.bases

import com.peknight.codec.error.DecodingFailure
import scodec.bits.Bases.Alphabet
import scodec.bits.ByteVector

trait Base:
  def value: String
  def alphabet: Alphabet
  def decode: Either[DecodingFailure, ByteVector]
  def unsafeDecode: ByteVector = decode.fold(throw _, identity)
end Base
