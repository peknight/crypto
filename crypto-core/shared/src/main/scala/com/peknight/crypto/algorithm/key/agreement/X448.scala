package com.peknight.crypto.algorithm.key.agreement

/**
 * Diffie-Hellman key agreement with Curve448 as defined in RFC 7748.
 */
object X448 extends DiffieHellman:
  override val algorithm: String = "X448"
end X448
