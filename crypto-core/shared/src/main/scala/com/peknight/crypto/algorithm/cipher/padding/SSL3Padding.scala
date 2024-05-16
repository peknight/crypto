package com.peknight.crypto.algorithm.cipher.padding

/**
 * The padding scheme defined in the SSL Protocol Version 3.0, November 18, 1996, section 5.2.3.2 (CBC block cipher)
 */
object SSL3Padding extends Padding:
  val padding: String = "SSL3Padding"
end SSL3Padding
