package com.peknight.crypto.algorithm.cipher.padding

import com.peknight.crypto.algorithm.cipher.mgf.MGF
import com.peknight.crypto.algorithm.digest.Digest

trait OAEPWithDigestAndMGFPadding extends OAEP:
  def digest: Digest
  def mgf: MGF
  override def padding: String = s"OAEPWith${digest.abbreviation}And${mgf.mgf}Padding"
end OAEPWithDigestAndMGFPadding
object OAEPWithDigestAndMGFPadding:
  private[this] case class OAEPWithDigestAndMGFPadding(digest: Digest, mgf: MGF)
    extends com.peknight.crypto.algorithm.cipher.padding.OAEPWithDigestAndMGFPadding
  def apply(digest: Digest, mgf: MGF): com.peknight.crypto.algorithm.cipher.padding.OAEPWithDigestAndMGFPadding =
    OAEPWithDigestAndMGFPadding(digest, mgf)
end OAEPWithDigestAndMGFPadding
