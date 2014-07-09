package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.CategoriaBean;
import Conexion.Conexion;

public class CategoriaDAO 
{
	Conexion cn= new Conexion();
	public List<CategoriaBean> getCategorias() throws SQLException
	{
		List<CategoriaBean> beans = new ArrayList<CategoriaBean>();
		String sql = "select * from categoria; ";
		ResultSet rs = cn.Query(sql);
		while (rs.next()) 
		{

				CategoriaBean bean= new CategoriaBean();
				bean.setEstado(rs.getBoolean("estado"));
				bean.setCategoria(rs.getString("categoria"));
				bean.setDescripcion(rs.getString("descripcion"));
				bean.setNombre(rs.getString("nombre"));
				beans.add(bean);
		}
		cn.closeConection();
		return beans;
	}
	
	public void New(CategoriaBean cat)
	{
		// insert a new news into the  news table
		String sql="Insert into categoria(categoria,nombre,descripcion,estado)  values('"+cat.getCategoria()+"'"+
				",'"+cat.getNombre()+"'"+
				",'"+cat.getDescripcion()+"'"+
				","+cat.activo()+"')";
		
	  cn.nonQuery(sql);
	}
	
	public void Delete(String categoria)
	{
		String  sql="delete categoria where categoria='"+categoria+"';";
		cn.nonQuery(sql);
	}
	public CategoriaBean Get(String categoria) throws SQLException
	{
		CategoriaBean bean = new CategoriaBean();
		String sql = "select * from categoria where categoria='" + categoria+"'";
		ResultSet rs = cn.Query(sql);
		if (!rs.next()) 
		{
			bean.setEstado(rs.getBoolean("estado"));
			bean.setCategoria(rs.getString("categoria"));
			bean.setDescripcion(rs.getString("descripcion"));
			bean.setNombre(rs.getString("nombre"));
		}
		cn.closeConection();
		return bean;
	}
}
