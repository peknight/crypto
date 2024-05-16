package com.peknight.crypto.algorithm.random

/**
 * The name of the pseudo-random number generation (PRNG) algorithm supplied by the SUN provider.
 * This algorithm uses SHA-1 as the foundation of the PRNG.
 * It computes the SHA-1 hash over a true-random seed value concatenated with a 64-bit counter which is incremented
 * by 1 for each operation.
 * From the 160-bit SHA-1 output, only 64 bits are used.
 */
object SHA1PRNG extends SecureRandom:
  val algorithm: String = "SHA1PRNG"
end SHA1PRNG
