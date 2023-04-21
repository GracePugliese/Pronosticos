package pronostico_mundial;

public class Partido {
	
	private int id;
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	
	public Partido(int id, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this.id = id;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	
	}
	
	
	public int resultado(Equipo eq) {
		//String Vec[]= {"empate","ganador","persedor"};   
		     int  resul=0;
		        if(eq.getId()==this.equipo1.getId()) {
		        	if (this.golesEquipo1<this.golesEquipo2) {resul=ResultadoEnum.PIERDE.nro;} else {resul=ResultadoEnum.GANA.nro;}
		        	
		        }
		        
		        if(eq.getId()==this.equipo2.getId()) {
		        	if (this.golesEquipo1<this.golesEquipo2) {resul=ResultadoEnum.GANA.nro;} else {resul=ResultadoEnum.PIERDE.nro;}
		        	
		        }
		        if (0==this.golesEquipo1-this.golesEquipo2) {resul=ResultadoEnum.EMPATE.nro;}
		        
		        return resul;
	}


	public Equipo getEquipo1() {
		return equipo1;
	}


	public Equipo getEquipo2() {
		return equipo2;
	}


	public int getId() {
		return id;
	}
	

}
