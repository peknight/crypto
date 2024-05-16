package com.peknight.crypto.algorithm.cipher

import com.peknight.crypto.algorithm.Algorithm
import com.peknight.crypto.algorithm.cipher.asymmetric.RSA
import com.peknight.crypto.algorithm.cipher.mode.{Mode, NONE}
import com.peknight.crypto.algorithm.cipher.padding.{NoPadding, OAEP, Padding}

trait Transformation extends Algorithm:
  def cipherForTransformation: Cipher
  def mode: Mode
  def padding: Padding
  def /(mode: Mode): Transformation
  def /(padding: Padding): Transformation
  def transformation: String = s"${cipherForTransformation.abbreviation}/${mode.mode}/${padding.padding}"
  override def abbreviation: String =
    (cipherForTransformation, padding) match
      case (r: RSA, p: OAEP) => "RSA-OAEP"
      case _ => super.abbreviation
end Transformation
object Transformation:
  private[this] case class Transformation(cipherForTransformation: Cipher, mode: Mode, padding: Padding)
    extends com.peknight.crypto.algorithm.cipher.Transformation:
    def algorithm: String = cipherForTransformation.algorithm
    def /(mode: Mode): Transformation = copy(mode = mode)
    def /(padding: Padding): Transformation = copy(padding = padding)
  end Transformation
  def apply(cipher: Cipher, mode: Mode = NONE, padding: Padding = NoPadding)
  : com.peknight.crypto.algorithm.cipher.Transformation =
    Transformation(cipher, mode, padding)
end Transformation
