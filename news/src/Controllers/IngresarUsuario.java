package Controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.UsuarioBean;
import DAO.UsuarioDAO;

/**
 * Servlet implementation class IngresarUsuario
 */
@WebServlet("/IngresarUsuario")
public class IngresarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarUsuario() {
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
        UsuarioBean user = new UsuarioBean();
        user.setEstado(true);
        user.setdni(request.getParameter("dni"));
        user.setemail(request.getParameter("email"));
        user.setnombres(request.getParameter("apellidos")+"-"+request.getParameter("nombres"));
        user.setPassword(request.getParameter("password"));
        user.setUsario(request.getParameter("usuario"));
        user.setperfil(request.getParameter("perfil"));
        guardar(user);
        out.print("Se ingreso los datos Correctamente");
	}
	
	private void guardar(final UsuarioBean usuario )
	{
		UsuarioDAO  user = new UsuarioDAO();
		user.Save(usuario);
	}

}
