package com.peknight.crypto.algorithm.cipher.mode

import com.peknight.crypto.algorithm.Algorithm

/**
 * Galois/Counter Mode
 */
trait GCM extends Mode with Algorithm:
  val mode: String = "GCM"
  val algorithm: String = mode
end GCM
object GCM extends GCM
