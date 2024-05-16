package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-384`}

object HmacPBESHA384 extends HmacPBESHA2:
  def digest: Digest = `SHA-384`
end HmacPBESHA384

