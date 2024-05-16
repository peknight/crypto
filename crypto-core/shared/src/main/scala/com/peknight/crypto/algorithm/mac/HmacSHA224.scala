package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-224`}

object HmacSHA224 extends HmacSHA2:
  val digest: Digest = `SHA-224`
end HmacSHA224
