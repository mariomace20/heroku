package pe.edu.unmsm.fisi.biblioteca.model;

import java.sql.Date;

public class Recurso {

	private Integer idRecurso;
	private String numeroSerie;
	private String descripcion;
	private Integer maxCapacidad;
	private Boolean estado;
	private Integer idTipoRecurso;
	private Integer idAreaEstudio;
	private Integer idUbicacion;
	private Integer idRecursoPadre;
	private Date fechaRegistro;
	private String usuarioRegistro;
	private Date fechaModificacion;
	private String usuarioModificacion;
	
	

	public Recurso(Integer idRecurso, Integer maxCapacidad, Integer idTipoRecurso, Integer idAreaEstudio) {
		this.idRecurso = idRecurso;
		this.maxCapacidad = maxCapacidad;
		this.idTipoRecurso = idTipoRecurso;
		this.idAreaEstudio = idAreaEstudio;
	}

	public void setIdRecurso(Integer idRecurso) {
		this.idRecurso = idRecurso;
	}

	
	
	public Integer getIdRecurso() {
		return idRecurso;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getMaxCapacidad() {
		return maxCapacidad;
	}

	public void setMaxCapacidad(Integer maxCapacidad) {
		this.maxCapacidad = maxCapacidad;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Integer getIdTipoRecurso() {
		return idTipoRecurso;
	}

	public void setIdTipoRecurso(Integer idTipoRecurso) {
		this.idTipoRecurso = idTipoRecurso;
	}

	public Integer getIdAreaEstudio() {
		return idAreaEstudio;
	}

	public void setIdAreaEstudio(Integer idAreaEstudio) {
		this.idAreaEstudio = idAreaEstudio;
	}

	public Integer getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public Integer getIdRecursoPadre() {
		return idRecursoPadre;
	}

	public void setIdRecursoPadre(Integer idRecursoPadre) {
		this.idRecursoPadre = idRecursoPadre;
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
	
	

}
