package com.CandidJava;

import java.sql.SQLException;

import Beans.Cuenta;
import DAO.CuentaDAO;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private String password;
    
 
    public String execute() throws SQLException {
    	Cuenta nueva = new Cuenta();
    	nueva.setUsuario(username);
    	nueva.setNombres(nombre+dni);
    	nueva.setDni(dni);
    	nueva.setCorreo(correo);
    	nueva.setEstado(true);
		nueva.setPerfil("usuario");
    	nueva.setPassword(password);
    	CuentaDAO usuario = new CuentaDAO();
    	usuario.nuevoUsuario(nueva);
            return "success";
    }
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
}

