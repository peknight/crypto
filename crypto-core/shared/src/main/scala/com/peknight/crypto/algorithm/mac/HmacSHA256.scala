package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-256`}

object HmacSHA256 extends HmacSHA2:
  val digest: Digest = `SHA-256`
end HmacSHA256
