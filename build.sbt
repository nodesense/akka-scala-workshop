name := "akka-scala-workshop"

version := "1.0"

scalaVersion := "2.12.6"

lazy val akkaVersion = "2.5.12"
lazy val akkaHttpVersion = "10.1.1"
lazy val slickVersion = "3.2.1"


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",


  "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-xml"        % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream"          % akkaVersion,


  "com.typesafe.play" %% "play-json" % "2.6.7",
  // https://mvnrepository.com/artifact/com.typesafe.play/play-json-joda
  "com.typesafe.play" %% "play-json-joda" % "2.6.9",

   "com.typesafe.akka" %% "akka-persistence" % akkaVersion,


  "com.typesafe.slick" %% "slick"  % slickVersion,
  "com.typesafe.slick" %% "slick-hikaricp" % slickVersion,
  "mysql" % "mysql-connector-java" % "6.0.6"
)
