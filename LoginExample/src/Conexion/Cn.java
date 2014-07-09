package Conexion;

import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

@SuppressWarnings("unused")
public class Cn {
	static Connection conn;

	public static void main(String[] args) throws SQLException 
	{
		ResultSet rs= Query("select * from categoria;");
		int rowcount = 0;
		if (rs.last()) {
		  rowcount = rs.getRow();
		  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
		}
		while (rs.next()) {
		  // do your standard per row stuff
			System.out.print(rs.getString("nombre"));
		}
		
	}

	private static void conectar() {

		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "news";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "admin";
		try {
			Class.forName(driver).newInstance();
			conn = (Connection) DriverManager.getConnection(url
					+ dbName, userName, password);
			System.out.print("Se Conecto");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void closeConection()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ResultSet Query(String query) 
	{
		conectar();
		ResultSet rs=null;
		try {
			// connecting to the DB
			 Statement stmt = (Statement) conn.createStatement();
			 rs = stmt.executeQuery(query);
		} 
		catch (Exception ex) {
			System.out.println("Error en Cosulta"+ ex);
		}
		return rs;
	}

	public static void nonQuery(String query)	{
		conectar();
		try {
			// connecting to the DB
			 Statement stmt = (Statement) conn.createStatement();
			 stmt.executeQuery(query);
			 closeConection();
		} 
		catch (Exception ex) 
		{
			System.out.println("Error en Cosulta"+ ex);
		}
	}

}
