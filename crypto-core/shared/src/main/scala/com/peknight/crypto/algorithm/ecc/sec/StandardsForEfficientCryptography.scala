package com.peknight.crypto.algorithm.ecc.sec

import com.peknight.crypto.algorithm.ecc.EllipticCurve
import com.peknight.crypto.algorithm.ecc.curve.CurveType
import com.peknight.crypto.algorithm.ecc.field.FieldType

trait StandardsForEfficientCryptography extends EllipticCurve with FieldType with CurveType:
  def bitLength: Int
  def curveOrder: Int
  def name: String = s"sec${fieldType}${bitLength}${curveType}${curveOrder}"
end StandardsForEfficientCryptography
