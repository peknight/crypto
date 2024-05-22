package com.peknight.crypto.algorithm.ecc.brainpool

object brainpoolP256r1 extends Brainpool:
  def bitLength: Int = 256
  def curveOrder: Int = 1
end brainpoolP256r1
