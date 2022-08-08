ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

val mainClassName = "com.github.zjjfly.bootstrap"

lazy val root = (project in file("."))
  .enablePlugins(NativeImagePlugin)
  .settings(
    name := "scala-3-template",
    libraryDependencies ++= Seq(
      "org.specs2" %% "specs2-core" % "5.0.7" % Test
    ),
    idePackagePrefix     := Some("com.github.zjjfly"),
    assembly / mainClass := Some(mainClassName),
    Compile / mainClass  := Some(mainClassName),
    // make sure GRAAL_HOME or GRAALVM_HOME in env
    nativeImageInstalled := true
  )
