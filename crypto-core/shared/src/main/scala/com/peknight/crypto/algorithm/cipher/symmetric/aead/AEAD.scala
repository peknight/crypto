package com.peknight.crypto.algorithm.cipher.symmetric.aead

import com.peknight.crypto.algorithm.cipher.symmetric.{Symmetric, aead}
import com.peknight.crypto.algorithm.mac.MAC

/**
 * Authenticated Encryption with Associated Data
 */
sealed trait AEAD extends Symmetric:
  def symmetricForAEAD: Symmetric
  def mac: MAC
  def algorithm: String = s"${symmetricForAEAD.abbreviation}-${mac.abbreviation}"
end AEAD
object AEAD:
  private[this] case class AEAD(symmetricForAEAD: Symmetric, mac: MAC) extends aead.AEAD
  private[crypto] def apply(symmetric: Symmetric, mac: MAC): aead.AEAD =
    AEAD(symmetric, mac)
end AEAD
