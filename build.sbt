
lazy val root = (project in file(".")).
  settings(
    name := "artifactory-sbt",
    version := "1.1.2-RELEASE",
    scalaVersion := "2.11.8"
  )

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0" withSources(),
  "org.apache.derby" % "derby" % "10.4.1.3"
)

resolvers += "Artifactory" at "https://imyob.jfrog.io/imyob/sbt-test-virtual"
publishTo := Some("Artifactory SBT" at "https://imyob.jfrog.io/imyob/sbt-test-release")
credentials += Credentials(new File("credentials.properties"))