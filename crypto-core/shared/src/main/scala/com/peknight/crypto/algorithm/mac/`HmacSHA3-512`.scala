package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA3-512`}

object `HmacSHA3-512` extends HmacSHA3:
  val digest: Digest = `SHA3-512`
end `HmacSHA3-512`
