package Beans;

public class CategoriaBean
{
	private String categoria;
	private String nombre;
	private String descripcion;
	private boolean estado;
	
	public void setCategoria(String cat)
	{
		categoria=cat;
		
	}
	public void setNombre(String cat)
	{
		nombre=cat;
		
	}

	public void setDescripcion(String cat)
	{
		descripcion=cat;
		
	}
	public void setEstado(boolean cat)
	{
		estado=cat;
		
	}
   
	public String getCategoria()
	{
		return categoria;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public String getDescripcion()
	{
		return descripcion;
	}
	public boolean activo()
	{
		return estado;
	}

}
