package com.peknight.crypto.certificate

import com.peknight.crypto.algorithm.key.encoding.KeyEncoding

/**
 * The certificate type defined in X.509, also specified in RFC 5280.
 */
object X509 extends CertificateType with KeyEncoding:
  val certType: String = "X.509"
  val encoding: String = certType
end X509
