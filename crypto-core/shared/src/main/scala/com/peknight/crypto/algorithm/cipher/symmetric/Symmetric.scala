package com.peknight.crypto.algorithm.cipher.symmetric

import com.peknight.crypto.algorithm.cipher.Cipher
import com.peknight.crypto.algorithm.cipher.symmetric.aead.AEAD
import com.peknight.crypto.algorithm.mac.MAC

trait Symmetric extends Cipher:
  private[crypto] def -(mac: MAC): AEAD = AEAD(this, mac)
end Symmetric
