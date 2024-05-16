package com.peknight.crypto.algorithm.key.agreement

import com.peknight.crypto.algorithm.cipher.asymmetric.Asymmetric

trait DiffieHellman extends KeyAgreement with Asymmetric:
  val algorithm: String = "DiffieHellman"
end DiffieHellman
object DiffieHellman extends DiffieHellman
