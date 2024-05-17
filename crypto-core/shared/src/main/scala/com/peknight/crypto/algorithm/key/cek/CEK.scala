package com.peknight.crypto.algorithm.key.cek

trait CEK:
  def cek: String
end CEK
object CEK extends CEK:
  val cek: String = "CEK"
end CEK
