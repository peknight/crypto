package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA3-384`}

object `HmacSHA3-384` extends HmacSHA3:
  val digest: Digest = `SHA3-384`
end `HmacSHA3-384`
