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
