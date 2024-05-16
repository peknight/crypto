package com.peknight.crypto.algorithm.pkix

import com.peknight.crypto.algorithm.Algorithm

trait PKIX extends Algorithm:
  val algorithm: String = "PKIX"
end PKIX
object PKIX extends PKIX
