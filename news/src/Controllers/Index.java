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
 * Servlet implementation class Index
 */
@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		TemplateClient tm= new TemplateClient();
		response.setContentType( "text/html; charset=iso-8859-1" );
		out.println(tm.Header());
		// ingresamos aca las Operaciones a desarrollar;
		out.print(tm.FunctionviewNews());
		out.print(tm.FunctionviewCategoria());
		out.println(tm.TopMenu());
		// ingresa el menu;
			try {
				out.println(tm.Menu());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		out.println(tm.BootMenu());
		// ingresa las noticias relevantes
			try {
				out.println(tm.Tops());
				} catch (SQLException e) 
				{e.printStackTrace();}
		out.println(tm.TopBody());
		//desarrollo de las Noticias
			try {
				out.println(tm.viewNew(1));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		out.println(tm.Footer());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
