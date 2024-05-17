package com.peknight.crypto.algorithm.ssa

import com.peknight.crypto.algorithm.cipher.padding.{Padding, `PKCS1-v1_5`}

object `RSASSA-PKCS1-v1_5` extends RSASSA:
  override val padding: Padding = `PKCS1-v1_5`
  override def abbreviation: String = "RSA1_5"
end `RSASSA-PKCS1-v1_5`
