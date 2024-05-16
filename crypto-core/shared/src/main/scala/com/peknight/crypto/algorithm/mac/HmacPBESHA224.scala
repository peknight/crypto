package com.peknight.crypto.algorithm.mac

import com.peknight.crypto.algorithm.digest.{Digest, `SHA-224`}

object HmacPBESHA224 extends HmacPBESHA2:
  def digest: Digest = `SHA-224`
end HmacPBESHA224

