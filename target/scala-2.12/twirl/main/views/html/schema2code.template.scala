
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


Seq[Any](format.raw/*1.1*/("""<section id="top">
  <div class="wrapper">
    <h1>Hello, World!</h1>
  </div>
</section>

<div id="content" class="wrapper doc">
  <article>

    <h1>Welcome to Play</h1>

    <p>
      Congratulations, you’ve just created a new Play application. This page will help you with the next few steps.
    </p>
  </article>
</div>
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
                  DATE: 2020-02-27T18:40:14.558
                  SOURCE: /Users/laika/Documents/weso/wbschema2code/app/views/schema2code.scala.html
                  HASH: f31bb3e3e25475f07f6e6904c26f8e41a0807b51
                  MATRIX: 817->0
                  LINES: 26->1
                  -- GENERATED --
              */
          