package com.peknight.crypto.algorithm.ssa
import com.peknight.crypto.algorithm.cipher.padding.{PSS, Padding}

object `RSASSA-PSS` extends RSASSA:
  override val padding: Padding = PSS
end `RSASSA-PSS`
