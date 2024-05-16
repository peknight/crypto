package com.peknight.crypto.bouncycastle.jce

import cats.effect.Sync
import com.peknight.crypto.algorithm.ecc.EllipticCurve
import org.bouncycastle.jce.ECNamedCurveTable as JECNamedCurveTable
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec

object ECNamedCurveTable:
  def getParameterSpec[F[_]: Sync](name: EllipticCurve): F[ECNamedCurveParameterSpec] =
    Sync[F].blocking(JECNamedCurveTable.getParameterSpec(name.name))
end ECNamedCurveTable
