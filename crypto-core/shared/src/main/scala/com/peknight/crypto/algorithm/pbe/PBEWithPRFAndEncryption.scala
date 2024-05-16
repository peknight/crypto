package com.peknight.crypto.algorithm.pbe

import com.peknight.crypto.algorithm.cipher.Cipher
import com.peknight.crypto.algorithm.random.PRF

trait PBEWithPRFAndEncryption extends PBE:
  def prf: PRF
  def encryption: Cipher
  override def algorithm: String = s"PBEWith${prf.prf}And${encryption.abbreviation}"
end PBEWithPRFAndEncryption
object PBEWithPRFAndEncryption:
  private[this] case class PBEWithPRFAndEncryption(prf: PRF, encryption: Cipher)
    extends com.peknight.crypto.algorithm.pbe.PBEWithPRFAndEncryption
  def apply(prf: PRF, encryption: Cipher): com.peknight.crypto.algorithm.pbe.PBEWithPRFAndEncryption =
    PBEWithPRFAndEncryption(prf, encryption)
end PBEWithPRFAndEncryption
