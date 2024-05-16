package com.peknight.crypto.algorithm.cipher.asymmetric

/**
 * Elliptic Curve
 */
trait EC extends Asymmetric:
  val algorithm: String = "EC"
end EC
object EC extends EC
