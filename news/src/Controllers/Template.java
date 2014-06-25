package Controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.CategoriaBean;
import Beans.NoticiaBean;
import Beans.OpinionBean;
import DAO.CategoriaDAO;
import DAO.NoticiaDAO;
import DAO.OpinionDAO;

public class Template 
{
	
	// lista las noticias de una categoria
	private String news(String Categoria) throws SQLException {
		NoticiaDAO not = new NoticiaDAO();
		String body = "";
		List<NoticiaBean> noticias = not.lastNewsForCathergory(Categoria, 10);
		// generamos contenido de cada new;
		body = "<div id=\"content\">";
		String contenNews=""; 
		for (NoticiaBean New : noticias) {
			contenNews += Generatenew(New);
		}
		contenNews=contenNews==""?"<cite>NO EXISTEN NOTICIAS QUE MOSTRAR</cite>":contenNews;
		body+=contenNews;
		body += "</div>";
		return body;
	}
// genera el menu de categorias
	public String generarMenu() throws SQLException {
		CategoriaDAO dao = new CategoriaDAO();
		List<CategoriaBean> Categorias = dao.getCategorias();
		String Menu = "<ol>";
		for (CategoriaBean cat : Categorias) {
			String url="?proceso=category&category="+cat.getCategoria();
			Menu += "<li><a href=\""+url+"\">" + cat.getNombre() + "</a></li>";
		}
		Menu += "</ol></div>";
		return Menu;
	}

	//genera la cabecera del template
	public String Header() {
		String main = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">"
				+ "<html xmlns=\"http://www.w3.org/1999/xhtml\">"
				+ "<head>"
				+ "<title>The Web News</title>"
				+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />"
				+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/layout.css\" />"
				+ "<!--[if lte IE 6]><link rel=\"stylesheet\" type=\"text/css\" href=\"styles/ie.css\" /><![endif]-->"
				+ "</head>"
				+ "<body>"
				+ "<!-- BEGIN wrapper -->"
				+ "<div id=\"wrapper\">"
				+ " <!-- BEGIN header -->"
				+ "<div id=\"header\">"
				+ " <ul>"
				+ "<li class=\"f\"><a href=\"main\">Home</a></li>"
				+ "<li><a href=\"about.jsp\">Sobre Nosotros</a></li>"
				+ "<li><a href=\"main\">Noticias</a></li>"
				+ "<li><a href=\"contact.jsp\">Contact Page</a></li>"
				+ "</ul>"
				+ "<p class=\"links\">Subscribe: <a href=\"#\">Posts</a> | <a href=\"#\">Comments</a> | <a href=\"#\">Email</a> </p>"
				+ "<div class=\"break\"></div>"
				+ "<div class=\"logo\">"
				+ "<h1><a href=\"#\">The Web News</a></h1>"
				+ "</div>"
				+ "<div class=\"break\"></div>";
		// RequestDispatcher ds=
		// getServletContext().getRequestDispatcher("header.jsp");
		// ds.forward(arg0, arg1);
		return main;
	}
// genera el pie de pagina
	public String footer() {
		return "	<div id=\"footer\">"
				+ "<p>Copyright &copy; 2014 - <a href=\"#\">Sistema de Noticias</a> &middot; All Rights Reserved</p>"
				+ "</div>" + "		  <!-- END footer -->" + "		</div>"
				+ "	<!-- END wrapper -->" + "</body>" + "</html>";

	}

	// genera el contenido de la categoria 
	public String GenerateBody(String categoria) throws SQLException {
		String body = "";
		body = news(categoria);
		return body;
	}

	// visualiza el contenido resumido de una noticia
	public String Generatenew(NoticiaBean noticia)
	{
		String body = "<div class=\"post\"><div class=\"thumb\"><a href=\"main?proceso=view&new="+noticia.getNoticia()+"\"><img src=\""+noticia.GetImagen()+"\" alt=\"\" /></a></div> <h2>"
				+ noticia.getDescripcion()
				+ "</a></h2><p class=\"date\">"
				+ noticia.getFecha()
				+ "</p><p>"
				+ noticia.getresumen()
				+ "</p><a class=\"continue\" href=\"main?proceso=view&new="
				+ noticia.getNoticia() + "\">Mas</a></div>";
		return body;
	}
	//visualiza el contenido completo de la noticia dada
	public String viewNew(int Noticia) throws SQLException
	{
		String body="";
		NoticiaDAO nd= new NoticiaDAO();
		NoticiaBean New= nd.Get(Noticia);
		//Utf8Encoder en= new Utf8Encoder();
		body="<div id=\"content\"><div class=\"single\"><h2>"+New.getDescripcion()+"</h2><p><img class=\"alignright\" src=\""+New.GetImagen()+"\" width=\"200\" height=\"150\" alt=\"\"/></p>"+New.getContenido()+"</div>"+viewComent(Noticia)+"</div>";

		return body;
	}
	// visualizar las noticias mas relevantes
	private String generatetop(NoticiaBean noticia)
	{
		String url="main?proceso=view&new="+noticia.getNoticia();
		String body="";
		       body+= "<li><img src=\""+noticia.GetImagen()+"\" alt=\"\" />"+
		          "<p><strong><a href=\""+url+"\">"+noticia.getDescripcion()+"</a></strong>"+noticia.getresumen()+"</p></li>";
		
		return body;
	}
	
	public String viewtopImportant() throws SQLException
	{
		String body="";
		NoticiaDAO nd= new NoticiaDAO();
		List<NoticiaBean> noticias = nd.getTopNews();
		body="<div class=\"column\"><div class=\"ads\"></div><form class=\"search\" action=\"#\"><input type=\"text\" name=\"s\" id=\"s\" /><button type=\"submit\">Search</button></form><div class=\"wrapper\"><h2>Popular Posts</h2><ul class=\"latestnews\">"; 
		for (NoticiaBean New : noticias) 
		{
			body += generatetop(New);
		}
		body+="</ul><div/></div></div>";
		return body;
	}
	
	public String viewComent(int Noticia) throws SQLException
	{
		String body="";
		OpinionDAO cl= new OpinionDAO();
		List<OpinionBean> c= new  ArrayList<OpinionBean>();
		c= cl.getOpinionesNoticia(Noticia);
		for (OpinionBean opinionBean : c) 
		{
			body+="<blockquote><p>"+opinionBean.getContenido()+"</p></blockquote>";	
		}
		return body;
	}
	

}
