package com.peknight.crypto.algorithm.ssl

import com.peknight.crypto.algorithm.Algorithm

trait SSL extends Algorithm

object SSL extends SSL:
  val algorithm: String = "SSL"
end SSL