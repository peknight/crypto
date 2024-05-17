package com.peknight.crypto.algorithm.key.agreement

/**
 * Elliptic Curve Diffie-Hellman as defined in ANSI X9.63
 */
trait ECDH extends DiffieHellman
object ECDH extends ECDH:
  override val algorithm: String = "ECDH"
end ECDH
