package com.peknight.crypto.algorithm.key.agreement

import com.peknight.crypto.algorithm.key.kdf.{ConcatKDF, KDF}

/**
 * Defined in JWE
 */
trait `ECDH-ES` extends ECDH:
  val kdf: KDF = ConcatKDF
end `ECDH-ES`
object `ECDH-ES` extends `ECDH-ES`:
  val algorithm: String = "ECDH-ES"
end `ECDH-ES`
