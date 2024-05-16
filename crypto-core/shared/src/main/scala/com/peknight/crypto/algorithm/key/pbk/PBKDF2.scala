package com.peknight.crypto.algorithm.key.pbk

import com.peknight.crypto.algorithm.Algorithm
import com.peknight.crypto.algorithm.random.PRF

trait PBKDF2 extends Algorithm
object PBKDF2 extends PBKDF2:
  val algorithm: String = "PBKDF2"
  def withPRF(prf: PRF): PBKDF2WithPRF = PBKDF2WithPRF(prf)
end PBKDF2
