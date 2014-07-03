package DAO;

import java.sql.SQLException;
import Beans.Publicacion;
import Conexion.Conectar;

public class PublicacionDAO {
	
	private Conectar conectar;
	private String sql;
	
	public PublicacionDAO(){
		conectar = Conectar.getConexionInstance();	
	}
	
	
	public void nuevaNoticia(Publicacion publicacion) throws SQLException{
		sql ="insert into noticia(noticia,descripcion,contenido,fecha,estado,categoria,usuario,imagen) "
				+ "values("+publicacion.getNoticia()+",'"+publicacion.getDescripcion()+"','"
							+publicacion.getContenido()+"','"+publicacion.getFecha()+"',"
							+publicacion.isEstado()+",'"+publicacion.getCategoria()+"','"
							+publicacion.getUsuario()+"','"+publicacion.getImagen()+"')";
		conectar.actualizar(sql);
	}
}