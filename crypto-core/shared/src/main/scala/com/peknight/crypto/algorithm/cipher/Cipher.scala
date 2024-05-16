package com.peknight.crypto.algorithm.cipher

import com.peknight.crypto.algorithm.Algorithm
import com.peknight.crypto.algorithm.cipher.mode.{Mode, NONE}
import com.peknight.crypto.algorithm.cipher.padding.{NoPadding, Padding}

trait Cipher extends Algorithm with Transformation:
  def cipherForTransformation: Cipher = this
  def mode: Mode = NONE
  def padding: Padding = NoPadding
  def /(mode: Mode): Transformation = Transformation(cipherForTransformation, mode, padding)
  def /(padding: Padding): Transformation = Transformation(cipherForTransformation, mode, padding)
end Cipher
