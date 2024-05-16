package com.peknight.crypto.algorithm

import com.peknight.crypto.algorithm.cipher.asymmetric.RSA
import com.peknight.crypto.algorithm.digest.*
import com.peknight.crypto.algorithm.format.P1363
import com.peknight.crypto.algorithm.ssa.{DSA, ECDSA, RSA_PSS}
import com.peknight.crypto.algorithm.cipher.mgf.MGF1

package object signature:
  val NONEwithRSA: DigestWithEncryption = NONE.withEncryption(RSA)
  val MD2withRSA: DigestWithEncryption = MD2.withEncryption(RSA)
  val MD5withRSA: DigestWithEncryption = MD5.withEncryption(RSA)
  val SHA1withRSA: DigestWithEncryption = `SHA-1`.withEncryption(RSA)
  val SHA224withRSA: DigestWithEncryption = `SHA-224`.withEncryption(RSA)
  val SHA256withRSA: DigestWithEncryption = `SHA-256`.withEncryption(RSA)
  val SHA384withRSA: DigestWithEncryption = `SHA-384`.withEncryption(RSA)
  val SHA512withRSA: DigestWithEncryption = `SHA-512`.withEncryption(RSA)
  val SHA512_224withRSA: DigestWithEncryption = `SHA-512_224`.withEncryption(RSA)
  val SHA512_256withRSA: DigestWithEncryption = `SHA-512_256`.withEncryption(RSA)
  val `SHA3-224withRSA`: DigestWithEncryption = `SHA3-224`.withEncryption(RSA)
  val `SHA3-256withRSA`: DigestWithEncryption = `SHA3-256`.withEncryption(RSA)
  val `SHA3-384withRSA`: DigestWithEncryption = `SHA3-384`.withEncryption(RSA)
  val `SHA3-512withRSA`: DigestWithEncryption = `SHA3-512`.withEncryption(RSA)

  val NONEwithDSA: DigestWithEncryption = NONE.withEncryption(DSA)
  val SHA1withDSA: DigestWithEncryption = `SHA-1`.withEncryption(DSA)
  val SHA224withDSA: DigestWithEncryption = `SHA-224`.withEncryption(DSA)
  val SHA256withDSA: DigestWithEncryption = `SHA-256`.withEncryption(DSA)
  val SHA384withDSA: DigestWithEncryption = `SHA-384`.withEncryption(DSA)
  val SHA512withDSA: DigestWithEncryption = `SHA-512`.withEncryption(DSA)
  val `SHA3-224withDSA`: DigestWithEncryption = `SHA3-224`.withEncryption(DSA)
  val `SHA3-256withDSA`: DigestWithEncryption = `SHA3-256`.withEncryption(DSA)
  val `SHA3-384withDSA`: DigestWithEncryption = `SHA3-384`.withEncryption(DSA)
  val `SHA3-512withDSA`: DigestWithEncryption = `SHA3-512`.withEncryption(DSA)

  val NONEwithECDSA: DigestWithEncryption = NONE.withEncryption(ECDSA)
  val SHA1withECDSA: DigestWithEncryption = `SHA-1`.withEncryption(ECDSA)
  val SHA224withECDSA: DigestWithEncryption = `SHA-224`.withEncryption(ECDSA)
  val SHA256withECDSA: DigestWithEncryption = `SHA-256`.withEncryption(ECDSA)
  val SHA384withECDSA: DigestWithEncryption = `SHA-384`.withEncryption(ECDSA)
  val SHA512withECDSA: DigestWithEncryption = `SHA-512`.withEncryption(ECDSA)
  val `SHA3-224withECDSA`: DigestWithEncryption = `SHA3-224`.withEncryption(ECDSA)
  val `SHA3-256withECDSA`: DigestWithEncryption = `SHA3-256`.withEncryption(ECDSA)
  val `SHA3-384withECDSA`: DigestWithEncryption = `SHA3-384`.withEncryption(ECDSA)
  val `SHA3-512withECDSA`: DigestWithEncryption = `SHA3-512`.withEncryption(ECDSA)

  val NONEwithDSAinP1363Format: DigestWithEncryption = NONEwithDSA.format(Some(P1363))
  val SHA1withDSAinP1363Format: DigestWithEncryption = SHA1withDSA.format(Some(P1363))
  val SHA224withDSAinP1363Format: DigestWithEncryption = SHA224withDSA.format(Some(P1363))
  val SHA256withDSAinP1363Format: DigestWithEncryption = SHA256withDSA.format(Some(P1363))
  val SHA384withDSAinP1363Format: DigestWithEncryption = SHA384withDSA.format(Some(P1363))
  val SHA512withDSAinP1363Format: DigestWithEncryption = SHA512withDSA.format(Some(P1363))
  val `SHA3-224withDSAinP1363Format`: DigestWithEncryption = `SHA3-224withDSA`.format(Some(P1363))
  val `SHA3-256withDSAinP1363Format`: DigestWithEncryption = `SHA3-256withDSA`.format(Some(P1363))
  val `SHA3-384withDSAinP1363Format`: DigestWithEncryption = `SHA3-384withDSA`.format(Some(P1363))
  val `SHA3-512withDSAinP1363Format`: DigestWithEncryption = `SHA3-512withDSA`.format(Some(P1363))

  val NONEwithECDSAinP1363Format: DigestWithEncryption = NONEwithECDSA.format(Some(P1363))
  val SHA1withECDSAinP1363Format: DigestWithEncryption = SHA1withECDSA.format(Some(P1363))
  val SHA224withECDSAinP1363Format: DigestWithEncryption = SHA224withECDSA.format(Some(P1363))
  val SHA256withECDSAinP1363Format: DigestWithEncryption = SHA256withECDSA.format(Some(P1363))
  val SHA384withECDSAinP1363Format: DigestWithEncryption = SHA384withECDSA.format(Some(P1363))
  val SHA512withECDSAinP1363Format: DigestWithEncryption = SHA512withECDSA.format(Some(P1363))
  val `SHA3-224withECDSAinP1363Format`: DigestWithEncryption = `SHA3-224withECDSA`.format(Some(P1363))
  val `SHA3-256withECDSAinP1363Format`: DigestWithEncryption = `SHA3-256withECDSA`.format(Some(P1363))
  val `SHA3-384withECDSAinP1363Format`: DigestWithEncryption = `SHA3-384withECDSA`.format(Some(P1363))
  val `SHA3-512withECDSAinP1363Format`: DigestWithEncryption = `SHA3-512withECDSA`.format(Some(P1363))

  val SHA256withRSA_PSSandMGF1: DigestWithEncryption = `SHA-256`.withEncryption(RSA_PSS).mgf(Some(MGF1))
  val SHA384withRSA_PSSandMGF1: DigestWithEncryption = `SHA-384`.withEncryption(RSA_PSS).mgf(Some(MGF1))
  val SHA512withRSA_PSSandMGF1: DigestWithEncryption = `SHA-512`.withEncryption(RSA_PSS).mgf(Some(MGF1))
end signature
