package com.peknight.crypto.algorithm.key.pbk

import com.peknight.crypto.algorithm.random.PRF

trait PBKDF2WithPRF extends PBKDF2:
  def prf: PRF
  override def algorithm: String = s"PBKDF2With${prf.prf}"
end PBKDF2WithPRF
object PBKDF2WithPRF:
  private[this] case class PBKDFWithPRF(prf: PRF) extends com.peknight.crypto.algorithm.key.pbk.PBKDF2WithPRF
  def apply(prf: PRF): com.peknight.crypto.algorithm.key.pbk.PBKDF2WithPRF = PBKDFWithPRF(prf)
end PBKDF2WithPRF
