import com.typesafe.sbt.SbtNativePackager._
import com.typesafe.sbt.packager.Keys._

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

name := "gilt-trest"

version := "1.0-SNAPSHOT"
dockerRepository := Some("kyledorman")
maintainer in Docker := "Kyle Dorman <ked65@cornell.edu>"
version := "git describe --tags --dirty --always".!!
  .stripPrefix("v").trim