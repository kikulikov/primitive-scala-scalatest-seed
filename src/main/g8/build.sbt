name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.1.1" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.12.2" % "test" withSources() withJavadoc(),
  "org.specs2" %% "specs2-core" % "3.0.1" % "test" withSources() withJavadoc(),
  "org.mockito" % "mockito-core" % "1.10.19" % "test" withSources() withJavadoc()
  // "org.scalatest" %% "scalatest" % "2.2.4" % "test" withSources() withJavadoc()
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")

initialCommands := "import $organization$.$name;format="lower,word"$._"

