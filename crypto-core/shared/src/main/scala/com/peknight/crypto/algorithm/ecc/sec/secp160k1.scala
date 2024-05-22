package com.peknight.crypto.algorithm.ecc.sec

import com.peknight.crypto.algorithm.ecc.curve.Koblitz
import com.peknight.crypto.algorithm.ecc.field.Prime

object secp160k1 extends StandardsForEfficientCryptography with Prime with Koblitz:
  def bitLength: Int = 160
  def curveOrder: Int = 1
end secp160k1
