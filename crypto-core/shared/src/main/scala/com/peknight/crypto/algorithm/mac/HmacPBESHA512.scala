package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-512`}

object HmacPBESHA512 extends HmacPBESHA2:
  def digest: Digest = `SHA-512`
end HmacPBESHA512

