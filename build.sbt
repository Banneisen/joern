name := "joern"
organization := "io.shiftleft"
scalaVersion := "2.12.7"

val cpgVersion = "0.9.141"

libraryDependencies ++= Seq(
  "io.shiftleft" % "codepropertygraph" % cpgVersion,
  "io.shiftleft" % "query-primitives" % cpgVersion,
  "io.shiftleft" % "enhancements" % cpgVersion,
  "io.shiftleft" % "semanticcpg" % cpgVersion,
)

enablePlugins(JavaAppPackaging)
