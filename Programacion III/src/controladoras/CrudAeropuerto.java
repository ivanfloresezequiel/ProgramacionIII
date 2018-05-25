package controladoras;

import java.util.LinkedList;

import PracticoI.Aeropuerto;

public class CrudAeropuerto {
	private static LinkedList<Aeropuerto> listaAeropuerto = new LinkedList<Aeropuerto>();
	public static boolean crearAeropuerto(Aeropuerto nuevo) {
		boolean resultado=true;
		for(Aeropuerto ae: listaAeropuerto) {
			if(ae.getIdAeropuerto() == nuevo.getIdAeropuerto()) {
				
				resultado=false;
				break;
			}
			if(ae.getCodigo() == nuevo.getCodigo()) {
				resultado=false;
				break;
			}
			if(resultado) {
				listaAeropuerto.add(nuevo);
			}
			
		}
		
		
		return resultado;
	}
	public static boolean modificarAeropuerto(Aeropuerto antiguo, Aeropuerto nuevo) {
		boolean resultado=true;
		
		for(Aeropuerto ae: listaAeropuerto) {
			if(ae.equals(antiguo)) {
				if(ae.getIdAeropuerto()== nuevo.getIdAeropuerto()) {
					ae=nuevo;
				}
				else {
					resultado=false;
				}
			}
			
		}
		
		return resultado;
	}
	public static Aeropuerto traerUnAeropuerto(int id) {
		Aeropuerto resultado= new Aeropuerto(0, null, null, null);
		
		for(Aeropuerto ae: listaAeropuerto) {
			if(ae.getIdAeropuerto() == id) {
				resultado = ae;
			}
		}
		
		return resultado;
		
	}
	public static LinkedList<Aeropuerto> traerTodosAeropuertos(){
		return listaAeropuerto;
	}
}
