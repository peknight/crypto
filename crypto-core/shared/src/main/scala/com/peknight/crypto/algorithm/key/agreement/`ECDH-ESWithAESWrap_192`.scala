package com.peknight.crypto.algorithm.key.agreement

import com.peknight.crypto.algorithm.cipher.Cipher
import com.peknight.crypto.algorithm.cipher.symmetric.AESWrap_192

/**
 * Defined in JWE
 */
object `ECDH-ESWithAESWrap_192` extends `ECDH-ESWithEncryption`:
  val encryption: Cipher = AESWrap_192
end `ECDH-ESWithAESWrap_192`
