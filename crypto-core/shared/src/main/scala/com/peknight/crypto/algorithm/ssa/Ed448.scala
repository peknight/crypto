package com.peknight.crypto.algorithm.ssa

/**
 * Edwards-Curve signature algorithm with Ed448
 */
object Ed448 extends EdDSA:
  override val algorithm: String = "Ed448"
end Ed448
