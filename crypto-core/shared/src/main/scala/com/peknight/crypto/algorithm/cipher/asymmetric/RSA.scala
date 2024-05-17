package com.peknight.crypto.algorithm.cipher.asymmetric

/**
 * Rivest–Shamir–Adleman
 */
trait RSA extends Asymmetric
object RSA extends RSA:
  val algorithm: String = "RSA"
end RSA
