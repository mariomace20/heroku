package pe.edu.unmsm.fisi.biblioteca.beans;

import pe.edu.unmsm.fisi.biblioteca.model.Recurso;

public class EstadoRecursoGrupal {

	Recurso recurso;
	String estado;
	Integer cantidadOcupada;
	
	public EstadoRecursoGrupal(Recurso recurso, String estado, Integer cantidadOcupada) {
		super();
		this.recurso = recurso;
		this.estado = estado;
		this.cantidadOcupada = cantidadOcupada;
	}

	public Recurso getRecurso() {
		return recurso;
	}

	public void setRecurso(Recurso recurso) {
		this.recurso = recurso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getCantidadOcupada() {
		return cantidadOcupada;
	}

	public void setCantidadOcupada(Integer cantidadOcupada) {
		this.cantidadOcupada = cantidadOcupada;
	}

	
	
	

}
