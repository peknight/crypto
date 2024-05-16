package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-512_224`}

object HmacSHA512_224 extends HmacSHA2:
  val digest: Digest = `SHA-512_224`
end HmacSHA512_224
