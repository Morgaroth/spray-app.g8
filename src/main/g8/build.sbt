name := """$name$"""

scalaVersion := "2.11.6"

libraryDependencies ++= {
  val sprayV = "1.3.3"
  val akkaV = "2.3.10"
  Seq(
    "io.spray"          %% "spray-can"       % sprayV,
    "io.spray"          %% "spray-routing"   % sprayV,
    "io.spray"          %% "spray-client"    % sprayV,
    "io.spray"          %% "spray-json"      % "1.3.1",
    "com.typesafe.akka" %% "akka-actor"      % akkaV,
    "com.typesafe.akka" %% "akka-slf4j"      % akkaV,
    "ch.qos.logback"    %  "logback-classic" % "1.1.2",
    "net.ceedubs"       %% "ficus"           % "1.1.2"
  )
}

Revolver.settings
