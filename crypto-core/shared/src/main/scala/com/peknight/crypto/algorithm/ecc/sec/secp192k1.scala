package com.peknight.crypto.algorithm.ecc.sec

import com.peknight.crypto.algorithm.ecc.curve.Koblitz
import com.peknight.crypto.algorithm.ecc.field.Prime

object secp192k1 extends StandardsForEfficientCryptography with Prime with Koblitz:
  def bitLength: Int = 192
  def curveOrder: Int = 1
end secp192k1
