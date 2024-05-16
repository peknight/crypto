package com.peknight.crypto.algorithm.ssa

/**
 * Elliptic Curve Digital Signature Algorithm
 */
object ECDSA extends DSA:
  def algorithm: String = "ECDSA"
end ECDSA
