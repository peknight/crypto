package com.peknight.crypto.algorithm.mac

trait HmacPBESHA extends Hmac:
  override def algorithm: String = s"HmacPBE${digest.abbreviation}"
end HmacPBESHA
