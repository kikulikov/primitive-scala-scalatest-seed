name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test" withSources() withJavadoc(),
  "org.mockito" % "mockito-core" % "1.10.19" withSources() withJavadoc()
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

