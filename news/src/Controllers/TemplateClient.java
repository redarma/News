package Controllers;

import java.sql.SQLException;
import java.util.List;

import Beans.CategoriaBean;
import Beans.NoticiaBean;
import DAO.CategoriaDAO;
import DAO.NoticiaDAO;

public class TemplateClient {

	public String Header() {
		String Content = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";
		Content += "<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" >";
		Content += "<head>";
		Content += "<title>BEST MAGAZINE</title>";
		Content += "<meta http-equiv=\"content-type\" content=\"application/xhtml; charset=UTF-8\" />";
		Content += "<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />";
		Content += "<link rel=\"stylesheet\" href=\"css/login.css\" media=\"screen\" type=\"text/css\" />";
		Content += "<!--[if lt IE 8.]><link rel=\"stylesheet\" type=\"text/css\" href=\"css/style-ie.css\" /><![endif]-->";
		Content += "<!--[if lt IE 7.]><link rel=\"stylesheet\" type=\"text/css\" href=\"css/style-ie6.css\" /><![endif]-->";
		Content += "<!--  STEP ONE: insert path to SWFObject JavaScript -->";
		Content += "<script type=\"text/javascript\" src=\"js/swfobject/swfobject.js\"></script>";
		Content += "<script type=\"text/javascript\" src=\"js/jquery.js\"></script>";
		Content += "<!--  STEP TWO: configure SWFObject JavaScript and embed CU3ER slider -->";
		Content += "<script type=\"text/javascript\">";
		Content += "if($===jQuery){jQuery.noConflict();}";
		Content += "var flashvars = {};";
		Content += "flashvars.xml = \"config.xml\";";
		Content += "var attributes = {};";
		Content += "attributes.wmode = \"transparent\";";
		Content += "attributes.id = \"slider\";";
		Content += "swfobject.embedSWF(\"cu3er.swf\", \"cu3er-container\", \"920\", \"327\", \"9\", \"expressInstall.swf\", flashvars, attributes);";
		Content += "// ajax interfaces";
		Content += "</script>";
		return Content;
	}

	public String Footer() {
		String Content = " </div>";
		Content += "<!-- NewsLetter Ends Here -->";
		Content += "<!-- Social Starts Here -->";
		Content += "<div id=\"social_bookmark_box\"> <a href=\"#\"><img src=\"images/twitter_icon.png\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/facebook_icon.png\" alt=\"\" /></a> <a href=\"#\"><img src=\"images/linkdin_icon.png\" alt=\"\" /></a> </div>";
		Content += "<!-- Social Ends Here -->";
		Content += "</div>";
		Content += "<!-- Home Social & Newsletter Part Starts here -->";
		Content += "<!-- Home Right Box Starts here -->";
		Content += "<!-- Home Right Box Ends Here -->";
		Content += "</div>";
		Content += "<!-- Clear -->";
		Content += "<div class=\"clear\"> </div>";
		Content += "<!-- Clear -->";
		Content += "<!-- Content Body Ends Here -->";
		Content += "<!--Footer Starts Here -->";
		Content += "<div id=\"footer\">";
		Content += "<div class=\"left\">";
		Content += "<div class=\"footer_links\" ><a  href=\"#\">Inicio</a> &nbsp;| &nbsp;<a  href=\"#\">Nosotros</a> &nbsp;| &nbsp;<a  href=\"#\">Servicios</a></div>";
		Content += "</div>";
		Content += "<div class=\"right\" style=\"padding-right:30px;\"> Copyright &copy; 2014</div>";
		Content += "</div>";
		Content += "	  <!-- Footer Ends Here -->";
		Content += "	</div>";
		Content += "<script src=\"js/login.js\"></script>";
		Content += "<!-- Main Body Ends Here -->";
		Content += "</body>";
		Content += "</html>";
		return Content;
	}

	public String TopMenu() {
		String Content = "</head>";
		Content += "<body>";
		Content += "<!-- Main Body Starts Here -->";
		Content += "<div id=\"main_body\">";
		Content += "<!-- Top Part Starts Here -->";
		Content += "<div id=\"top_part\">";
		Content += "<!-- Top Part Image Starts Here -->";
		Content += "<div id=\"top_part_image\">";
		Content += "<!-- Logo Part Starts Here -->";
		Content += "<div id=\"main_logo\"> <a href=\"#\"><img src=\"images/logo.png\"  alt=\"\" width=\"100\"  /></a> </div>";
		Content += "<div id=\"login\"> <a href=\"#\"><img src=\"images/login.png\"  alt=\"\" width=\"28\"/></a> </div>";
		Content += "<!-- Logo Part Ends Here -->";
		Content += "</div>";
		Content += "<!-- Top Part Image Ends Here -->";
		Content += "<!-- Main Menu Starts Here -->";
		Content += "<div id=\"main_menu_bg\">";
		Content += "<!-- Main Menu Body Starts Here -->";
		Content += "<div id=\"main_menu_body\">";
		Content += "<!-- Menu Links Starts Here -->";
		Content += "<div class=\"menu_links\"> ";
		Content += "<a href=\"index.html\" class=\"menu_active\">INICIO</a><span class=\"menu_border\">&nbsp;</span>";
		return Content;
	}

	public String BootMenu() {
		String Content = " <a href=\"about.html\" class=\"menu_links\">ABOUT</a><span class=\"menu_border\">&nbsp;</span>";
		Content += "<a href=\"client.html\" class=\"menu_links\">CONTACTATE</a>";
		Content += "</div>";
		Content += "<div class=\"login\">";
		Content += "<div class=\"arrow-up\"></div>";
		Content += "<div class=\"formholder\">";
		Content += "<div class=\"randompad\">";
		Content += " <fieldset>";
		Content += "<label name=\"usuario\">Usuario</label>";
		Content += "<input type=\"email\" value=\"\" />";
		Content += "<label name=\"password\">Password</label>";
		Content += "<input type=\"password\" />";
		Content += "<input type=\"submit\" value=\"Login\" />";
		Content += "</fieldset>";
		Content += "</div>";
		Content += "</div>";
		Content += "</div>";
		Content += "<!-- Menu Links Ends Here -->";
		Content += "</div>";
		Content += "<!-- Main Menu Body Ends Here -->";
		Content += "</div>";
		Content += "<!-- Main Menu Ends Here -->";
		Content += "</div>";
		Content += "<!-- Top Part Ends Here -->";
		Content += "<!-- Content Body Starts Here -->";
		Content += "<div id=\"content_body\">";
		Content += "<!-- Home Content Slider Starts Here -->";
		Content += "<div id=\"home_video_box\">";
		Content += "<div id=\"cu3er-container\"> <a href=\"#\"> <img src=\"http://www.adobe.com/images/shared/download_buttons/get_flash_player.gif\" alt=\"\" /> </a> </div>";
		Content += "</div>";
		Content += "<!-- Home Content Slider Ends Here -->";
		Content += "<!-- Home News Starts Here -->";
		Content += "<div id=\"home_news_box\">";
		Content += "<!-- Headers Starts Here -->";
		Content += "<div class=\"headers\"> Latest News </div>";
		Content += "<!-- Headers Ends Here -->";
		Content += "<!-- News Starts Here -->";
		Content += "<!-- Box1 Starts Here -->";
		return Content;
	}

	public String TopBody() {
		String Content = "</div>";
		Content += "<!-- Home News Ends Here -->";
		Content += "	    <!-- Home Social & Newsletter Part Starts here -->";
		Content += "<div id=\"inner_content_body\">";
		Content += "<!-- Testimonial Starts Here -->";
		Content += "<!-- Testimonial Ends Here -->";
		Content += "<!-- News Letter Starts Here -->";
		Content += "<div id=\"newsletter_box\">";
		return Content;
	}

	public String topNews() {
		String Content = "<div class=\"news_boxes\">";
		Content += "<!-- Image Starts Here -->";
		Content += "<div class=\"home_news_img\"> <a href=\"#\"><img src=\"images/news_1.jpg\"  alt=\"\"  /></a> </div>";
		Content += "<!-- Image Ends Here -->";
		Content += "<!-- Text Starts Here -->";
		Content += "<div>";
		Content += "<p class=\"news_head\"><a class=\"news_head\" href=\"#\">Creative Brochure Design</a></p>";
		Content += "<p>Creative Brochure Design Brochure Dimension: 301mm x 214mm Graphics Files Included: CorelDraw(.cdr)...</p>";
		Content += "</div>";
		Content += "<!-- Text Ends Here -->";
		Content += "</div>";
		Content += "<!-- Box1 Ends Here -->";
		Content += "<!-- Box2 Starts Here -->";
		Content += "<div class=\"news_boxes\">";
		Content += "<!-- Image Starts Here -->";
		Content += "<div class=\"home_news_img\"> <a href=\"#\"><img src=\"images/news_2.jpg\"  alt=\"\"  /></a> </div>";
		Content += "<!-- Image Ends Here -->";
		Content += "<!-- Text Starts Here -->";
		Content += "<div>";
		Content += "<p class=\"news_head\"><a class=\"news_head\" href=\"#\">Modern Portfolio Theme</a></p>";
		Content += "<p>Modern Portfolio Theme This PSD template is for Personal Portfolio Features: 1. Well organized layers and PSD...</p>";
		Content += "</div>";
		Content += "<!-- Text Ends Here -->";
		Content += "</div>";
		Content += "<!-- Box2 Ends Here -->";
		Content += "<!-- Box3 Starts Here -->";
		Content += "<div class=\"news_boxes\">";
		Content += "<!-- Image Starts Here -->";
		Content += "<div class=\"home_news_img\"> <a href=\"#\"><img src=\"images/news_3.jpg\" alt=\"\"  /></a> </div>";
		Content += "<!-- Image Ends Here -->";
		Content += "<!-- Text Starts Here -->";
		Content += "<div>";
		Content += "<p class=\"news_head\"><a class=\"news_head\" href=\"#\">Modern Email Template</a></p>";
		Content += "<p> Modern Email Template This Email Template is for Company, Business, Products, Blogs and Portfolio...</p>";
		Content += "</div>";
		Content += "<!-- Text Ends Here -->";
		Content += "</div>";
		Content += "<!-- Box3 Ends Here -->";
		Content += "<!-- Box4 Starts Here -->";
		Content += "<div class=\"news_boxes\">";
		Content += "<!-- Image Starts Here -->";
		Content += "<div class=\"home_news_img\"> <a href=\"#\"><img src=\"images/news_4.jpg\" alt=\"\"  /></a> </div>";
		Content += "<!-- Image Ends Here -->";
		Content += "<!-- Text Starts Here -->";
		Content += "<div>";
		Content += "<p class=\"news_head\"><a class=\"news_head\" href=\"#\">Modern Under Construction Template</a></p>";
		Content += "<p>Modern Under Construction Template Features Clean single page \"Under Construction\"...</p>";
		Content += "</div>";
		Content += "<!-- Text Ends Here -->";
		Content += "</div>";
		Content += "<!-- Box4 Ends Here -->";
		Content += "<!-- Box5 Starts Here -->";
		Content += "<div class=\"news_boxes\">";
		Content += "<!-- Image Starts Here -->";
		Content += "<div class=\"home_news_img\"> <a href=\"#\"><img src=\"images/news_5.jpg\" alt=\"\"  /></a> </div>";
		Content += "<!-- Image Ends Here -->";
		Content += "<!-- Text Starts Here -->";
		Content += "<div>";
		Content += "<p class=\"news_head\"><a class=\"news_head\" href=\"#\">Web2.0 Download Buttons</a></p>";
		Content += "<p>Web2.0 Download Buttons Features 1. Organized Layer sets 2. Easy to modify 3. Editable Text 4. Change the color easily...</p>";
		Content += "</div>";
		Content += "<!-- Text Ends Here -->";
		Content += "</div>";
		return Content;
	}

	public String Menu() throws SQLException {
		CategoriaDAO dao = new CategoriaDAO();
		List<CategoriaBean> Categorias = dao.getCategorias();
		String Menu = "";
		for (CategoriaBean cat : Categorias) {
			String url = "?proceso=category&category=" + cat.getCategoria();
			Menu += "<a href=\"#\" class=\"menu_links\" rel="+cat.getCategoria()+">"
					+ cat.getNombre()
					+ "</a><span class=\"menu_border\">&nbsp;</span>";
		}
		return Menu;
	}

	public String Tops() throws SQLException {
		String body = "";
		NoticiaDAO nd = new NoticiaDAO();
		List<NoticiaBean> noticias = nd.getTopNews();
		for (NoticiaBean New : noticias) {
			body += "<div class=\"news_boxes\">";
			body += "<!-- Image Starts Here -->";
			body += "<div class=\"home_news_img\"> <a href=\"#\"><img src=\""
					+ New.GetImagen()
					+ "\"  alt=\"\"  width=\"70\"/></a> </div>";
			body += "<!-- Image Ends Here -->";
			body += "<!-- Text Starts Here -->";
			body += "<div>";
			body += "<p class=\"news_head\"><a class=\"news_head\" href=\"#\" rel=\""
					+ New.getNoticia()
					+ "\">"
					+ New.getDescripcion()
					+ "</a></p>";
			// body+="<p>"+New.getresumen()+"</p>";
			body += "</div>";
			body += "<!-- Text Ends Here -->";
			body += "</div>";
		}

		return body;
	}

	public String viewNew(int Noticia) throws SQLException {
		String body = "";
		NoticiaDAO nd = new NoticiaDAO();
		NoticiaBean New = nd.Get(Noticia);
		// Utf8Encoder en= new Utf8Encoder();

		body += "<!-- Left Content Body Starts Here -->";
		body += "<div id=\"New\" style:\"text\">";
		body += "<!-- Heading -->";
		body += "<p class=\"page_title\">" + New.getDescripcion() + "</p>";
		body += "<!-- Heading -->";
		body += "<img style=\"padding:0px 7px 0px 7px;float:left;\" src=\""
				+ New.GetImagen() + "\" alt=\"\" width=\"350px\"; />"
				+ New.getContenido() + "</div>";
		return body;
	}

	public String FunctionviewNews() {
		String contenido = "<script>";
		contenido += "var $=jQuery;";
		contenido += "$(document).ready(function() {";
		// Si en vez de por post lo queremos hacer por get, cambiamos el $.post
		contenido += "$('a.news_head').click(function() ";
		contenido += "{var varnew =$(this).attr('rel'); ";
		contenido += "$.post('NewsController',  ";
		contenido += "{noticia : varnew},  ";
		contenido += "function(responseText) {$('#New').html(responseText);});}) ";
		contenido += "}); ";
		contenido += "</script>";
		return contenido;
	}
	public String FunctionviewCategoria() {
		String contenido = "<script>";
		contenido += "var $=jQuery;";
		contenido += "$(document).ready(function() {";
		// Si en vez de por post lo queremos hacer por get, cambiamos el $.post
		contenido += "$('a.menu_links').click(function() ";
		contenido += "{var varnew =$(this).attr('rel'); ";
		contenido += "$.post('NewsController',  ";
		contenido += "{categoria : varnew,"
				+ "	   accion=categoria},  ";
		contenido += "function(responseText) {$('#New').html(responseText);});}) ";
		contenido += "}); ";
		contenido += "</script>";
		return contenido;
	}
	public String GeneratexCategoria(String categoria) throws SQLException {
		String body = "";
		NoticiaDAO nd = new NoticiaDAO();
		List<NoticiaBean> News = nd.lastNewsForCathergory(categoria, 10);
		body += "<!-- Left Content Body Starts Here -->";
		body += "<div id=\"New\" style:\"text\">";

		for (NoticiaBean noticiaBean : News) {
			body += "<!-- Heading -->";
			body += "<p class=\"page_title\">" + noticiaBean.getDescripcion() + "</p>";
			body += "<!-- Heading -->";
			body += "<img style=\"padding:0px 7px 0px 7px;float:left;\" src=\""
					+ noticiaBean.GetImagen() + "\" alt=\"\" width=\"350px\"; />";
		}
		body += "</div>";
		return body;
	}

}
