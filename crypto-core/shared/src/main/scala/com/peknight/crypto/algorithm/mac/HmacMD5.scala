package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, MD5}

object HmacMD5 extends Hmac:
  val digest: Digest = MD5
end HmacMD5
