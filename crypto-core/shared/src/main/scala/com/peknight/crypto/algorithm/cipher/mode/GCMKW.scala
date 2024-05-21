package com.peknight.crypto.algorithm.cipher.mode

object GCMKW extends GCM with KW:
  override val mode: String = "GCM"
  override def abbreviation: String = "GCMKW"
end GCMKW
