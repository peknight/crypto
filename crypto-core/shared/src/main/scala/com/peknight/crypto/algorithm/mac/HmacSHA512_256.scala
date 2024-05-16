package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-512_256`}

object HmacSHA512_256 extends HmacSHA2:
  val digest: Digest = `SHA-512_256`
end HmacSHA512_256
