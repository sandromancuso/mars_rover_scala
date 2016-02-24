import sbt._

object Dependencies {

	val slf4j_api      = "org.slf4j"               % "slf4j-api"           % "1.7.13"
	val slf4j          = "org.slf4j"               % "slf4j-simple"        % "1.7.13"
	val logback        = "ch.qos.logback"          % "logback-classic"     % "1.1.3"

	val scalatest      = "org.scalatest"           % "scalatest_2.11"      % "2.2.4"
	val selenium       = "org.seleniumhq.selenium" % "selenium-java"       % "2.35.0"

	val scala_library  = "org.scala-lang"          % "scala-library"       % "2.11.7"  % "compile"
	val scala_reflect  = "org.scala-lang"          % "scala-reflect"       % "2.11.7"  % "compile"
	val scala_compiler = "org.scala-lang"          % "scala-compiler"      % "2.11.7"  % "compile"

	val prodDependencies = Seq(
		logback, scala_library, scala_reflect, scala_compiler
	)

	val testDependencies = Seq(
		scalatest, selenium
	)

	val allDependencies: Seq[ModuleID] = prodDependencies ++ testDependencies

}