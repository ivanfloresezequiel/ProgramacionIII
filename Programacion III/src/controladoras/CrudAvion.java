package controladoras;

import java.util.LinkedList;

import PracticoI.Avion;

public class CrudAvion {
	private static LinkedList<Avion> listaAvion = new LinkedList<Avion>();

	public static boolean crearAvion(Avion nuevoAvion){
		boolean resultado = true;
		for(Avion av: listaAvion){
			if(av.getIdAvion() == nuevoAvion.getIdAvion()){
				resultado= false;
				break;
			}
			if(av.getMatricula() == nuevoAvion.getMatricula()){
				resultado = false;
				break;
			}
			if(nuevoAvion.getListaAsientos().isEmpty()){
				resultado = false;
				break;
			}
		}
		if(resultado){
			listaAvion.add(nuevoAvion);
		}
		return resultado;
	}
	public static boolean modificarAvion(Avion avionAntiguo, Avion avionNuevo){
		boolean resultado= true;
		for(Avion avioni: listaAvion){
			if(avioni.equals(avionAntiguo)){
				if(avioni.getIdAvion() == avionNuevo.getIdAvion()){
					avioni=avionNuevo;
					break;
				}
				else{
					resultado = false;
				}
			}
			
		}
		
		return resultado;
	}
	public static Avion traerunoAvion(int id) {
		Avion resultado= new Avion(0, null, null, null);
		for(Avion avioni: listaAvion) {
			if(avioni.getIdAvion() == id) {
				resultado= avioni;
			}
		}
		return resultado;
	}
	public static LinkedList<Avion> traerTodosAvion(){
		return listaAvion;
	}
	public static boolean borrarAvion(Avion eliminar) {
		listaAvion.remove(eliminar);
		
		return true;
	}
}
