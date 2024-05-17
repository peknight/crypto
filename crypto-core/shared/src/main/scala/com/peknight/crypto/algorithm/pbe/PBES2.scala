package com.peknight.crypto.algorithm.pbe

/**
 * Password-Based Encryption Scheme 2
 */
trait PBES2 extends PBE
object PBES2 extends PBES2:
  val algorithm: String = "PBES2"
end PBES2
