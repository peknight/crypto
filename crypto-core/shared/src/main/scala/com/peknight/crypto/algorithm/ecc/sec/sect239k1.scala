package com.peknight.crypto.algorithm.ecc.sec

import com.peknight.crypto.algorithm.ecc.curve.Koblitz
import com.peknight.crypto.algorithm.ecc.field.Binary

object sect239k1 extends StandardsForEfficientCryptography with Binary with Koblitz:
  def bitLength: Int = 239
  def curveOrder: Int = 1
end sect239k1
