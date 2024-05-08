package com.peknight.crypto

case class Transformation(algorithm: Algorithm, mode: Option[Mode], padding: Option[Padding]):
  def transformation: String =
    (mode, padding) match
      case (Some(mode), Some(padding)) => s"${algorithm.algorithm}/${mode.mode}/${padding.padding}"
      case (Some(mode), None) => s"${algorithm.algorithm}/${mode.mode}"
      case (None, Some(padding)) => s"${algorithm.algorithm}//${padding.padding}"
      case (None, None) => algorithm.algorithm

  def /(mode: Mode): Transformation = copy(mode = Some(mode))
  def /(padding: Padding): Transformation = copy(padding = Some(padding))
end Transformation
