package com.peknight.crypto.algorithm.cipher.mgf

/**
 * Mask Generation Function
 */
trait MGF derives CanEqual:
  def mgf: String
end MGF
