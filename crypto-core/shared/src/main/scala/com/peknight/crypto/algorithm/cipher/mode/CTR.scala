package com.peknight.crypto.algorithm.cipher.mode

/**
 * A simplification of OFB, Counter mode updates the input block as a counter.
 */
object CTR extends Mode:
  val mode: String = "CTR"
end CTR
