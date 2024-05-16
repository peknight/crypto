package com.peknight.crypto.algorithm.digest

import com.peknight.crypto.algorithm.Algorithm
import com.peknight.crypto.algorithm.signature.DigestWithEncryption

trait Digest extends Algorithm:
  def bitLength: Int
  def outputLength: Int = bitLength
  def withEncryption(encryption: Algorithm): DigestWithEncryption = DigestWithEncryption(this, encryption, None, None)
end Digest
