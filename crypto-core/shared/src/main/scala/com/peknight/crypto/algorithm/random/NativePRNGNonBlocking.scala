package com.peknight.crypto.algorithm.random

/**
 * 	Obtains random numbers from the underlying native OS, without blocking to prevent applications from excessive
 * 	stalling. For example, /dev/urandom on UNIX-like systems.
 */
object NativePRNGNonBlocking extends NativePRNG:
  val algorithm: String = "NativePRNGNonBlocking"
end NativePRNGNonBlocking
