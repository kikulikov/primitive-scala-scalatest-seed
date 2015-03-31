name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.1.1" withSources() withJavadoc(),
  // TESTING
  "org.scalacheck" %% "scalacheck" % "1.12.2" % "test",
  "org.specs2" %% "specs2-core" % "3.3" % "test",
  "org.mockito" % "mockito-core" % "1.10.19" % "test"
)

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos") // specs2

initialCommands := "import $organization$.$name;format="lower,word"$._"
