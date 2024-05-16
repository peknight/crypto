package com.peknight.crypto.algorithm.ssl

import com.peknight.crypto.algorithm.Algorithm

trait TLS extends Algorithm
object TLS extends TLS:
  val algorithm: String = "TLS"
end TLS
