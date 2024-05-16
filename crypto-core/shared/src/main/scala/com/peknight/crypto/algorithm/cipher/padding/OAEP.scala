package com.peknight.crypto.algorithm.cipher.padding

import com.peknight.crypto.algorithm.Algorithm
import com.peknight.crypto.algorithm.cipher.mgf.MGF
import com.peknight.crypto.algorithm.digest.Digest

trait OAEP extends Padding
object OAEP extends OAEP with Algorithm:
  val padding: String = "OAEPPadding"
  val algorithm: String = "OAEP"
  def withDigestAndMGF(digest: Digest, mgf: MGF): OAEPWithDigestAndMGFPadding = OAEPWithDigestAndMGFPadding(digest, mgf)
end OAEP
