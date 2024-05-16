package com.peknight.crypto.algorithm.key.agreement

/**
 * Diffie-Hellman key agreement with elliptic curves as defined in RFC 7748.
 */
object XDH extends DiffieHellman:
  override val algorithm: String = "XDH"
end XDH
