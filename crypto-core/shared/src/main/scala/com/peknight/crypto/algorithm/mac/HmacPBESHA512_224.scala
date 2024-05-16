package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-512_224`}

object HmacPBESHA512_224 extends HmacPBESHA2:
  def digest: Digest = `SHA-512_224`
end HmacPBESHA512_224

