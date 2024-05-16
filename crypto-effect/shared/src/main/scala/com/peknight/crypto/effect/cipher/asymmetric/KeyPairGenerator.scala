package com.peknight.crypto.effect.cipher.asymmetric

import cats.effect.Sync
import com.peknight.crypto.algorithm.Algorithm
import com.peknight.crypto.provider.Provider

import java.security.KeyPairGenerator as JKeyPairGenerator

object KeyPairGenerator:
  def getInstance[F[_]: Sync](algorithm: Algorithm, provider: Provider): F[JKeyPairGenerator] =
    Sync[F].blocking(JKeyPairGenerator.getInstance(algorithm.algorithm, provider.name))
end KeyPairGenerator
