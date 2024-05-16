package com.peknight.crypto.algorithm.key.agreement

/**
 * Diffie-Hellman key agreement with Curve25519 as defined in RFC 7748.
 */
object X25519 extends DiffieHellman:
  override val algorithm: String = "X25519"
end X25519
