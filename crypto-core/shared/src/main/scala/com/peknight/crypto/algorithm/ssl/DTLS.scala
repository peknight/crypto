package com.peknight.crypto.algorithm.ssl

import com.peknight.crypto.algorithm.Algorithm

trait DTLS extends Algorithm
object DTLS extends DTLS:
  val algorithm: String = "DTLS"
end DTLS
