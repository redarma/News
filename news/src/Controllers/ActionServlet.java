	package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Persona;

/**
 * Servlet implementation class ActionServlet
 */
@WebServlet("/ActionServlet")
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Persona> personas = new ArrayList<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionServlet() {
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
		response.setContentType( "text/html; charset=iso-8859-1" );
		PrintWriter out = response.getWriter();

		// Obtengo los datos de la peticion
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String edad = request.getParameter("edad");

		// Compruebo que los campos del formulario tienen datos para añadir a la tabla
		if (!nombre.equals("") && !apellido.equals("") && !edad.equals("")) {
			// Creo el objeto persona y lo añado al arrayList
			Persona persona = new Persona(nombre, apellido, edad);
			personas.add(persona);
		}

		out.println("<table style= cellspacing=\"1\" bgcolor=\"#0099cc\">");
		out.println("<tr>");
		out.println("<td style= rowspan=\"7\" align=\"center\" bgcolor=\"#f8f8f8\"> NOMBRE </td>");			
		out.println("<td style= rowspan=\"7\" align=\"center\" bgcolor=\"#f8f8f8\">APELLIDO</td>");
		out.println("<td style= rowspan=\"7\" align=\"center\" bgcolor=\"#f8f8f8\">EDAD</td>");
		out.println("</tr>");
		for(int i=0; i<personas.size(); i++){
			Persona persona = personas.get(i);
			out.println("<tr>");
			out.println("<td style= rowspan=\"7\" align=\"center\" bgcolor=\"#f8f8f8\">"+persona.getNombre()+"</td>");			
			out.println("<td style= rowspan=\"7\" align=\"center\" bgcolor=\"#f8f8f8\">"+persona.getApellido()+"</td>");
			out.println("<td style= rowspan=\"7\" align=\"center\" bgcolor=\"#f8f8f8\">"+persona.getEdad()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	}

}
