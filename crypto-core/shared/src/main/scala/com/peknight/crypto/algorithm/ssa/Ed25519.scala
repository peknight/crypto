package com.peknight.crypto.algorithm.ssa

/**
 * Edwards-Curve signature algorithm with Ed25519
 */
object Ed25519 extends EdDSA:
  override val algorithm: String = "Ed25519"
end Ed25519
