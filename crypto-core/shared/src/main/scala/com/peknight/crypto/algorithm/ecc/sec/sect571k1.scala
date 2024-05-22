package com.peknight.crypto.algorithm.ecc.sec

import com.peknight.crypto.algorithm.ecc.curve.Koblitz
import com.peknight.crypto.algorithm.ecc.field.Binary


object sect571k1 extends StandardsForEfficientCryptography with Binary with Koblitz:
  def bitLength: Int = 571
  def curveOrder: Int = 1
end sect571k1
