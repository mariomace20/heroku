package pe.edu.unmsm.fisi.biblioteca.model;

import java.util.Date;


public class Persona {

	private Integer idPersona;
	private String numDocumento;
	private String nombre;
	private String appPaterno;
	private String appMaterno;
	private String sexo;
	private Date fechaNac;
	private String numTelef;
	private Integer idTipoDocumento;
	private Date fechaRegistro;
	private String usuarioRegistro;
	private Date fechaModificacion;
	private String usuarioModificacion;
	
	public Persona(Integer idPersona, String nombre) {
		this.idPersona = idPersona;
		this.nombre = nombre;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAppPaterno() {
		return appPaterno;
	}

	public void setAppPaterno(String appPaterno) {
		this.appPaterno = appPaterno;
	}

	public String getAppMaterno() {
		return appMaterno;
	}

	public void setAppMaterno(String appMaterno) {
		this.appMaterno = appMaterno;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getNumTelef() {
		return numTelef;
	}

	public void setNumTelef(String numTelef) {
		this.numTelef = numTelef;
	}

	public Integer getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
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
