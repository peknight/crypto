package com.peknight.crypto.effect.spec

import cats.effect.Sync
import com.peknight.crypto.algorithm.Algorithm
import scodec.bits.ByteVector

import javax.crypto.spec.SecretKeySpec as JSecretKeySpec

object SecretKeySpec:
  def apply[F[_]: Sync](key: ByteVector, algorithm: Algorithm): F[JSecretKeySpec] =
    Sync[F].blocking(new JSecretKeySpec(key.toArray, algorithm.algorithm))
end SecretKeySpec
