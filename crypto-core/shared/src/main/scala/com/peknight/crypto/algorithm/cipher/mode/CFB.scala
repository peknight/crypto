package com.peknight.crypto.algorithm.cipher.mode

/**
 * Cipher Feedback Mode
 */
trait CFB extends Mode:
  val mode: String = "CFB"
end CFB
object CFB extends CFB
