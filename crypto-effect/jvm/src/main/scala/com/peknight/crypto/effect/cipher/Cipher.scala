package com.peknight.crypto.effect.cipher

import cats.effect.Sync
import com.peknight.crypto.algorithm.cipher.Transformation
import com.peknight.crypto.provider.Provider

import java.security.Provider as JProvider
import javax.crypto.Cipher as JCipher

object Cipher:
  def getInstance[F[_]: Sync](transformation: Transformation): F[JCipher] =
    Sync[F].blocking(JCipher.getInstance(transformation.transformation))
  def getInstance[F[_]: Sync](transformation: Transformation, provider: Provider): F[JCipher] =
    Sync[F].blocking(JCipher.getInstance(transformation.transformation, provider.name))
  def getInstance[F[_]: Sync](transformation: Transformation, provider: JProvider): F[JCipher] =
    Sync[F].blocking(JCipher.getInstance(transformation.transformation, provider))
end Cipher
