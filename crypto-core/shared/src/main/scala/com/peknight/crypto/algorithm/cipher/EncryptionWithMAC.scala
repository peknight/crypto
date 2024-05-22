package com.peknight.crypto.algorithm.cipher

import com.peknight.crypto.algorithm.Algorithm
import com.peknight.crypto.algorithm.mac.MAC

trait EncryptionWithMAC extends Algorithm with MAC:
  def encryption: Algorithm
  def mac: MAC
  override def algorithm: String = s"${encryption.algorithm}with${mac.algorithm}"
  override def abbreviation: String = s"${encryption.abbreviation}-${mac.abbreviation}"
end EncryptionWithMAC
object EncryptionWithMAC:
  private[this] case class EncryptionWithMAC(encryption: Algorithm, mac: MAC)
    extends com.peknight.crypto.algorithm.cipher.EncryptionWithMAC
  def apply(encryption: Algorithm, mac: MAC): com.peknight.crypto.algorithm.cipher.EncryptionWithMAC =
    EncryptionWithMAC(encryption, mac)
end EncryptionWithMAC
