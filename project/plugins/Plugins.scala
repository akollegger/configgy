import sbt._


class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val twitterNest = "com.twitter" at "http://www.lag.net/nest"
  val defaultProject = "com.twitter" % "standard-project" % "0.5.5"
  val bnd4sbt = "com.weiglewilczek" % "bnd4sbt" % "0.4"
}
