package com.peknight.crypto.algorithm.pbe

import com.peknight.crypto.algorithm.cipher.Cipher
import com.peknight.crypto.algorithm.digest.Digest
import com.peknight.crypto.algorithm.mac.{MAC, PBEWithMAC}
import com.peknight.crypto.algorithm.random.PRF

/**
 * Password-Based Encryption
 */
trait PBE extends Cipher
object PBE extends PBE:
  val algorithm: String = "PBE"
  def withDigestAndEncryption(digest: Digest, encryption: Cipher): PBEWithDigestAndEncryption =
    PBEWithDigestAndEncryption(digest, encryption)

  def withPRFAndEncryption(prf: PRF, encryption: Cipher): PBEWithPRFAndEncryption =
    PBEWithPRFAndEncryption(prf, encryption)

  def withMAC(mac: MAC): PBEWithMAC = PBEWithMAC(mac)
end PBE

