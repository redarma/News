package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Beans.PerfilBean;
import Conexion.Conexion;

public class PerfilDAO 
{
	Conexion cn= new Conexion();
	public List<PerfilBean> getCategorias() throws SQLException
	{
		List<PerfilBean> beans = new ArrayList<PerfilBean>();
		String sql = "select * from perfil; ";
		ResultSet rs = cn.Query(sql);
		while (rs.next()) 
		{

			PerfilBean bean= new PerfilBean();
				bean.setEstado(rs.getBoolean("estado"));
				bean.setDescripcion(rs.getString("descripcion"));
				bean.setPerfil(rs.getString("perfil"));
				beans.add(bean);
		}
		cn.closeConection();
		return beans;
	}
	
	public void New(PerfilBean cat)
	{
		// insert a new news into the  news table
		String sql="Insert into perfil(perfil,descripcion,estado)  values('"+cat.getPerfil()+"'"+
				",'"+cat.getDescripcion()+"'"+
				",'"+cat.activo()+"'"+"')";
				cn.nonQuery(sql);
	}
	
	public void Delete(String categoria)
	{
		String  sql="delete perfil where perfil='"+categoria+"';";
		cn.nonQuery(sql);
	}
	public PerfilBean Get(String categoria) throws SQLException
	{
		PerfilBean bean = new PerfilBean();
		String sql = "select * from perfil where perfil='" + categoria+"'";
		ResultSet rs = cn.Query(sql);
		if (!rs.next()) 
		{
			bean.setEstado(rs.getBoolean("estado"));
			bean.setDescripcion(rs.getString("descripcion"));
			bean.setPerfil(rs.getString("perfil"));

		}
		cn.closeConection();
		return bean;
	}

}
