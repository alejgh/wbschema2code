name := "wbschema2code"

version := "1.0"

lazy val `wbschema2code` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"

resolvers += "mvnrepository" at "http://mvnrepository.com/artifact/"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )


unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )
