package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class main
 */
@WebServlet("/main")
public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public main() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @throws IOException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		// creamos template
		// request.getRequestDispatcher("Menu.jsp").forward(request, response);
		// request.getRequestDispatcher("HelloWorld.jsp").forward(request,
		// response);
		PrintWriter out = response.getWriter();
		Template tm= new Template();
		String operacion = request.getParameter("proceso");
		// generacion de header
		out.print(tm.Header());
		// operaciones solicitadas
		try {
			out.print(tm.generarMenu());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		if (operacion == null) {
			try {
				out.print(tm.GenerateBody(""));
	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (operacion.equals("view"))
		{
			String noticia = request.getParameter("new");
			try {
				out.print(tm.viewNew(Integer.parseInt(noticia)));
			} catch (NumberFormatException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (operacion.equals("category"))
		{
			String categoria = request.getParameter("category");
			try {
				out.print(tm.GenerateBody(categoria));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else 
		{
			out.print("sin vistas");
		}
		// sidebar
		try {
			out.print(tm.viewtopImportant());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// footer
		out.print(tm.footer());

	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}