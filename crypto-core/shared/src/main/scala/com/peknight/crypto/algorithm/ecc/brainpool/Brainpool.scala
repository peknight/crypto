package com.peknight.crypto.algorithm.ecc.brainpool

import com.peknight.crypto.algorithm.ecc.curve.Random
import com.peknight.crypto.algorithm.ecc.field.Prime

trait Brainpool extends EllipticCurve with Prime with Random:
  def bitLength: Int
  def curveOrder: Int
  def name: String = s"brainpool${fieldType.toUpperCase}${bitLength}${curveType}${curveOrder}"
end Brainpool
