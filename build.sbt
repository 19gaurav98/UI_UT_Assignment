name := "Assignment_UI_UT"

version := "0.1"

scalaVersion := "2.13.4"
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test

lazy val core = project.in(file("Ques1_2"))
  .settings(
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
  )

lazy val util = project.in(file("ques3"))
  .settings(libraryDependencies ++= Seq("org.scalatest" %% "scalatest-flatspec" % "3.2.2" % "test",
    "org.mockito" %% "mockito-scala" % "1.16.15" % Test))
ThisBuild / useCoursier := false


