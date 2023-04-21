package pronostico_mundial;

public class Pronostico {

	private int id;
	private Partido partido;
	private Equipo equipo;
	private int resultado;
	public Pronostico(int id, Partido partido, Equipo equipo, int resultado) {
		this.id = id;
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
	}
	public Partido getPartido() {
		return partido;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public int getResultado() {
		return resultado;
	}
	public int getId() {
		return id;
	}
	
	
	
}
