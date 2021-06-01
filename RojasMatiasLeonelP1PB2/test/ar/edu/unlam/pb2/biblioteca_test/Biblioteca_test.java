package ar.edu.unlam.pb2.biblioteca_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.biblioteca.Biblioteca;
import ar.edu.unlam.pb2.libro.Libro;
import ar.edu.unlam.pb2.libro.Libro_Geografia;
import ar.edu.unlam.pb2.libro.Libro_Matematica;
import ar.edu.unlam.pb2.libro.Libro_historia;

class Biblioteca_test {

	@Test
	public void queSePuedaCrearUnaBiblioteca() {
		Biblioteca biblioteca_nacional = new Biblioteca("Biblioteca Nacional");
		assertNotNull(biblioteca_nacional);
	}
	
	@Test
	public void queSePuedaAgregarUnLibro() {
		Biblioteca biblioteca_nacional = new Biblioteca("Biblioteca Nacional");
		
		Libro historia = new Libro_historia(222, "Historia Mundial", "Felipe Pigna");
		Libro geografia = new Libro_Geografia(333, "Capitales del mundo", "Martin Mendoza");
		Libro matematica = new Libro_Matematica(444, "Algoritmos TOMO IV", "Herrera Juana");
	}
	
	@Test
	public void queSePuedaPrestarUnLibro() {
		
	}
	
	
}
