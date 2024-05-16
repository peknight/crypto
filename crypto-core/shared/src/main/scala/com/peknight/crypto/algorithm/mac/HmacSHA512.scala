package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-512`}

object HmacSHA512 extends HmacSHA2:
  val digest: Digest = `SHA-512`
end HmacSHA512
