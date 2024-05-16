package com.peknight.crypto.algorithm.cipher.symmetric

trait AESWrapPad_N extends AESWrapPad with AES_N:
  override def algorithm: String = s"AESWrapPad_$keySize"
end AESWrapPad_N
