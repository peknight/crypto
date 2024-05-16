package com.peknight.crypto.algorithm.digest

/**
 * Message Digest
 */
trait MD extends Digest:
  val bitLength: Int = 128
end MD
