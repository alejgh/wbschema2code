
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Wikibase Schema To Code</title>
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("stylesheets/base.css")),format.raw/*7.86*/("""">
        <link rel="stylesheet" href=""""),_display_(/*8.39*/routes/*8.45*/.Assets.versioned("stylesheets/nav.css")),format.raw/*8.85*/("""">
        <link rel="stylesheet" href=""""),_display_(/*9.39*/routes/*9.45*/.Assets.versioned("stylesheets/normalize-min.css")),format.raw/*9.95*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*11.70*/("""" type="text/javascript"></script>
    </head>
    <body>
        <header>"""),_display_(/*14.18*/nav()),format.raw/*14.23*/("""</header>
        """),_display_(/*15.10*/content),format.raw/*15.17*/("""
    """),format.raw/*16.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-02-29T22:40:23.470
                  SOURCE: /Users/alejandro/Documents/weso/wikimedia/wbschema2code/app/views/main.scala.html
                  HASH: ed9c97c3c4f12f26e7af6ebba297489dcc9cbc52
                  MATRIX: 726->1|835->17|862->18|1017->147|1031->153|1092->194|1159->235|1173->241|1233->281|1300->322|1314->328|1384->378|1472->439|1487->445|1548->484|1600->509|1615->515|1677->556|1779->631|1805->636|1851->655|1879->662|1911->667
                  LINES: 21->1|26->2|27->3|31->7|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|38->14|38->14|39->15|39->15|40->16
                  -- GENERATED --
              */
          