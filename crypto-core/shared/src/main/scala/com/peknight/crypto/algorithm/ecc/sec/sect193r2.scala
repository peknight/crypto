package com.peknight.crypto.algorithm.ecc.sec

import com.peknight.crypto.algorithm.ecc.curve.Random
import com.peknight.crypto.algorithm.ecc.field.Binary

object sect193r2 extends StandardsForEfficientCryptography with Binary with Random:
  def bitLength: Int = 193
  def curveOrder: Int = 2
end sect193r2
