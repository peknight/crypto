package com.peknight.crypto.effect.cipher.syntax

import cats.effect.Sync

import javax.crypto.Cipher

trait CipherSyntax:
  extension (cipher: Cipher)
    def initF[F[_]: Sync](): F[Unit] = Sync[F].blocking(cipher.init())
  end extension
end CipherSyntax
object CipherSyntax extends CipherSyntax
