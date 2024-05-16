package com.peknight.crypto.algorithm.mac

trait HmacSHA2 extends HmacSHA:
  override def abbreviation: String = s"HS${digest.bitLength}"
end HmacSHA2

