package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Beans.UsuarioBean;
import Conexion.Conexion;

public class UsuarioDAO 
{
	Conexion cn= new Conexion();
	public List<UsuarioBean> getCategorias() throws SQLException
	{
		List<UsuarioBean> beans = new ArrayList<UsuarioBean>();
		String sql = "select * from usuario; ";
		ResultSet rs = cn.Query(sql);
		while (rs.next()) 
		{

			UsuarioBean bean= new UsuarioBean();
				bean.setdni(rs.getString("dni"));
				bean.setEstado(rs.getBoolean("estado"));
				bean.setemail(rs.getString("correo"));
				bean.setPassword(rs.getString("password"));
				bean.setnombres(rs.getString("nombres"));
				bean.setperfil(rs.getString("perfil"));
				beans.add(bean);
		}
		cn.closeConection();
		return beans;
	}
	
	public void New(UsuarioBean cat)
	{
		// insert a new news into the  news table
		String sql="Insert into usuario(usuario,nombres,dni,correo,estado,perfil)  values('"+cat.getUser()+"'"+
				",'"+cat.getnombres()+"'"+
				",'"+cat.getdni()+"'"+
				",'"+cat.getemail()+"'"+
				",'"+cat.esactivo()+"'"+
				","+cat.getperfil()+"')";
		
	  cn.nonQuery(sql);
	}
	
	public void Delete(String usuario)
	{
		String  sql="delete usuario where usuario='"+usuario+"';";
		cn.nonQuery(sql);
	}
	public UsuarioBean Get(String categoria) throws SQLException
	{
		UsuarioBean bean = new UsuarioBean();
		String sql = "select * from usuario where usuario='" + categoria+"'";
		ResultSet rs = cn.Query(sql);
		if (!rs.next()) 
		{
			bean.setdni(rs.getString("dni"));
			bean.setEstado(rs.getBoolean("estado"));
			bean.setemail(rs.getString("correo"));
			bean.setPassword(rs.getString("password"));
			bean.setnombres(rs.getString("nombres"));
			bean.setperfil(rs.getString("perfil"));
		}
		cn.closeConection();
		return bean;
	}
	
}
