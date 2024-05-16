package com.peknight.crypto.algorithm.key.agreement

/**
 * Elliptic Curve Menezes-Qu-Vanstone.
 */
object ECMQV extends KeyAgreement:
  val algorithm: String = "ECMQV"
end ECMQV
