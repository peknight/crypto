package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-512_256`}

object HmacPBESHA512_256 extends HmacPBESHA2:
  def digest: Digest = `SHA-512_256`
end HmacPBESHA512_256

