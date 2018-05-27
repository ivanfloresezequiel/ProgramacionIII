package controladoras;

import java.util.LinkedList;

import PracticoI.Piloto;

public class CrudPiloto {
	private static LinkedList<Piloto> listaPiloto= new LinkedList<Piloto>();
	
	public static boolean crearPiloto(Piloto nuevo) {
		boolean resultado = true;
		
		for(Piloto pi: listaPiloto) {
			if(pi.getIdPiloto() == nuevo.getIdPiloto()) {
				resultado= false;
				break;
			}
			if(pi.getDocumento().compareTo(nuevo.getDocumento())==0) {
				resultado = false;
				break;
			}
			
		}
		if(resultado) {
			listaPiloto.add(nuevo);
		}
		return resultado;
	}
	public static boolean modificarPiloto(Piloto antiguo, Piloto nuevo) {
		boolean resultado = false;
		
		for(Piloto pi: listaPiloto) {
			if(pi.equals(antiguo)) {
				if(pi.getIdPiloto() == nuevo.getIdPiloto()) {
					if(pi.getDocumento().compareTo(nuevo.getDocumento()) != 0) {
						pi=nuevo;
						resultado = true;
					}
				}
			}
		}
		return resultado;
	}
	public static Piloto traerUnPiloto(int id) {
		Piloto resultado = new Piloto(id, null, null, null, null);
		for(Piloto pi: listaPiloto) {
			if(pi.getIdPiloto() == id) {
				resultado = pi;
			}
		}
		return resultado;
	}
	public static LinkedList<Piloto> traerTodosPilotos(){
		return listaPiloto;
	}
}
