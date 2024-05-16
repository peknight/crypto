package com.peknight.crypto.algorithm.random

/**
 * An algorithm using DRBG mechanisms as defined in NIST SP 800-90Ar1.
 */
object DRBG extends SecureRandom:
  val algorithm: String = "DRBG"
end DRBG
