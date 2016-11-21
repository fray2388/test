
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.59*/routes/*7.65*/.Assets.at("images/favicon.png")),format.raw/*7.97*/("""">
        <script src=""""),_display_(/*8.23*/routes/*8.29*/.Assets.at("javascripts/jquery-2.2.0.min.js")),format.raw/*8.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.at("fullcalendar-3.0.1/lib/moment.min.js")),format.raw/*9.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("fullcalendar-3.0.1/fullcalendar.js")),format.raw/*10.77*/("""" type="text/javascript"></script>
        <link rel= "stylesheet" type="text/css" media="screen" href=""""),_display_(/*11.71*/routes/*11.77*/.Assets.at("fullcalendar-3.0.1/fullcalendar.css")),format.raw/*11.126*/("""">
        
        
    </head>
    <body>
        """),_display_(/*16.10*/content),format.raw/*16.17*/("""
    """),format.raw/*17.5*/("""</body>
</html>

<script type="text/javascript">
     $(document).ready(function()"""),format.raw/*21.34*/("""{"""),format.raw/*21.35*/("""
        """),format.raw/*22.9*/("""$('#calendar').fullCalendar("""),format.raw/*22.37*/("""{"""),format.raw/*22.38*/("""
        """),format.raw/*23.9*/("""// put your options and callbacks here
            weekends:false,
            contentHeight: 600,
            header:"""),format.raw/*26.20*/("""{"""),format.raw/*26.21*/("""
                """),format.raw/*27.17*/("""left:   'title',
                center: 'month, agendaDay, agendaWeek',
                right:  'today prev,next'
            """),format.raw/*30.13*/("""}"""),format.raw/*30.14*/(""",
            nowIndicator:true,
            dayClick: function() """),format.raw/*32.34*/("""{"""),format.raw/*32.35*/("""
                    """),format.raw/*33.21*/("""alert('a day has been clicked!');
                """),format.raw/*34.17*/("""}"""),format.raw/*34.18*/("""
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/(""");
        """),format.raw/*36.9*/("""}"""),format.raw/*36.10*/(""");
</script>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Nov 21 11:18:56 CET 2016
                  SOURCE: /Users/alex/Desktop/HTW/Semester 2/M 21 SDF/play-test/play-java-intro/app/views/main.scala.html
                  HASH: b6866e61db9309b761f5e3a322a3afeeac25fd50
                  MATRIX: 748->1|873->31|901->33|977->83|1002->88|1095->155|1109->161|1161->193|1212->218|1226->224|1291->269|1374->326|1388->332|1458->382|1542->439|1557->445|1626->493|1758->598|1773->604|1844->653|1924->706|1952->713|1984->718|2094->800|2123->801|2159->810|2215->838|2244->839|2280->848|2426->966|2455->967|2500->984|2655->1111|2684->1112|2778->1178|2807->1179|2856->1200|2934->1250|2963->1251|3004->1264|3033->1265|3071->1276|3100->1277
                  LINES: 27->1|32->1|34->3|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|47->16|47->16|48->17|52->21|52->21|53->22|53->22|53->22|54->23|57->26|57->26|58->27|61->30|61->30|63->32|63->32|64->33|65->34|65->34|66->35|66->35|67->36|67->36
                  -- GENERATED --
              */
          