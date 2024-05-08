package com.peknight.crypto.asymmetric

import cats.effect.Sync
import com.peknight.crypto.{Algorithm, Provider}

import java.security.KeyPairGenerator as JKeyPairGenerator

object KeyPairGenerator:
  def getInstance[F[_]: Sync](algorithm: Algorithm, provider: Provider): F[JKeyPairGenerator] =
    Sync[F].blocking(JKeyPairGenerator.getInstance(algorithm.algorithm, provider.name))
end KeyPairGenerator
