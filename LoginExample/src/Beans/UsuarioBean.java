package Beans;

public class UsuarioBean {
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
	public void setUsario(String newUsername)
	{
		usuario = newUsername;
	}
	public boolean esactivo()
	{
		return estado;
	}
	public void setEstado(boolean newValid)
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
	public void setdni(String sdni)
	{
		dni = sdni;
	}
	public boolean login(String usuario, String Password) 
	{
		return (this.usuario==usuario && this.password== Password);
	}
}
