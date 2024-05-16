package com.peknight.crypto.algorithm.random

/**
 * Obtains random numbers from the underlying Windows OS.
 */
object `Windows-PRNG` extends SecureRandom:
  val algorithm: String = "Windows-PRNG"
end `Windows-PRNG`
