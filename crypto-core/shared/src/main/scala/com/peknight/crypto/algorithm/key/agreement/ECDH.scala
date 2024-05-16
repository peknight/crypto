package com.peknight.crypto.algorithm.key.agreement

/**
 * Elliptic Curve Diffie-Hellman as defined in ANSI X9.63
 */
object ECDH extends DiffieHellman:
  override val algorithm: String = "ECDH"
end ECDH
