
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

object schema2code extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<link rel="stylesheet" href=""""),_display_(/*1.31*/routes/*1.37*/.Assets.versioned("stylesheets/home.css")),format.raw/*1.78*/("""">

<section id="introduction">
  <h1>Convert Schemas to Java code</h1>

  <div id="steps" class="wrapper doc">
    <h2>Steps:</h2>
    <form id="schema-form">
      <label for="endpoint">1.- Select a wikibase endpoint: </label>
      <input id="endpoint-input" type="text" name="endpoint" value="https://weso-group.wiki.opencura"><br>
      <label for="schema">2.- Select an entity schema: </label>
      <input id="schema-input" type="text" name="schema" value="Schema..."><br>
      <input type="submit" value="Load schema">
    </form>

    <h3>Or....</h3>
    <p>Introduce your shex-lite code directly below:</p>
  </div>
</section>

<section id="code-generation-section">

  <div id="shexl-input">
    <h2>Shexl input</h2>
    <textarea name="shexl-text" rows="8" cols="80"></textarea>
  </div>

  <button id="generate-code-btn" type="button" name="button">Generate code</button>

  <div id="code-output">
    <h2>Code output</h2>
    <textarea name="code-text" rows="8" cols="80"></textarea>
  </div>

</section>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-02-29T22:55:39.296
                  SOURCE: /Users/alejandro/Documents/weso/wikimedia/wbschema2code/app/views/schema2code.scala.html
                  HASH: e9ec112b5dcd2bba113e3fb39bcd139ebec9d47b
                  MATRIX: 817->0|873->30|887->36|948->77
                  LINES: 26->1|26->1|26->1|26->1
                  -- GENERATED --
              */
          