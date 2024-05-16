package com.peknight.crypto.algorithm.ecc

import com.peknight.crypto.algorithm.cipher.Cipher

/**
 * Elliptic Curve Integrated Encryption Scheme
 */
object ECIES extends Cipher:
  val algorithm: String = "ECIES"
end ECIES
