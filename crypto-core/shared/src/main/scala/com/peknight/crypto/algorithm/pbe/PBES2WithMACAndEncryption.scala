package com.peknight.crypto.algorithm.pbe

import com.peknight.crypto.algorithm.cipher.Cipher
import com.peknight.crypto.algorithm.mac.MAC

trait PBES2WithMACAndEncryption extends PBES2:
  def mac: MAC
  def encryption: Cipher
  override def algorithm: String = s"PBES2with${mac.abbreviation}and${encryption.abbreviation}"
  override def abbreviation: String = s"PBES2-${mac.abbreviation}+${encryption.abbreviation}"
end PBES2WithMACAndEncryption
object PBES2WithMACAndEncryption:
  private[this] case class PBES2WithMACAndEncryption(mac: MAC, encryption: Cipher)
    extends com.peknight.crypto.algorithm.pbe.PBES2WithMACAndEncryption
  def apply(mac: MAC, encryption: Cipher): com.peknight.crypto.algorithm.pbe.PBES2WithMACAndEncryption =
    PBES2WithMACAndEncryption(mac, encryption)
end PBES2WithMACAndEncryption
