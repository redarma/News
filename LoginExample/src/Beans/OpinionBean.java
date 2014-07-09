package Beans;

import java.util.Date;

public class OpinionBean 
{
	private String opinion;
	private String  contenido;
	  private Date fecha;
	  private String padre;
	  private boolean estado;
	  private String usuario;
	  private Integer noticia;
	  
	  // get methods
	  public String getOpinion()
	  {
		  return opinion;
	  }
	  public String getContenido()
	  {
		  return contenido;
	  }
	
	  public Date getFecha()
	  {
		  return fecha;
	  }
	  public String getPadre()
	  {
		  return padre;
	  }
	
	  public boolean activo()
	  {
		  return estado;
	  }
	  public String getUsuario()
	  {
		  return usuario;
	  }
	  public Integer getNoticia()
	  {
		  return noticia;
	  }
	
	// Set methods
		  public void setOpinion(String Opinion)
		  {
			  opinion= Opinion;
		  }
		  public void setContenido(String data)
		  {
			  contenido= data;
		  }
		
		  public void setFecha(Date data)
		  {
			  fecha=data;
		  }
		  public void setPadre(String data)
		  {
			 padre=data;
		  }
		
		  public void setEstado(boolean data)
		  {
			  estado=data;
		  }
		  public void setUsuario(String data)
		  {
			  usuario=data;
		  }
		  public void setNoticia(Integer data)
		  {
			  noticia= data;
		  }
	
	
	
}
