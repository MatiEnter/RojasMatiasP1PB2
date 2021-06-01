package ar.edu.unlam.pb2.libro;

public class Libro_Geografia extends Libro {

	public Libro_Geografia(Integer codigo_libro, String nombre_libro, String autor_libro, Boolean es_fotocopiable) {
		super(codigo_libro, nombre_libro, autor_libro, es_fotocopiable);
		// TODO Auto-generated constructor stub
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
