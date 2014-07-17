package Model;

// default package
// Generated 16/07/2014 08:36:51 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria implements java.io.Serializable {

	private String categoria;
	private String nombre;
	private String descripcion;
	private Boolean estado;
	private Set<Noticia> noticias = new HashSet<Noticia>(0);

	public Categoria() {
	}

	public Categoria(String categoria) {
		this.categoria = categoria;
	}

	public Categoria(String categoria, String nombre, String descripcion,
			Boolean estado, Set<Noticia> noticias) {
		this.categoria = categoria;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.noticias = noticias;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Set<Noticia> getNoticias() {
		return this.noticias;
	}

	public void setNoticias(Set<Noticia> noticias) {
		this.noticias = noticias;
	}

}
