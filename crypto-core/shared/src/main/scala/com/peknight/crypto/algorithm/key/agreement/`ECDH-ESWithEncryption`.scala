package com.peknight.crypto.algorithm.key.agreement

import com.peknight.crypto.algorithm.cipher.Cipher
import com.peknight.crypto.algorithm.key.cek.CEK

/**
 * Defined in JWE
 */
trait `ECDH-ESWithEncryption` extends `ECDH-ES`:
  def cek: CEK = CEK
  def encryption: Cipher
  override def algorithm: String = s"ECDH-ESwith${encryption.abbreviation}"
  override def abbreviation: String = s"ECDH-ES+${encryption.abbreviation}"
end `ECDH-ESWithEncryption`
