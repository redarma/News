package Conexion;
import java.sql.*;
public class Conectar {
	
	private static Connection conectar;
	private static Conectar conectado = new Conectar();
	private Statement s;
	private ResultSet r;
	
	private Conectar(){}
	
	public static Conectar getConexionInstance(){
        return conectado;
    }
	
	public void conectar() throws SQLException{
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		conectar = DriverManager.getConnection ("jdbc:mysql://localhost/news","root", "admin");
		s = conectar.createStatement();
		System.out.println("Conección exitosa");
	}
	
	public void cerrar() throws SQLException{
		conectar.close();
	}
	
	public ResultSet consulta(String sql) throws SQLException{
		conectar();
		r = s.executeQuery(sql);
		return r; 
	}
	
	public void actualizar(String sql) throws SQLException{
		conectar();
		s.executeUpdate(sql);
		cerrar();
	}
}

