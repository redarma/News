package Controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.CategoriaBean;
import DAO.CategoriaDAO;

/**
 * Servlet implementation class Menu
 */
@WebServlet("/Menu")
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// recuperamos Las categorias
		PrintWriter out = response.getWriter();
	    try {
			out.println (generarMenu()) ;
		} catch (SQLException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	private String generarMenu() throws SQLException, InstantiationException, IllegalAccessException
	{
		CategoriaDAO dao= new  CategoriaDAO();
		List<CategoriaBean> Categorias= dao.getCategorias();
		String Menu="<ul>";
		for (CategoriaBean cat : Categorias) 
		{
		   Menu+="<li>"+cat.getNombre()+"</li>"; 	
		}
		Menu+="</ul>";
		return Menu;
	}
}
