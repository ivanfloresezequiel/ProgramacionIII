package controladoras;
import java.util.LinkedList;

import PracticoI.Pasajero;
public class CrudPasajero {

	private static LinkedList<Pasajero> listaPasajero = new LinkedList<Pasajero>();
	
	public static boolean crearPasajero(Pasajero pasajeroNuevo) {
		boolean resultado = true;
		for(Pasajero pasajeroi: listaPasajero) {
			if(pasajeroi.getIdPasajero() == pasajeroNuevo.getIdPasajero()) {
				resultado=false;
				break;
			}
			if(pasajeroi.getCUIL().compareTo(pasajeroNuevo.getCUIL())==0) {
				resultado = false;
				break;
			}
		}
		if(resultado) {
			listaPasajero.add(pasajeroNuevo);
		}		
		return resultado;
	}
	public static boolean modificarPasajero(Pasajero pasajeroAntiguo, Pasajero pasajeroNuevo) {
		boolean resultado = true;
		for(Pasajero pasajeroi: listaPasajero) {
			if(pasajeroi.equals(pasajeroAntiguo)) {
				if(pasajeroi.getIdPasajero()== pasajeroNuevo.getIdPasajero()) {
					pasajeroi= pasajeroNuevo;
				}
				else {
					resultado = false;
					break;
				}
			}
		}
		
		return resultado;
	}
	public static Pasajero traerUnPasajero(int id) {
		Pasajero resultado = new Pasajero(id, null, null, null, null);
		for(Pasajero pasajeroi: listaPasajero) {
			if(pasajeroi.getIdPasajero() == id) {
				resultado = pasajeroi;
			}
		}
		return resultado;
	}
	public static LinkedList<Pasajero> traerTodosPasjeros(){
		return listaPasajero;
	}
}
