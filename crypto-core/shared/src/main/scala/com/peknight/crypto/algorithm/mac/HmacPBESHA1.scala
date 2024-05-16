package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-1`}

object HmacPBESHA1 extends HmacPBESHA:
  val digest: Digest = `SHA-1`
end HmacPBESHA1
