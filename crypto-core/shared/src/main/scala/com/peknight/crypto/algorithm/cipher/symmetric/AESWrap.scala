package com.peknight.crypto.algorithm.cipher.symmetric

import com.peknight.crypto.algorithm.cipher.Cipher
import com.peknight.crypto.algorithm.cipher.mode.{KW, Mode}
import com.peknight.crypto.algorithm.cipher.padding.{NoPadding, Padding}

trait AESWrap extends AES:
  override val cipherForTransformation: Cipher = AES
  override val mode: Mode = KW
  override val padding: Padding = NoPadding
end AESWrap
object AESWrap extends AESWrap:
  val algorithm: String = "AESWrap"
end AESWrap
