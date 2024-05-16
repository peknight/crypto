package com.peknight.crypto.algorithm.pbe

import com.peknight.crypto.algorithm.cipher.Cipher
import com.peknight.crypto.algorithm.digest.Digest

trait PBEWithDigestAndEncryption extends PBE:
  def digest: Digest
  def encryption: Cipher
  override def algorithm: String = s"PBEWith${digest.abbreviation}And${encryption.abbreviation}"
end PBEWithDigestAndEncryption
object PBEWithDigestAndEncryption:
  private[this] case class PBEWithDigestAndEncryption(digest: Digest, encryption: Cipher)
    extends com.peknight.crypto.algorithm.pbe.PBEWithDigestAndEncryption
  def apply(digest: Digest, encryption: Cipher): com.peknight.crypto.algorithm.pbe.PBEWithDigestAndEncryption =
    PBEWithDigestAndEncryption(digest, encryption)
end PBEWithDigestAndEncryption
