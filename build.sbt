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
    cryptoBouncyCastleProvider.jvm,
    cryptoBouncyCastleProvider.js,
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

val catsEffectVersion = "3.5.1"
val bouncyCastleVersion = "1.78.1"

val bouncyCastleProvider = "org.bouncycastle" % "bcprov-jdk18on" % bouncyCastleVersion
