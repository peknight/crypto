package com.peknight.crypto.algorithm.ecc.sec

import com.peknight.crypto.algorithm.ecc.curve.Random
import com.peknight.crypto.algorithm.ecc.field.Binary

object sect193r1 extends StandardsForEfficientCryptography with Binary with Random:
  def bitLength: Int = 193
  def curveOrder: Int = 1
end sect193r1
