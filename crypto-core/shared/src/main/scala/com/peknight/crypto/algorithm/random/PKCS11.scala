package com.peknight.crypto.algorithm.random

/**
 * Obtains random numbers from the underlying installed and configured PKCS #11 library.
 */
object PKCS11 extends SecureRandom:
  val algorithm: String = "PKCS11"
end PKCS11
