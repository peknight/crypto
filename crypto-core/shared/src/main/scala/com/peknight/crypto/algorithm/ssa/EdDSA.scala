package com.peknight.crypto.algorithm.ssa

import com.peknight.crypto.algorithm.signature.Signature

/**
 * Edwards-Curve signature algorithm with elliptic curves
 */
trait EdDSA extends DSA with Signature:
  override val algorithm: String = "EdDSA"
end EdDSA
object EdDSA extends EdDSA
