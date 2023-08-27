name := "hello-explicitnulls-scala"

version := "0.1"

scalaVersion := "3.3.0"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Yexplicit-nulls")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.16" % Test
