package ar.edu.unlam.pb2.biblioteca;

import java.util.ArrayList;

import ar.edu.unlam.pb2.estudiante.Estudiante;
import ar.edu.unlam.pb2.libro.Libro;

public class Biblioteca {
	
	private String nombre_biblioteca;
	private ArrayList<Libro> libros_en_biblioteca = new ArrayList<Libro>();

	
	public Biblioteca(String nombre_biblioteca) {
		this.nombre_biblioteca=nombre_biblioteca;
	}
	
	public Boolean agregarLibro(Libro Libro) {
		return this.libros_en_biblioteca.add(Libro);
	}
	
	public Boolean removerLibro(Libro Libro) {
		return this.libros_en_biblioteca.remove(Libro);
	}
	public Boolean imprimirUnLibro(Libro Libro) {
		
		Boolean es_imprimible=false;
		if(Libro.getEs_fotocopiable()==true) {
			 es_imprimible=true;
		}return es_imprimible;
	}
}
