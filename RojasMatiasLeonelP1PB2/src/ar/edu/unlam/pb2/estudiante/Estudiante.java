package ar.edu.unlam.pb2.estudiante;

import java.util.ArrayList;

import ar.edu.unlam.pb2.libro.Libro;

public class Estudiante {
	
	private Integer dni_estudiante;
	private String apellido_estudiante;
	private String nombre_estudiante;
	private ArrayList<Libro> prestamo_libros = new ArrayList<Libro>();
	private int libros_prestados;
	
	public Estudiante(Integer dni_estudiante,String apellido_estudiante,String nombre_estudiante) {
		this.dni_estudiante=dni_estudiante;
		this.apellido_estudiante=apellido_estudiante;
		this.nombre_estudiante=nombre_estudiante;
	}
	
	public Boolean prestarLibroAEstudiante(Libro Libro) {
		this.libros_prestados++;
		return this.prestamo_libros.add(Libro);
	}

}
