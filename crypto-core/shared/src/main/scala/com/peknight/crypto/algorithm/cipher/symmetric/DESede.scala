package com.peknight.crypto.algorithm.cipher.symmetric

/**
 * Triple DES / 3DES
 */
trait DESede extends DES:
  override val algorithm: String = "DESede"
end DESede
object DESede extends DESede
