ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "com.example"
ThisBuild / version          := "0.1.1-SNAPSHOT"

lazy val akkaserver = (project in file("."))
  .settings(
    name := "akkaserver",
    libraryDependencies += "com.typesafe.akka" %% "akka-http"   % "10.1.12",
    libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.5",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    libraryDependencies += "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.5" % Test,
    libraryDependencies += "com.typesafe.akka" %% "akka-http-testkit" % "10.1.12" % Test,
    
  )
