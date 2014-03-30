sbtPlugin := true

name := "sbt-typelevel"

organization := "org.typelevel"

version := "0.1-SNAPSHOT"

// This is both a plugin and a meta-plugin

addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8.1")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.3")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.6")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.3.1")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "0.2.1")
