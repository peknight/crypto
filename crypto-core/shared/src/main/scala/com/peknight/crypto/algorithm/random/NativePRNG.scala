package com.peknight.crypto.algorithm.random

/**
 * Obtains random numbers from the underlying native OS. No assertions are made as to the blocking nature of generating
 * these numbers.
 */
trait NativePRNG extends SecureRandom
object NativePRNG extends NativePRNG:
  val algorithm: String = "NativePRNG"
end NativePRNG
