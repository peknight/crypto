package com.peknight.crypto.algorithm.mac
import com.peknight.crypto.algorithm.digest.{Digest, `SHA-1`}

object HmacSHA1 extends HmacSHA:
  def digest: Digest = `SHA-1`
end HmacSHA1
