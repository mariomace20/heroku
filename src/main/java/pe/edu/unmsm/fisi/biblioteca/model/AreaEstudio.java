package pe.edu.unmsm.fisi.biblioteca.model;

import java.sql.Date;

public class AreaEstudio {
	private Integer idAreaEstudio;
	private String nombre;
	private String pabellon;
	private String nivel ;
	private Date fechaRegistro;
	private String usuarioRegistro;
	private Date fechaModificacion;
	private String usuarioModificacion;
	public Integer getIdAreaEstudio() {
		return idAreaEstudio;
	}
	public void setIdAreaEstudio(Integer idAreaEstudio) {
		this.idAreaEstudio = idAreaEstudio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPabellon() {
		return pabellon;
	}
	public void setPabellon(String pabellon) {
		this.pabellon = pabellon;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}
	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}
	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}
	
	public AreaEstudio(Integer idAreaEstudio, String nombre) {
		super();
		this.idAreaEstudio = idAreaEstudio;
		this.nombre = nombre;
	}
	

	
	
	
}
