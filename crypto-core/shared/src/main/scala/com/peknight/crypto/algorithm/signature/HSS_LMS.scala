package com.peknight.crypto.algorithm.signature

/**
 * Leighton-Micali Signature (LMS) system with the Hierarchical Signature System (HSS)
 */
object HSS_LMS extends HSS:
  override val algorithm: String = "HSS/LMS"
end HSS_LMS
