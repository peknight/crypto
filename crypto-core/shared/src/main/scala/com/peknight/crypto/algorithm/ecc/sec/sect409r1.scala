package com.peknight.crypto.algorithm.ecc.sec

import com.peknight.crypto.algorithm.ecc.curve.Random
import com.peknight.crypto.algorithm.ecc.field.Binary

object sect409r1 extends StandardsForEfficientCryptography with Binary with Random:
  def bitLength: Int = 409
  def curveOrder: Int = 1
end sect409r1
