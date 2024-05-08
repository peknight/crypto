package com.peknight.crypto.asymmetric.ecc

enum EllipticCurveName(val name: String):
  case secp384r1 extends EllipticCurveName("secp384r1")
end EllipticCurveName