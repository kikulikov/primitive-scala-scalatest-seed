name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.3" % "test" withSources() withJavadoc(),
  "org.mockito" % "mockito-core" % "1.10.19" % "test" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

