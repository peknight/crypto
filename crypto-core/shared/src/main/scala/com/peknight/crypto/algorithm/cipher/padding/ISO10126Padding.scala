package com.peknight.crypto.algorithm.cipher.padding

/**
 * This padding for block ciphers is described in the ISO 10126 standard (now withdrawn).
 */
object ISO10126Padding extends Padding:
  val padding: String = "ISO10126Padding"
end ISO10126Padding
