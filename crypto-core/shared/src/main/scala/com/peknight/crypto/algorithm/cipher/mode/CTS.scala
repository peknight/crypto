package com.peknight.crypto.algorithm.cipher.mode

/**
 * Cipher Text Stealing, as described in Bruce Schneier's book Applied Cryptography-Second Edition, John Wiley and Sons, 1996.
 */
object CTS extends Mode:
  val mode: String = "CTS"
end CTS
