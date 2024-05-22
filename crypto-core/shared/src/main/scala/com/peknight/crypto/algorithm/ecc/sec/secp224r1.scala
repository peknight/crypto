package com.peknight.crypto.algorithm.ecc.sec

import com.peknight.crypto.algorithm.ecc.curve.Random
import com.peknight.crypto.algorithm.ecc.field.Prime

object secp224r1 extends StandardsForEfficientCryptography with Prime with Random:
  def bitLength: Int = 224
  def curveOrder: Int = 1
end secp224r1
