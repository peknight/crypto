package com.peknight.crypto.algorithm

import com.peknight.crypto.algorithm.cipher.mode.Mode
import com.peknight.crypto.algorithm.digest.Digest

object NONE extends Digest with Mode:
  val bitLength: Int = 0
  val algorithm: String = "NONE"
  val mode: String = "NONE"
end NONE
