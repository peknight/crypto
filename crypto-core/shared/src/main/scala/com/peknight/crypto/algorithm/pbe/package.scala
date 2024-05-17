package com.peknight.crypto.algorithm

import com.peknight.crypto.algorithm.cipher.symmetric.{AESWrap_128, AESWrap_192, AESWrap_256}
import com.peknight.crypto.algorithm.mac.{HmacSHA256, HmacSHA384, HmacSHA512}

package object pbe:
  val `PBES2withHmacSHA256andAESWrap_128`: PBES2WithMACAndEncryption = PBES2WithMACAndEncryption(HmacSHA256, AESWrap_128)
  val `PBES2withHmacSHA384andAESWrap_192`: PBES2WithMACAndEncryption = PBES2WithMACAndEncryption(HmacSHA384, AESWrap_192)
  val `PBES2withHmacSHA512andAESWrap_256`: PBES2WithMACAndEncryption = PBES2WithMACAndEncryption(HmacSHA512, AESWrap_256)
end pbe
