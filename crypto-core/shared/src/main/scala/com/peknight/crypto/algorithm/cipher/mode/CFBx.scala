package com.peknight.crypto.algorithm.cipher.mode

trait CFBx extends CFB:
  override val mode: String = s"CFB$bits"
  def bits: Int
end CFBx
object CFBx:
  private[this] case class CFBx(bits: Int) extends com.peknight.crypto.algorithm.cipher.mode.CFBx
  def apply(bits: Int): com.peknight.crypto.algorithm.cipher.mode.CFBx = CFBx(bits)
end CFBx
