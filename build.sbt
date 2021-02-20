lazy val root = (project in file("."))
  .settings(
    inThisBuild(
      List(
        organization := "com.example",
        scalaVersion := "2.13.3"
      )
    ),
    name := "basic-of-programming",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.2" % "test",
      "org.scalacheck" %% "scalacheck" % "1.14.3" % "test"
    ),
    scalacOptions ++= Seq(
      "-deprecation",
      "-feature",
      "-unchecked",
      "-Xlint"
    )
  )
