package com.peknight.crypto

sealed trait Algorithm:
  def algorithm: String
  def /(mode: Mode): Transformation = Transformation(this, Some(mode), None)
  def /(padding: Padding): Transformation = Transformation(this, None, Some(padding))
end Algorithm
object Algorithm:
  sealed trait Encryption extends Algorithm
  enum Symmetric(val algorithm: String) extends Encryption:
    case AES extends Symmetric("AES")
  end Symmetric
  enum Asymmetric(val algorithm: String) extends Encryption:
    case RSA extends Asymmetric("RSA")
    case ECDSA extends Asymmetric("ECDSA")
  end Asymmetric
  enum Hashing(val algorithm: String) extends Algorithm:
    case `SHA-1` extends Hashing("SHA-1")
  end Hashing
end Algorithm
