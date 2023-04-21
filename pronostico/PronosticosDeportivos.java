package pronostico_mundial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
/*ingreso de datos por sistema , primero los resultados reales y luego el pronostico
 * ej: c:\leer\resultados.csv c:\leer\pronostico2.csv*/
public class PronosticosDeportivos {

	public static void main(String[] args) {
		
        float p = 0;
		String resul=args[0];
        String prono=args[1];
	    
        double puntos=0;
		int id=1;
		try {
			List<String> lista=Files.readAllLines(Paths.get(resul));
			List<String> lpronos=Files.readAllLines(Paths.get(prono));
			String[] linea1=lista.get(0).split(";");
        	String[] linea2=lista.get(1).split(";");
        	String[] lprono1=lpronos.get(0).split(";");
        	String[] lprono2=lpronos.get(1).split(";");
        	
        	
        
        /* 	Equipo equi1=new Equipo(linea1[0],id++);
        	Equipo equi2=new Equipo(linea1[3],id++);
        	Equipo equi3=new Equipo(linea2[0],id++);
        	Equipo equi4=new Equipo(linea2[3],id++);*/
        	id=1;
        	Equipo equipo[]=new Equipo[4];
        	
        	 equipo[0]=new Equipo(linea1[0],id++);
        	 equipo[1]=new Equipo(linea1[3],id++);
        	 equipo[2]=new Equipo(linea2[0],id++);
        	 equipo[3]=new Equipo(linea2[3],id++);
        	
        
        	
        	
        	
        	Partido part1=new Partido(id++,equipo[0],equipo[1],Integer.parseInt(linea1[1]),Integer.parseInt(linea1[2]));
        	Partido part2=new Partido(id++,equipo[2],equipo[3],Integer.parseInt(linea2[1]),Integer.parseInt(linea2[2]));
        	id=1;
            
        	Pronostico prono1 = new Pronostico(id++,buscarPartido(lprono1[0]+lprono1[4],part1,part2),buscarEquipo(lprono1[0],equipo),buscarProm(lprono1,lprono1[0]));
        	Pronostico prono2 = new Pronostico(id++,buscarPartido(lprono1[0]+lprono1[4],part1,part2),buscarEquipo(lprono1[4],equipo),buscarProm(lprono1,lprono1[4]));
        	Pronostico prono3 = new Pronostico(id++,buscarPartido(lprono2[0]+lprono2[4],part1,part2),buscarEquipo(lprono1[0],equipo),buscarProm(lprono2,lprono2[0]));
        	Pronostico prono4 = new Pronostico(id++,buscarPartido(lprono2[0]+lprono2[4],part1,part2),buscarEquipo(lprono1[4],equipo),buscarProm(lprono2,lprono2[4]));
    
        
       
        p=prono1.puntos()+prono2.puntos()+prono3.puntos()+prono4.puntos();
        
     
       
        }catch (IOException e){System.out.println("error");}
		
	
   
		
		    System.out.println("-----------------------------------");
	        System.out.println("Puntos totales:         "+(int)p + " puntos");	
	        System.out.println("-----------------------------------");
	}



	public static Partido buscarPartido(String part, Partido p1,Partido p2) {
        
        Partido p=null;
         
    
     	
     	if (part.equals(p1.getEquipo1().getNombre()+p1.getEquipo2().getNombre())) {p=p1;}
     	
     	if (part.equals(p2.getEquipo1().getNombre()+p2.getEquipo2().getNombre())) {p=p2;}
            return p;
}
	public static Equipo buscarEquipo(String nom,Equipo[] equipo) {
        Equipo eq=null;

        for (Equipo e:equipo) {
     	    if (e.getNombre().equals(nom)) {eq=e;}
     	    if (e.getNombre().equals(nom)) {eq=e;}
     	    if (e.getNombre().equals(nom)) {eq=e;}
     	    if (e.getNombre().equals(nom)) {eq=e;}
        } 

return eq;
}
	public static int buscarProm(String [] lprono, String eq) {
		int aux=0;
		
	
		
		if (eq.equals(lprono[0])) { 		
			if (lprono[1].equals("X")) {aux=ResultadoEnum.GANA.nro;}
			if (lprono[2].equals("X")) {aux=ResultadoEnum.EMPATE.nro;}
			if (lprono[3].equals("X")) {aux=ResultadoEnum.PIERDE.nro;}}
           
           if (eq.equals(lprono[4])) { 		
   			if (lprono[3].equals("X")) {aux=ResultadoEnum.GANA.nro;}
   			if (lprono[2].equals("X")) {aux=ResultadoEnum.EMPATE.nro;}
   			if (lprono[1].equals("X")) {aux=ResultadoEnum.PIERDE.nro;}}
			  
			
		return aux;
	}	
	
}