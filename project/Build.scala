import sbt.Keys._
import sbt._

object MarsRoverProject extends Build {
	val Organization = "com.codurance"
	val Name = "cleansbtprojct"
	val Version = "0.1.0-SNAPSHOT"
	val ScalaVersion = "2.11.7"

	lazy val project = Project(
		"cleansbtproject",
		file("."),
		settings = Seq(
			organization := Organization,
			name := Name,
			version := Version,
			scalaVersion := ScalaVersion,
			libraryDependencies ++= Dependencies.allDependencies
		)
	)
}