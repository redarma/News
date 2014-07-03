package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.NoticiaBean;
import Conexion.Conectar;
import Conexion.Conexion;

public class NoticiaDAO {
	static ResultSet rs = null;
	Conectar cn;
	public List<NoticiaBean> getlastNews(Integer n) throws SQLException // get last n news
	{
		cn=Conectar.getConexionInstance();
		List<NoticiaBean> beans = new ArrayList<NoticiaBean>();
		String top = n > 0 ? " limit " + n.toString() + " " : "";
		String sql = "select *, substring(contenido,1,150)as resumen from noticia order by fecha" + top;
		rs = cn.consulta(sql);
			while (rs.next()) 
			{
				NoticiaBean bean= new NoticiaBean();
				bean.setEstado(true);
				bean.setCategoria(rs.getString("categoria"));
				bean.setContenido(rs.getString("contenido"));
				bean.setDescripcion(rs.getString("descripcion"));
				bean.setFecha(rs.getDate("fecha"));
				bean.setNoticia(rs.getInt("noticia"));
				bean.setUsuario(rs.getString("usuario"));
				bean.setResumen(rs.getString("resumen"));
				bean.setImagen(rs.getString("imagen"));
				beans.add(bean);
			}
		cn.cerrar();
		return beans;
	}
	
	public void New(NoticiaBean news) throws SQLException 
	{
		// insert a new news into the  news table
		String sql="Insert into noticia(noticia,descripcion,contenido,fecha,estado,categoria,usuario,imagen)  values('"+news.getNoticia()+"'"+
				",'"+news.getDescripcion()+"'"+
				",'"+news.getContenido()+"'"+
				",'"+news.getFecha().toString()+"'"+
				","+news.activo()+
				",'"+news.getCategoria()+
				",'"+news.getUsuario()+
				",'"+news.GetImagen()+"')";
		
	  cn.actualizar(sql);
		 
	}
	public void Delete(int noticia) throws SQLException 
	{
		String  sql="delete noticia where noticia="+noticia+";";
		cn.actualizar(sql);
	}
	public NoticiaBean Get(int News) throws SQLException
	{
		NoticiaBean bean = new NoticiaBean();
		String sql = "select *,substring(contenido,1,150)as resumen from noticia where noticia=" + News+" order by fecha";
		ResultSet rs = cn.consulta(sql);
		if (rs.next()) 
		{
				bean.setEstado(rs.getBoolean("estado"));
				bean.setCategoria(rs.getString("categoria"));
				bean.setContenido(rs.getString("contenido"));
				bean.setDescripcion(rs.getString("descripcion"));
				bean.setFecha(rs.getDate("fecha"));
				bean.setNoticia(rs.getInt("noticia"));
				bean.setResumen(rs.getString("resumen"));
				bean.setUsuario(rs.getString("usuario"));
				bean.setImagen(rs.getString("imagen"));
		}
		//cn.closeConection();
		return bean;
	}
	
	public List<NoticiaBean> lastNewsForCathergory(String Categoria, int Numero) throws SQLException
	{
		String limit=Numero>0?"Limit "+Numero:"";
		String where =Categoria!=""?"'"+Categoria+"'":"'%'";
		List<NoticiaBean> News= new ArrayList<NoticiaBean>();
		String sql="SELECT n.noticia,n.descripcion,contenido,SUBSTRING(contenido,1,150)AS resumen,n.fecha,n.estado,c.categoria,N.usuario,c.nombre,imagen FROM noticia N, categoria C WHERE N.categoria LIKE "+where+" AND N.categoria= c.categoria order by fecha "+ limit;
		ResultSet rs = cn.consulta(sql);
		while (rs.next()) 
		{
			NoticiaBean bean= new NoticiaBean();
				bean.setEstado(rs.getBoolean("estado"));
				bean.setCategoria(rs.getString("categoria"));
				bean.setContenido(rs.getString("contenido"));
				bean.setDescripcion(rs.getString("descripcion"));
				bean.setFecha(rs.getDate("fecha"));
				bean.setNoticia(rs.getInt("noticia"));
				bean.setResumen(rs.getString("resumen"));
				bean.setUsuario(rs.getString("usuario"));
				bean.setImagen(rs.getString("imagen"));
				News.add(bean);
		}
		//cn.closeConection();
		return News;
	}
	public List<NoticiaBean> getTopNews() throws SQLException
	{
		List<NoticiaBean> News= new ArrayList<NoticiaBean>();
		String sql="select n.noticia,n.descripcion,contenido,SUBSTRING(contenido,1,150)AS resumen,n.fecha,n.estado,c.categoria,N.usuario,c.nombre,imagen FROM noticia N, categoria C WHERE N.categoria= c.categoria order by fecha limit 5";
		ResultSet rs = cn.consulta(sql);
		while (rs.next()) 
		{
			NoticiaBean bean= new NoticiaBean();
				bean.setEstado(rs.getBoolean("estado"));
				bean.setCategoria(rs.getString("categoria"));
				bean.setContenido(rs.getString("contenido"));
				bean.setDescripcion(rs.getString("descripcion"));
				bean.setFecha(rs.getDate("fecha"));
				bean.setNoticia(rs.getInt("noticia"));
				bean.setResumen(rs.getString("resumen"));
				bean.setUsuario(rs.getString("usuario"));
				bean.setImagen(rs.getString("imagen"));
				News.add(bean);
		}
		//cn.closeConection();
		return News;
	}
}
