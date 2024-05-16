package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA3-224`}

object `HmacSHA3-224` extends HmacSHA3:
  val digest: Digest = `SHA3-224`
end `HmacSHA3-224`
