// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alejandro/Documents/weso/wikimedia/wbschema2code/conf/routes
// @DATE:Sat Feb 29 11:50:44 CET 2020


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
