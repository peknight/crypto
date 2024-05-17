package com.peknight.crypto.algorithm.key.agreement

import com.peknight.crypto.algorithm.cipher.Cipher
import com.peknight.crypto.algorithm.cipher.symmetric.AESWrap_256

/**
 * Defined in JWE
 */
object `ECDH-ESWithAESWrap_256` extends `ECDH-ESWithEncryption`:
  val encryption: Cipher = AESWrap_256
end `ECDH-ESWithAESWrap_256`
