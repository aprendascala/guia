organization := "br.com.aprendascala"

name := "scala"

version := "0.1-SNAPSHOT"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "1.6.1",
	"junit" % "junit" % "4.10"
)

scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked")
