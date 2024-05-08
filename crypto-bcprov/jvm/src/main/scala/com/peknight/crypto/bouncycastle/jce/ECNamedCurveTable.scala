package com.peknight.crypto.bouncycastle.jce

import cats.effect.Sync
import com.peknight.crypto.asymmetric.ecc.EllipticCurveName
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec
import org.bouncycastle.jce.ECNamedCurveTable as JECNamedCurveTable

object ECNamedCurveTable:
  def getParameterSpec[F[_]: Sync](name: EllipticCurveName): F[ECNamedCurveParameterSpec] =
    Sync[F].blocking(JECNamedCurveTable.getParameterSpec(name.name))
end ECNamedCurveTable
