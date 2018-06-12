package controladoras;

import java.util.LinkedList;

import PracticoI.Aeropuerto;

public class CrudAeropuerto {
	private static LinkedList<Aeropuerto> listaAeropuerto = new LinkedList<Aeropuerto>();
	
	public static boolean crearAeropuerto(Aeropuerto nuevoAeropuerto) {
		boolean resultado=true;
		for(Aeropuerto aeropuertoi: listaAeropuerto) {
			if(aeropuertoi.getIdAeropuerto() == nuevoAeropuerto.getIdAeropuerto()) {			
				resultado=false;
				break;
			}
			if(aeropuertoi.getCodigo() == nuevoAeropuerto.getCodigo()) {
				resultado=false;
				break;
			}
			if(resultado) {
				listaAeropuerto.add(nuevoAeropuerto);
			}
			
		}
		return resultado;
	}
	public static boolean modificarAeropuerto(Aeropuerto aeropuertoAntiguo, Aeropuerto aeropuertoNuevo) {
		boolean resultado=true;
		for(Aeropuerto aeropuertoi: listaAeropuerto) {
			if(aeropuertoi.equals(aeropuertoAntiguo)) {
				if(aeropuertoi.getIdAeropuerto()== aeropuertoNuevo.getIdAeropuerto()) {
					aeropuertoi=aeropuertoNuevo;
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
		for(Aeropuerto aeropuertoi: listaAeropuerto) {
			if(aeropuertoi.getIdAeropuerto() == id) {
				resultado = aeropuertoi;
			}
		}
		return resultado;
		
	}
	public static LinkedList<Aeropuerto> traerTodosAeropuertos(){
		return listaAeropuerto;
	}
}
