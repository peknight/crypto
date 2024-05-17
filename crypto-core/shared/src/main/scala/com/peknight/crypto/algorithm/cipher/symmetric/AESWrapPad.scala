package com.peknight.crypto.algorithm.cipher.symmetric

import com.peknight.crypto.algorithm.cipher.Cipher
import com.peknight.crypto.algorithm.cipher.mode.{KWP, Mode}
import com.peknight.crypto.algorithm.cipher.padding.{NoPadding, Padding}

trait AESWrapPad extends AES:
  override val cipherForTransformation: Cipher = AES
  override val mode: Mode = KWP
  override val padding: Padding = NoPadding
end AESWrapPad
object AESWrapPad extends AESWrapPad:
  val keySize: Int = 128
  val algorithm: String = "AESWrapPad"
end AESWrapPad
