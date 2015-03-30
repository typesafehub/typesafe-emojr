name := """typesafe-emojr"""

version := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "com.typesafe" %% "emoji" % "1.0.0",
  "com.adrianhurt" %% "play-bootstrap3" % "0.4"
)

TwirlKeys.templateImports ++= Seq(
  "com.typesafe.emoji.Emoji.Implicits._",
  "com.typesafe.emoji.ShortCodes.Implicits._"
)