package pe.edu.unmsm.fisi.biblioteca.beans;

import pe.edu.unmsm.fisi.biblioteca.model.Recurso;

public class EstadoRecursoIndividual {
	
	Recurso recurso;
	String estado;
	
	public EstadoRecursoIndividual(Recurso recurso, String estado) {
		this.recurso = recurso;
		this.estado = estado;
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
	
	
	
}
