package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA3-256`}

object `HmacSHA3-256` extends HmacSHA3:
  val digest: Digest = `SHA3-256`
end `HmacSHA3-256`
