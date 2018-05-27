package controladoras;
import java.util.LinkedList;

import PracticoI.Pasajero;
public class CrudPasajero {

	private static LinkedList<Pasajero> listaPasajero = new LinkedList<Pasajero>();
	
	public static boolean crearPasajero(Pasajero nuevo) {
		boolean resultado = true;
		
		for(Pasajero ps: listaPasajero) {
			if(ps.getIdPasajero() == nuevo.getIdPasajero()) {
				resultado=false;
				break;
			}
			if(ps.getCUIL().compareTo(nuevo.getCUIL())==0) {
				resultado = false;
				break;
			}
		}
		if(resultado) {
			listaPasajero.add(nuevo);
		}		
		return resultado;
	}
	public static boolean modificarPasajero(Pasajero antiguo, Pasajero nuevo) {
		boolean resultado = true;
		for(Pasajero ps: listaPasajero) {
			if(ps.equals(antiguo)) {
				if(ps.getIdPasajero()== nuevo.getIdPasajero()) {
					ps=nuevo;
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
		for(Pasajero ps: listaPasajero) {
			if(ps.getIdPasajero() == id) {
				resultado = ps;
			}
		}
		return resultado;
	}
	public static LinkedList<Pasajero> traerTodosPasjeros(){
		return listaPasajero;
	}
}
