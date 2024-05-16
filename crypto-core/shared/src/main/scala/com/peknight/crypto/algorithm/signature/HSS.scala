package com.peknight.crypto.algorithm.signature

/**
 * Hierarchical Signature System
 */
trait HSS extends LMS:
  override val algorithm: String = "HSS"
end HSS
object HSS extends HSS
