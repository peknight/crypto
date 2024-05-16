package com.peknight.crypto.algorithm.key.kem

/**
 * DH-Based KEM as defined in RFC 9180.
 */
object DHKEM extends KEM:
  val algorithm: String = "DHKEM"
end DHKEM
