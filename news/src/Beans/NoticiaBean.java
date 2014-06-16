package Beans;

import java.sql.Date;

public class NoticiaBean 
{
	private int noticia;
	private String descripcion;
	private String contenido;
	private Date fecha;
	private boolean estado;
	private String categoria;
	private String resumen;
	private String Imagen;
	private String usuario;
	// methods set
	public void setNoticia(int data)
	{
		noticia=data;
	}
	public void setImagen(String data)
	{
		Imagen=data;
	}
	public void setUsuario(String data)
	{
		usuario=data;
	}
	public void setResumen(String data)
	{
		resumen=data;
	}
	public void setDescripcion(String data)
	{
		descripcion=data;
	}

	public void setContenido(String data)
	{
		contenido=data;
	}
	public void setFecha(Date data)
	{
		fecha=data;
	}
	public void setCategoria(String data)
	{
		categoria=data;
	}
	public void setEstado(boolean data)
	{
		estado=data;
	}

	// methods get
	
	public int getNoticia()
	{
		return noticia;
	}

	public String getDescripcion()
	{
		return descripcion;
	}

	public String getContenido()
	{
		return contenido;
	}
	public Date getFecha()
	{
		return fecha;
	}
	public String getCategoria()
	{
		return categoria;
	}
	public String getresumen()
	{
		return resumen;
	}
	public boolean activo()
	{
		return estado;
	}
	
	public String GetImagen()
	{
		return Imagen;
	}
	public String getUsuario() {
		// TODO Auto-generated method stub
		return usuario;
	}
	
	
}
