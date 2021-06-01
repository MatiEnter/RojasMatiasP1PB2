package ar.edu.unlam.pb2.estudiante;

public class Estudiante {
	
	private Integer dni_estudiante;
	private String apellido_estudiante;
	private String nombre_estudiante;
	
	public Estudiante(Integer dni_estudiante,String apellido_estudiante,String nombre_estudiante) {
		this.dni_estudiante=dni_estudiante;
		this.apellido_estudiante=apellido_estudiante;
		this.nombre_estudiante=nombre_estudiante;
	}
}
