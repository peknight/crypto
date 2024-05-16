package com.peknight.crypto.algorithm.digest

object `SHA-1` extends SHA:
  override val algorithm: String = "SHA-1"
  override val abbreviation: String = "SHA1"
  val bitLength: Int = 160
end `SHA-1`
