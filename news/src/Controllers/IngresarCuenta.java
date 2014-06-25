package Controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Cuenta;
import DAO.CuentaDAO;

/**
 * Servlet implementation class IngresarUsuario
 */
@WebServlet("/IngresarCuenta")
public class IngresarCuenta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarCuenta() {
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
		CuentaDAO usuario = new CuentaDAO();
		Cuenta nuevo = new Cuenta();
		nuevo.setUsuario(request.getParameter("usuario"));
		nuevo.setNombres(request.getParameter("nombre")+request.getParameter("apellido"));
		nuevo.setDni(request.getParameter("dni"));
		nuevo.setCorreo(request.getParameter("correo"));
		nuevo.setEstado(true);
		nuevo.setPerfil("usuario");
		
		try {
			usuario.nuevoUsuario(nuevo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
