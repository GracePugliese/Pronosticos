package pronostico_mundial;

public class Equipo {

	private int id;
	private String nombre;
	private String descripcion;
	
	public Equipo( String nombre, int id) {
	    this.id=id;
		this.nombre = nombre;
	
	
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
}
