package com.peknight.crypto.algorithm.key.agreement

import com.peknight.crypto.algorithm.cipher.Cipher
import com.peknight.crypto.algorithm.cipher.symmetric.AESWrap_128

/**
 * Defined in JWE
 */
object `ECDH-ESWithAESWrap_128` extends `ECDH-ESWithEncryption`:
  val encryption: Cipher = AESWrap_128
end `ECDH-ESWithAESWrap_128`
