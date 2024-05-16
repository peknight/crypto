package com.peknight.crypto.algorithm.signature

import com.peknight.crypto.algorithm.Algorithm
import com.peknight.crypto.algorithm.cipher.asymmetric.RSA
import com.peknight.crypto.algorithm.cipher.mgf.MGF
import com.peknight.crypto.algorithm.digest.{Digest, `SHA-2`}
import com.peknight.crypto.algorithm.format.Format
import com.peknight.crypto.algorithm.ssa.{ECDSA, `RSASSA-PSS`}

trait DigestWithEncryption extends Signature:
  def digest: Digest
  def encryption: Algorithm
  def mgf: Option[MGF]
  def format: Option[Format]
  def algorithm: String = s"${digest.abbreviation}with${encryption.abbreviation}${mgf.fold("")(f => s"and${f.mgf}")}${format.fold("")(f => s"in${f.format}Format")}"
  def mgf(mgf: Option[MGF]): DigestWithEncryption = DigestWithEncryption(digest, encryption, mgf, format)
  def format(format: Option[Format]): DigestWithEncryption = DigestWithEncryption(digest, encryption, mgf, format)
  override def abbreviation: String =
    (digest, encryption) match
      case (d: `SHA-2`, `RSASSA-PSS`) => s"PS${d.bitLength}"
      case (d: `SHA-2`, e: RSA) => s"RS${d.bitLength}"
      case (d: `SHA-2`, ECDSA) => s"ES${d.bitLength}"
      case _ => super.abbreviation
end DigestWithEncryption
object DigestWithEncryption:
  private[this] case class DigestWithEncryption(digest: Digest, encryption: Algorithm, mgf: Option[MGF],
                                                format: Option[Format])
    extends com.peknight.crypto.algorithm.signature.DigestWithEncryption
  def apply(digest: Digest, encryption: Algorithm, mgf: Option[MGF] = None, format: Option[Format] = None)
  : com.peknight.crypto.algorithm.signature.DigestWithEncryption =
    DigestWithEncryption(digest, encryption, mgf, format)
end DigestWithEncryption
