package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import Beans.Cuenta;
import Conexion.Conectar;

public class CuentaDAO {
	
	private Conectar conectar;
	private String sql;
	
	public CuentaDAO(){
		conectar = Conectar.getConexionInstance();	
	}
	
	
	public void nuevoUsuario(Cuenta usuario) throws SQLException{
		sql ="insert into usuario(usuario,nombres,dni,correo,estado,perfil,password) "
				+ "values('"+usuario.getUsuario()+"','"+usuario.getNombres()+"','"
							+usuario.getDni()+"','"+usuario.getCorreo()+"',"
							+usuario.isEstado()+",'"+usuario.getPerfil()+"','"+usuario.getPassword()+"')";
		conectar.actualizar(sql);
	}
	
	public boolean login(String user, String password) throws SQLException{
		sql = "select usuario, password from usuario where usuario ="+"'"+user+"'"+" and password ="+"'"+password+"'";
		 ResultSet rs = conectar.consulta(sql);
		 if (rs.next()) // found
         {
			 
             System.out.println(rs.getString("usuario"));
             conectar.cerrar();
             return true;
         }
         else {
        	 conectar.cerrar();
             return false;
         }
		
	}
}
