package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.Digest
import com.peknight.crypto.algorithm.random.PRF

/**
 * Hash-based Message Authentication Code
 */
trait Hmac extends MAC with PRF:
  def digest: Digest
  def algorithm: String = s"Hmac${digest.abbreviation}"
  def prf: String = algorithm
end Hmac
