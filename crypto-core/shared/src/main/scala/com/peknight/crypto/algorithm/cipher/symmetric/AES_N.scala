package com.peknight.crypto.algorithm.cipher.symmetric

trait AES_N extends AES:
  def keySize: Int
  override def algorithm: String = s"AES_$keySize"
end AES_N
