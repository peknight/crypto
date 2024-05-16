package com.peknight.crypto.algorithm.mac

trait PBEWithMAC extends MAC:
  def mac: MAC
  override def algorithm: String = s"PBEWith${mac.abbreviation}"
end PBEWithMAC
object PBEWithMAC:
  private[this] case class PBEWithMAC(mac: MAC) extends com.peknight.crypto.algorithm.mac.PBEWithMAC
  def apply(mac: MAC): com.peknight.crypto.algorithm.mac.PBEWithMAC = PBEWithMAC(mac)
end PBEWithMAC
