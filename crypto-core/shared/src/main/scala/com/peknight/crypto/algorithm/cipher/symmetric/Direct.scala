package com.peknight.crypto.algorithm.cipher.symmetric

/**
 * Defined in JWE
 */
object Direct extends Symmetric:
  val algorithm: String = "Direct"
  override val abbreviation: String = "dir"
end Direct
