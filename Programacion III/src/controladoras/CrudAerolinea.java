package controladoras;
import java.util.LinkedList;

import PracticoI.Aerolinea;
public class CrudAerolinea {
	private static LinkedList<Aerolinea> listaAerolinea = new LinkedList<Aerolinea>();
	
	public static boolean crearAerolinea(Aerolinea nueva) {
		boolean resultado = true;
		for(Aerolinea ae: listaAerolinea) {
			if(ae.getIdAerolinea() == nueva.getIdAerolinea()) {
				resultado= false;
				break;
			}
		}
		if(resultado) {
			listaAerolinea.add(nueva);
		}
		return resultado;
		
	}
	public static boolean modificarAerolinea(Aerolinea antigua, Aerolinea nueva) {
		boolean resultado = true;
		for(Aerolinea ae: listaAerolinea) {
			if(ae.getIdAerolinea() == antigua.getIdAerolinea()) {
				if(ae.getIdAerolinea() == nueva.getIdAerolinea()) {
					ae = nueva;
				}
				else {
					resultado = false;
				}
			}
			else {
				resultado = false;
			}
		}
		return resultado;
	}
	public static Aerolinea traerUnaAerolinea(int id) {
		Aerolinea resultado = new Aerolinea(0, null);
		for(Aerolinea ae: listaAerolinea) {
			if(ae.getIdAerolinea() == id) {
				resultado = ae;
			}
		}
	return resultado;
	}
	
	public static LinkedList<Aerolinea> traerTodasAerolineas(){
		return listaAerolinea;
	}
}
