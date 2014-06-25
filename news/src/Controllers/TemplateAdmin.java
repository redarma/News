package Controllers;
public class TemplateAdmin {
	public String formNoticia() {
		String Contenido = "<body id=\"main_body\" >"+
				"	<img id=\"top\" src=\"images/IngresarNoticia/top.png\" alt=\"\"></img>"
				+ "	<div id=\"form_container\">"
				+

				"		<h1><a> Ingresar Noticia</a></h1>"
				+ "		<form id=\"form_862481\" class=\"appnitro\"  method=\"post\" action=\"IngresarNoticia\">"
				+ "					<div class=\"form_description\">"
				+ "			<h2> Ingresar Noticia</h2>"
				+ "			<p></p>"
				+ "		</div>		"
				+ "			<ul >"
				+ "					<li id=\"li_3\" >"
				+ "		<label class=\"description\" for=\"element_3\">Categoria </label>"
				+ "		<div>"
				+ "		<select class=\"element select medium\" id=\"element_3\" name=\"element_3\">"
				+ "			<option value=\"\" selected=\"selected\"></option>"
				+ "<option value=\"1\" >Deportes</option>"
				+ "<option value=\"2\" >Política</option>"
				+ "<option value=\"3\" >Espectáculo</option>"
				+ "<option value=\"4\" >Economía</option>"
				+ "<option value=\"5\" >Artes</option>"
				+ "<option value=\"6\" >Tecnología</option>"
				+ "		</select>"
				+ "		</div> "
				+ "		</li>		<li id=\"li_1\" >"
				+ "		<label class=\"description\" for=\"element_1\">Descripción</label>"
				+ "		<div>"
				+ "			<textarea id=\"element_1\" name=\"element_1\" class=\"element textarea small\"></textarea>"
				+ "		</div> "
				+ "		</li>		<li id=\"li_2\" >"
				+ "		<label class=\"description\" for=\"element_2\">Contenido</label>"
				+ "		<div>"
				+ "			<textarea id=\"element_2\" name=\"element_2\" class=\"element textarea large\"></textarea>"
				+ "		</div> "
				+ "		</li>"
				+ "					<li class=\"buttons\">"
				+ "			    <input type=\"hidden\" name=\"form_id\" value=\"862481\" />"
				+

				"				<input id=\"saveForm\" class=\"button_text\" type=\"submit\" name=\"submit\" value=\"Publicar\" />"
				+ "		</li>"
				+ "			</ul>"
				+ "		</form>	"
				+ "		<div id=\"footer\">"
				+ "		</div>"
				+ "	</div>"
				+ "	<img id=\"bottom\" src=\"/images/IngresarNoticia/bottom.png\" alt=\"\"></img>"
				+ "	</body>";
		return Contenido;
	}

	private String Header() {
		String Contenido = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"
				+ "<html xmlns=\"http://www.w3.org/1999/xhtml\">"
				+ "<head>"
				+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"></meta>"
				+ "<title> Ingresar Noticia</title>"
				+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/IngresarNoticia/view.css\" media=\"all\"></link>"
				+ "<script type=\"text/javascript\" src=\"scripts/IngresarNoticia/view.js\"></script>"
				+ "</head>";
		return Contenido;
	}

	private String footer() {
		String Contenido = "</html>";
		return Contenido;
	}
}