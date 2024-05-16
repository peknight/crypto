package com.peknight.crypto.algorithm.cipher.padding

/**
 * The padding scheme described in PKCS #5: Password-Based Cryptography Specification, version 2.1.
 */
object PKCS5Padding extends PKCSPadding:
  val padding: String = "PKCS5Padding"
end PKCS5Padding
