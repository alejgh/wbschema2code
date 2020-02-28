// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/laika/Documents/weso/wbschema2code/conf/routes
// @DATE:Wed Feb 26 09:41:50 CET 2020


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
