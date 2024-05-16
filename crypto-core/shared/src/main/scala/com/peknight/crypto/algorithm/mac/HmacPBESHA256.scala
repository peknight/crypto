package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-256`}

object HmacPBESHA256 extends HmacPBESHA2:
  def digest: Digest = `SHA-256`
end HmacPBESHA256

