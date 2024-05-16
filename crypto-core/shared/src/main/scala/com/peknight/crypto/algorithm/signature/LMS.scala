package com.peknight.crypto.algorithm.signature

/**
 * Leighton-Micali Signature)
 */
trait LMS extends Signature:
  val algorithm: String = "LMS"
end LMS
object LMS extends LMS
