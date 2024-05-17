package com.peknight.crypto.algorithm.key.agreement

import com.peknight.crypto.algorithm.cipher.asymmetric.Asymmetric

trait DiffieHellman extends KeyAgreement with Asymmetric
object DiffieHellman extends DiffieHellman:
  val algorithm: String = "DiffieHellman"
end DiffieHellman
