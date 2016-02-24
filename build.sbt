name := "mars_rover"

version := "1.0"

scalaVersion := "2.11.7"

unmanagedSourceDirectories in Compile := Seq(baseDirectory.value / "src/main/scala")

unmanagedSourceDirectories in Test := Seq(baseDirectory.value / "src/test/scala")