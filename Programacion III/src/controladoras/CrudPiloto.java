package controladoras;

import java.util.LinkedList;

import PracticoI.Piloto;

public class CrudPiloto {
	private static LinkedList<Piloto> listaPiloto= new LinkedList<Piloto>();
	
	public static boolean crearPiloto(Piloto pilotoNuevo) {
		boolean resultado = true;
		for(Piloto pilotoi: listaPiloto) {
			if(pilotoi.getIdPiloto() == pilotoNuevo.getIdPiloto()) {
				resultado= false;
				break;
			}
			if(pilotoi.getDocumento().compareTo(pilotoNuevo.getDocumento())==0) {
				resultado = false;
				break;
			}
			
		}
		if(resultado) {
			listaPiloto.add(pilotoNuevo);
		}
		return resultado;
	}
	public static boolean modificarPiloto(Piloto pilotoAntiguo, Piloto pilotoNuevo) {
		boolean resultado = false;
		
		for(Piloto pilotoi: listaPiloto) {
			if(pilotoi.equals(pilotoAntiguo)) {
				if(pilotoi.getIdPiloto() == pilotoNuevo.getIdPiloto()) {
					if(pilotoi.getDocumento().compareTo(pilotoNuevo.getDocumento()) != 0) {
						pilotoi=pilotoNuevo;
						resultado = true;
					}
				}
			}
		}
		return resultado;
	}
	public static Piloto traerUnPiloto(int id) {
		Piloto resultado = new Piloto(id, null, null, null, null);
		for(Piloto pilotoi: listaPiloto) {
			if(pilotoi.getIdPiloto() == id) {
				resultado = pilotoi;
			}
		}
		return resultado;
	}
	public static LinkedList<Piloto> traerTodosPilotos(){
		return listaPiloto;
	}
}
