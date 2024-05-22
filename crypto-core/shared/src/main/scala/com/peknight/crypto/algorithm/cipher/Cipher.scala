package com.peknight.crypto.algorithm.cipher

import com.peknight.crypto.algorithm.cipher.mode.Mode
import com.peknight.crypto.algorithm.cipher.padding.{NoPadding, Padding}
import com.peknight.crypto.algorithm.{Algorithm, NONE}

trait Cipher extends Algorithm with Transformation:
  def cipherForTransformation: Cipher = this
  def mode: Mode = NONE
  def padding: Padding = NoPadding
  def /(mode: Mode): Transformation = Transformation(cipherForTransformation, mode, padding)
  def /(padding: Padding): Transformation = Transformation(cipherForTransformation, mode, padding)
end Cipher
