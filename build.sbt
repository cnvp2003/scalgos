name := "scalgos"

version := "0.0.1"

scalaVersion := "2.10.3"

ScoverageSbtPlugin.instrumentSettings

CoverallsPlugin.coverallsSettings

scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature",
  "-language:postfixOps", "-language:implicitConversions", "-language:experimental.macros", "-language:dynamics"
)

libraryDependencies ++= Seq("org.specs2" % "specs2_2.10" % "2.3.11" % "test")

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-reflect" % _)
