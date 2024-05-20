ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

ThisBuild / organization := "com.peknight"

lazy val commonSettings = Seq(
  scalacOptions ++= Seq(
    "-feature",
    "-deprecation",
    "-unchecked",
    "-Xfatal-warnings",
    "-language:strictEquality",
    "-Xmax-inlines:64"
  ),
)

lazy val crypto = (project in file("."))
  .aggregate(
    cryptoCore.jvm,
    cryptoCore.js,
    cryptoEffect.jvm,
    cryptoEffect.js,
    cryptoBouncyCastleProvider.jvm,
    cryptoBouncyCastleProvider.js,
    cryptoBouncyCastlePkix.jvm,
    cryptoBouncyCastlePkix.js,
  )
  .settings(commonSettings)
  .settings(
    name := "crypto",
  )

lazy val cryptoCore = (crossProject(JSPlatform, JVMPlatform) in file("crypto-core"))
  .settings(commonSettings)
  .settings(
    name := "crypto-core",
    libraryDependencies ++= Seq(
      "com.peknight" %%% "codec-core" % pekCodecVersion,
      "org.scodec" %% "scodec-bits" % scodecVersion,
    ),
  )

lazy val cryptoEffect = (crossProject(JSPlatform, JVMPlatform) in file("crypto-effect"))
  .dependsOn(cryptoCore)
  .settings(commonSettings)
  .settings(
    name := "crypto-effect",
    libraryDependencies ++= Seq(
      "org.typelevel" %%% "cats-effect" % catsEffectVersion,
    ),
  )

lazy val cryptoBouncyCastleProvider = (crossProject(JSPlatform, JVMPlatform) in file("crypto-bcprov"))
  .dependsOn(cryptoCore)
  .settings(commonSettings)
  .settings(
    name := "crypto-bcprov",
    libraryDependencies ++= Seq(
      "org.typelevel" %%% "cats-effect" % catsEffectVersion,
    ),
  )
  .jvmSettings(
    libraryDependencies ++= Seq(
      bouncyCastleProvider,
    ),
  )

lazy val cryptoBouncyCastlePkix = (crossProject(JSPlatform, JVMPlatform) in file("crypto-bcpkix"))
  .settings(commonSettings)
  .settings(
    name := "crypto-bcpkix",
    libraryDependencies ++= Seq(
      "co.fs2" %%% "fs2-io" % fs2Version,
    ),
  )
  .jvmSettings(
    libraryDependencies ++= Seq(
      bouncyCastlePkix,
    ),
  )

val catsEffectVersion = "3.5.4"
val fs2Version = "3.10.2"
val bouncyCastleVersion = "1.78.1"
val scodecVersion = "1.2.0"
val pekVersion = "0.1.0-SNAPSHOT"
val pekCodecVersion = "0.1.0-SNAPSHOT"

val bouncyCastleProvider = "org.bouncycastle" % "bcprov-jdk18on" % bouncyCastleVersion
val bouncyCastlePkix = "org.bouncycastle" % "bcpkix-jdk18on" % bouncyCastleVersion
