package com.peknight.crypto.algorithm.cipher.mode

/**
 * Key Wrap (KW) mode
 */
trait KW extends Mode:
  val mode: String = "KW"
end KW
object KW extends KW
