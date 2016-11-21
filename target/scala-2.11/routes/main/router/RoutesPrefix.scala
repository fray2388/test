
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alex/Desktop/HTW/Semester 2/M 21 SDF/play-test/play-java-intro/conf/routes
// @DATE:Mon Nov 21 10:17:20 CET 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
