package com.peknight.crypto.algorithm.cipher.symmetric

trait AESWrap_N extends AESWrap with AES_N:
  override def algorithm: String = s"AESWrap_$keySize"
end AESWrap_N
