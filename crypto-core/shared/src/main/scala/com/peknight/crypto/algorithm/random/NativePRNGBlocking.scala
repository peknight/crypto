package com.peknight.crypto.algorithm.random

/**
 * Obtains random numbers from the underlying native OS, blocking if necessary. For example, /dev/random on UNIX-like
 * systems.
 */
object NativePRNGBlocking extends NativePRNG:
  val algorithm: String = "NativePRNGBlocking"
end NativePRNGBlocking
