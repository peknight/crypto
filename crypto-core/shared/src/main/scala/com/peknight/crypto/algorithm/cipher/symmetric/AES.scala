package com.peknight.crypto.algorithm.cipher.symmetric

/**
 * Advanced Encryption Standard
 */
trait AES extends Symmetric:
  def keySize: Int
  override def abbreviation: String = s"A${keySize}"
end AES
object AES extends AES:
  val keySize: Int = 128
  val algorithm: String = "AES"
end AES
