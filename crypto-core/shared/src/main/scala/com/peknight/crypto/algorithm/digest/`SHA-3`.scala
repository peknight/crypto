package com.peknight.crypto.algorithm.digest

trait `SHA-3` extends `SHA`:
  override def algorithm: String = s"SHA3-$bitLength"
end `SHA-3`
