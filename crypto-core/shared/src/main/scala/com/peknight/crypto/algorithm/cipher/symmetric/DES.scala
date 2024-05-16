package com.peknight.crypto.algorithm.cipher.symmetric

/**
 * Data Encryption Standard
 */
trait DES extends Symmetric:
  val algorithm: String = "DES"
end DES
object DES extends DES
