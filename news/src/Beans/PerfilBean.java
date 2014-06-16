package Beans;

public class PerfilBean 
{
	private String perfil;
	private String descripcion;
	private boolean estado;
// get Methods
	public String getPerfil()
	{
		return perfil;
	}
	public String getDescripcion()
	{
		return descripcion;
	}
	public boolean activo()
	{
		return estado;
	}
	
	// set methods
	public void setPerfil(String data)
	{
		perfil=data;
	}
	public void setDescripcion (String data)
	{
		descripcion=data;
	}
	public void setEstado(boolean data)
	{
		estado=data;
	}
	

}
