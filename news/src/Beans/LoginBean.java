package Beans;

//Data Encapsulation using Getters and Setters
public class LoginBean {
	private String usuario;
	private String nombres;
	private String dni;
	private String correo;
	private String password;
	private boolean estado;
	private String perfil;
	public String getnombres()
	{
		return nombres;
	}
	public void setnombres(String _nombres)
	{
		nombres = _nombres;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String newPassword)
	{
		password = newPassword;
	}
	public String getUser()
	{
		return usuario;
	}
	public void setUser(String newUsername)
	{
		usuario = newUsername;
	}
	public boolean esactivo()
	{
		return estado;
	}
	public void setactivo(boolean newValid)
	{
		estado = newValid;
	}
	public String getperfil()
	{
		return perfil;
	}
	public void setperfil(String perfiln)
	{
		perfil = perfiln;
	}
	
	public String getemail()
	{
		return correo;
	}
	public void setemail(String newmail)
	{
		correo = newmail;
	}
	
	public String getdni()
	{
		return dni;
	}
	public void setdni(String dnin)
	{
		dni = dnin;
	}
	
}