package pe.edu.unmsm.fisi.biblioteca.model;

import java.sql.Time;
import java.util.Date;


public class Prestamo {
	public Prestamo(Integer idPrestamo, Date fecha, Time horaEntrada, String estadoPrestamo, Integer idRecurso, Integer idPersona) {
		this.idPrestamo = idPrestamo;
		this.fecha = fecha;
		this.horaEntrada = horaEntrada;
		this.estadoPrestamo = estadoPrestamo;
		this.idRecurso = idRecurso;
		this.idPersona = idPersona;
	}

	private Integer idPrestamo;
	
	private Date fecha;
	
	private Time horaEntrada;
	
	private Time horaSalida;
	
	private String estadoPrestamo;
	
	private Integer idRecurso;
	
	private Integer idAdministrativo;
	
	private Integer idPersona;
	
	private Date fechaRegistro;
	
	private String usuarioRegistro;
	
	private Date fechaModificacion;
	
	private String usuarioModificacion;
	
	public Prestamo() {
		super();
	}
	
	public Prestamo(Integer idPrestamo, Date fecha, Time horaEntrada, Time horaSalida, String estadoPrestamo,
			Integer idRecurso, Integer idAdministrativo, Integer idPersona, Date fechaRegistro, String usuarioRegistro,
			Date fechaModificacion, String usuarioModificacion) {
		super();
		this.idPrestamo = idPrestamo;
		this.fecha = fecha;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.estadoPrestamo = estadoPrestamo;
		this.idRecurso = idRecurso;
		this.idAdministrativo = idAdministrativo;
		this.idPersona = idPersona;
		this.fechaRegistro = fechaRegistro;
		this.usuarioRegistro = usuarioRegistro;
		this.fechaModificacion = fechaModificacion;
		this.usuarioModificacion = usuarioModificacion;
	}

	public Integer getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Time horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Time getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Time horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getEstadoPrestamo() {
		return estadoPrestamo;
	}

	public void setEstadoPrestamo(String estadoPrestamo) {
		this.estadoPrestamo = estadoPrestamo;
	}

	public Integer getIdRecurso() {
		return idRecurso;
	}

	public void setIdRecurso(Integer idRecurso) {
		this.idRecurso = idRecurso;
	}

	public Integer getIdAdministrativo() {
		return idAdministrativo;
	}

	public void setIdAdministrativo(Integer idAdministrativo) {
		this.idAdministrativo = idAdministrativo;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
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
