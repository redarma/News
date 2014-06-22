package Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Beans.UsuarioBean;
import DAO.UsuarioDAO;

/**
 * Servlet implementation class Registrarse
 */
@WebServlet("/Registrarse")
public class Registrarse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrarse() {
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
		UsuarioBean usuario = new UsuarioBean();
		usuario.setUsario(request.getParameter("usuario"));;
		usuario.setnombres(request.getParameter("nombre")+request.getParameter("apelido"));
		usuario.setdni("dni");
		usuario.setemail("correo");
		usuario.setPassword("password");
		usuario.setperfil("usuario");
		usuario.setEstado(true);
		
		UsuarioDAO registrar = new UsuarioDAO();
		registrar.New(usuario);
		
	}

}
