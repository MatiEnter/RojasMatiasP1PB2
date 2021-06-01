package ar.edu.unlam.pb2.libro;

public class Libro_historia extends Libro {

	public Libro_historia(Integer codigo_libro, String nombre_libro, String autor_libro, Boolean es_fotocopiable) {
		super(codigo_libro, nombre_libro, autor_libro, es_fotocopiable);
	}
	
	@Override
	public String esFotocopiable() {
	    String respuesta="";
	    if(super.getEs_fotocopiable()==true) {
	        respuesta= "El autor permite la fotocopia de este libro";
	    }
	    return respuesta;
	}

}

