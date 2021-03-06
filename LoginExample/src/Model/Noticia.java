package Model;

// default package
// Generated 16/07/2014 08:36:51 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Noticia generated by hbm2java
 */
public class Noticia implements java.io.Serializable {

	private int noticia;
	private Usuario usuario;
	private Categoria categoria;
	private String descripcion;
	private String contenido;
	private Date fecha;
	private Boolean estado;
	private String imagen;
	private Set<Opinion> opinions = new HashSet<Opinion>(0);

	public Noticia() {
	}

	public Noticia(int noticia, Categoria categoria, String descripcion,
			String contenido, Date fecha) {
		this.noticia = noticia;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.contenido = contenido;
		this.fecha = fecha;
	}

	public Noticia(int noticia, Usuario usuario, Categoria categoria,
			String descripcion, String contenido, Date fecha, Boolean estado,
			String imagen, Set<Opinion> opinions) {
		this.noticia = noticia;
		this.usuario = usuario;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.contenido = contenido;
		this.fecha = fecha;
		this.estado = estado;
		this.imagen = imagen;
		this.opinions = opinions;
	}

	public int getNoticia() {
		return this.noticia;
	}

	public void setNoticia(int noticia) {
		this.noticia = noticia;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getContenido() {
		return this.contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Set<Opinion> getOpinions() {
		return this.opinions;
	}

	public void setOpinions(Set<Opinion> opinions) {
		this.opinions = opinions;
	}

}
