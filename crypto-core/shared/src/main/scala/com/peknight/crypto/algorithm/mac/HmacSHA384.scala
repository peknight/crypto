package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-384`}

object HmacSHA384 extends HmacSHA2:
  val digest: Digest = `SHA-384`
end HmacSHA384
