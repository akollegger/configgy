import sbt._
import com.twitter.sbt._
import com.weiglewilczek.bnd4sbt._

class ConfiggyProject(info: ProjectInfo) extends DefaultProject(info) with BNDPlugin {
  val specs = "org.scala-tools.testing" % "specs" % "1.6.2.1"
  //val vscaladoc = "org.scala-tools" % "vscaladoc" % "1.1-md-3"
  val vscaladoc = "org.scala-tools" % "vscaladoc" % "1.1"

  override def pomExtra =
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
        <distribution>repo</distribution>
      </license>
    </licenses>

  // osgi bundle specifications
  override def bndExportPackage = Set("net.lag.logging",
    "net.lag",
    "net.lag.configgy")

  Credentials(Path.userHome / ".ivy2" / "credentials", log)
  val publishTo = "nexus" at "http://nexus.scala-tools.org/content/repositories/releases/"
}
