package com.peknight.crypto.algorithm.ecc.sec

import com.peknight.crypto.algorithm.ecc.curve.Koblitz
import com.peknight.crypto.algorithm.ecc.field.Binary

object sect233k1 extends StandardsForEfficientCryptography with Binary with Koblitz:
  def bitLength: Int = 233
  def curveOrder: Int = 1
end sect233k1
