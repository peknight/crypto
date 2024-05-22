package com.peknight.crypto.algorithm.ecc.sec

import com.peknight.crypto.algorithm.ecc.curve.Random
import com.peknight.crypto.algorithm.ecc.field.Prime

object secp160r2 extends StandardsForEfficientCryptography with Prime with Random:
  def bitLength: Int = 160
  def curveOrder: Int = 2
end secp160r2
