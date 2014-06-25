package Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.NoticiaBean;
import DAO.NoticiaDAO;

import java.sql.Date;

/**
 * Servlet implementation class IngresarNoticia
 */
@WebServlet("/IngresarNoticia")
public class IngresarNoticia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarNoticia() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">");
        out.println("<html>");
        out.println("<head><title>Prueba Datos</title></head>");
        out.println("<body>");
        out.println("<h1>"+"===="+request.getParameter("element_1")+"</h1>");
        out.println("<h1>"+"===="+request.getParameter("element_2")+"</h1>");
        out.println("<h1>"+"===="+request.getParameter("element_3")+"</h1>");
        out.println("</body></html>");
		/*NoticiaBean nuevaNoticia = new NoticiaBean();
		NoticiaDAO ingresoNoticia = new NoticiaDAO();
		nuevaNoticia.setNoticia(6);
		nuevaNoticia.setDescripcion(request.getParameter("element_2"));
		nuevaNoticia.setContenido(request.getParameter("element_3"));
		@SuppressWarnings("deprecation")
		Date fechaNoticia = new Date(2014, 6, 19);
		nuevaNoticia.setFecha(fechaNoticia);
		nuevaNoticia.setEstado(true);
		nuevaNoticia.setCategoria("element_1");
		nuevaNoticia.setResumen(request.getParameter("element_2"));
		nuevaNoticia.setUsuario(request.getParameter("user"));
		
		ingresoNoticia.New(nuevaNoticia);*/
		
		
		
	}

}
