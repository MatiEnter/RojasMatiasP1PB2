package ar.edu.unlam.pb2.libro;

public class Libro {
	
	private Integer codigo_libro;
	private String nombre_libro;
	private String autor_libro;
	
	public Libro(Integer codigo_libro,String nombre_libro,String autor_libro) {
		this.codigo_libro=codigo_libro;
		this.nombre_libro=nombre_libro;
		this.autor_libro=autor_libro;
	}

	public int getCodigo_libro() {
		return codigo_libro;
	}

	public void setCodigo_libro(Integer codigo_libro) {
		this.codigo_libro = codigo_libro;
	}

	public String getNombre_libro() {
		return nombre_libro;
	}

	public void setNombre_libro(String nombre_libro) {
		this.nombre_libro = nombre_libro;
	}

	public String getAutor_libro() {
		return autor_libro;
	}

	public void setAutor_libro(String autor_libro) {
		this.autor_libro = autor_libro;
	}
	
	
}
