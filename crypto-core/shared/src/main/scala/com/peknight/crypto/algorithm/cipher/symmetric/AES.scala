package com.peknight.crypto.algorithm.cipher.symmetric

/**
 * Advanced Encryption Standard
 */
trait AES extends Symmetric
object AES extends AES:
  val algorithm: String = "AES"
end AES
