package com.peknight.crypto.algorithm.ssa

import com.peknight.crypto.algorithm.cipher.asymmetric.RSA
import com.peknight.crypto.algorithm.cipher.padding.Padding
import com.peknight.crypto.algorithm.signature.Signature

trait RSASSA extends RSA with SSA with Signature:
  override def algorithm: String = s"RSASSA-${padding.padding}"
end RSASSA
