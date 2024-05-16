package com.peknight.crypto.algorithm.ssa
import com.peknight.crypto.algorithm.cipher.padding.{PSS, Padding}

trait `RSASSA-PSS` extends RSASSA:
  override val padding: Padding = PSS
end `RSASSA-PSS`
object `RSASSA-PSS` extends `RSASSA-PSS`