name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.1.1" withSources() withJavadoc(),
  // "org.scalacheck" %% "scalacheck" % "1.12.2" withSources() withJavadoc(),
  // "scalamock-scalatest-support" % "3.2.1" % "test",
  // "scalamock-specs2-support" % "3.2.1" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test" withSources() withJavadoc(),
  "org.mockito" % "mockito-core" % "1.10.19" % "test" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

