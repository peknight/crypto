package com.peknight.crypto.algorithm.cipher.mode

trait OFBx extends OFB:
  override val mode: String = s"OFB$bits"
  def bits: Int
end OFBx
object OFBx:
  private[this] case class OFBx(bits: Int) extends com.peknight.crypto.algorithm.cipher.mode.OFBx
  def apply(bits: Int): com.peknight.crypto.algorithm.cipher.mode.OFBx = OFBx(bits)
end OFBx
