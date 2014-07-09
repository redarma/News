package Conexion;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion
{
    Connection conn;

	public void Connection() 
	{
		String url = "jdbc:mysql://localhost:3306/"; 
		String dbName = "news";
				 String driver = "com.mysql.jdbc.Driver"; 
				 String userName = "root"; 
				 String password = "admin"; 
				 try { 
					 Class.forName(driver).newInstance(); 
				     conn = (Connection) DriverManager.getConnection(url+dbName,userName,password); 
				 } 
				 catch (Exception e) 
				 { e.printStackTrace(); }
	}

	
	public void closeConection()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet Query(String query) 
	{
		Connection();
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

	public void nonQuery(String query)	{
		Connection();
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