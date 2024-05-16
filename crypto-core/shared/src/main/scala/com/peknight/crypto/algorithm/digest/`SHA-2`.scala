package com.peknight.crypto.algorithm.digest

trait `SHA-2` extends SHA:
  override def algorithm: String = s"SHA-$bitLength${if bitLength == outputLength then "" else s"/$outputLength"}"
  override def abbreviation: String = s"SHA$bitLength${if bitLength == outputLength then "" else s"/$outputLength"}"
end `SHA-2`
