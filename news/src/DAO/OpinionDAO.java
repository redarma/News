package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.OpinionBean;
import Conexion.Conexion;

public class OpinionDAO 
{
	Conexion cn= new Conexion();
	public List<OpinionBean> get(String opinion) throws SQLException
	{
		List<OpinionBean> beans = new ArrayList<OpinionBean>();
		String sql = "select * from opinion where opinion='"+opinion+"'; ";
		ResultSet rs = cn.Query(sql);
		while (rs.next()) 
		{

			OpinionBean bean= new OpinionBean();
				bean.setEstado(rs.getBoolean("estado"));
				bean.setContenido(rs.getString("contenido"));
				bean.setNoticia(rs.getInt("noticia"));
				bean.setOpinion(rs.getString("opinion"));
				bean.setPadre(rs.getString("padre"));
				bean.setUsuario(rs.getString("usuario"));
				bean.setFecha(rs.getDate("fecha"));
				beans.add(bean);
		}
		cn.closeConection();
		return beans;
	}
	public List<OpinionBean> getOpinionesNoticia(Integer Noticia) throws SQLException
	{
		List<OpinionBean> beans = new ArrayList<OpinionBean>();
		String sql = "select * from opinion where noticia="+Noticia+";";
		ResultSet rs = cn.Query(sql);
		while (rs.next()) 
		{
			OpinionBean bean= new OpinionBean();
				bean.setEstado(rs.getBoolean("estado"));
				bean.setContenido(rs.getString("contenido"));
				bean.setNoticia(rs.getInt("noticia"));
				bean.setOpinion(rs.getString("opinion"));
				bean.setPadre(rs.getString("padre"));
				bean.setUsuario(rs.getString("usuario"));
				bean.setFecha(rs.getDate("fecha"));
				beans.add(bean);
		}
		cn.closeConection();
		return beans;
	}
	public void New(OpinionBean cat)
	{
		// insert a new news into the  news table
		String sql="Insert into Opinion(opinion,contenido,fecha,padre,estado,usuario,noticia) values('"+cat.getOpinion()+"'"+
				",'"+cat.getContenido()+"'"+
				",'"+cat.getFecha()+"'"+
				","+cat.getPadre()+
				","+cat.activo()+
				","+cat.getUsuario()+
				","+cat.getNoticia()+"')";
	  cn.nonQuery(sql);
	}
	
	public void Delete(String opinion)
	{
		String  sql="delete noticias where opinion='"+opinion+"';";
		cn.nonQuery(sql);
	}
	
	public OpinionBean Get(String opinion) throws SQLException
	{
		OpinionBean bean = new OpinionBean();
		String sql = "select * from opinion where opinion='" + opinion+"'";
		ResultSet rs = cn.Query(sql);
		if (!rs.next()) 
		{
			bean.setEstado(rs.getBoolean("estado"));
			bean.setContenido(rs.getString("contenido"));
			bean.setNoticia(rs.getInt("noticia"));
			bean.setOpinion(rs.getString("opinion"));
			bean.setPadre(rs.getString("padre"));
			bean.setUsuario(rs.getString("usuario"));
			bean.setFecha(rs.getDate("fecha"));
		}
		cn.closeConection();
		return bean;
	}

}
