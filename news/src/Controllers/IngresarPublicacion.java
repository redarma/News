package Controllers;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Publicacion;
import DAO.PublicacionDAO;

/**
 * Servlet implementation class IngresarPublicacion
 */
@WebServlet("/IngresarPublicacion")
public class IngresarPublicacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarPublicacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PublicacionDAO noticia = new PublicacionDAO();
		Publicacion nueva = new Publicacion();
		nueva.setNoticia(Integer.parseInt(request.getParameter("noticia")));
		nueva.setDescripcion(request.getParameter("descripcion"));
		nueva.setContenido(request.getParameter("contenido"));
		java.util.Date dt = new java.util.Date();

		java.text.SimpleDateFormat sdf = 
		     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String currentTime = sdf.format(dt);
		nueva.setFecha(currentTime);
		nueva.setEstado(true);
		nueva.setCategoria("01");
		nueva.setUsuario(request.getParameter("usuario"));
		nueva.setImagen(request.getParameter("imagen"));
		
		
		try {
			noticia.nuevaNoticia(nueva);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


