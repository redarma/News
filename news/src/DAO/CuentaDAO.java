package DAO;

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
		sql ="insert into usuario(usuario,nombres,dni,correo,estado,perfil) "
				+ "values('"+usuario.getUsuario()+"','"+usuario.getNombres()+"','"
							+usuario.getDni()+"','"+usuario.getCorreo()+"',"
							+usuario.isEstado()+",'"+usuario.getPerfil()+"')";
		conectar.actualizar(sql);
	}
}
