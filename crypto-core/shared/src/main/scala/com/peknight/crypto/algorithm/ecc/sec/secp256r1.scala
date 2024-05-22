package com.peknight.crypto.algorithm.ecc.sec

import com.peknight.crypto.algorithm.ecc.curve.Random
import com.peknight.crypto.algorithm.ecc.field.Prime

trait secp256r1 extends StandardsForEfficientCryptography with Prime with Random:
  def bitLength: Int = 256
  def curveOrder: Int = 1
end secp256r1
object secp256r1 extends secp256r1
