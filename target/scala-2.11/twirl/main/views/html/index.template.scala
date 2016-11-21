
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<script type='text/javascript' src='"""),_display_(/*4.42*/routes/*4.48*/.Assets.at("javascripts/index.js")),format.raw/*4.82*/("""'></script>

    <ul id="persons"></ul>

    <form method="POST" action=""""),_display_(/*8.34*/routes/*8.40*/.Application.addPerson()),format.raw/*8.64*/("""">
        <input type="text" name="name"/>
        <button>Add Person</button>
    </form>
    
    <div id='calendar'></div>
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Nov 21 10:16:34 CET 2016
                  SOURCE: /Users/alex/Desktop/HTW/Semester 2/M 21 SDF/play-test/play-java-intro/app/views/index.scala.html
                  HASH: 919219550fb3e23fc62694a5c4d928e18639d9fb
                  MATRIX: 738->1|834->3|862->6|893->29|932->31|963->36|1026->73|1040->79|1094->113|1194->187|1208->193|1252->217|1410->345
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|39->8|39->8|39->8|45->14
                  -- GENERATED --
              */
          