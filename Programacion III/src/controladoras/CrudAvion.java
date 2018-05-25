package controladoras;

import java.util.LinkedList;

import PracticoI.Avion;

public class CrudAvion {
	private static LinkedList<Avion> listaAvion = new LinkedList<Avion>();

	public static boolean crearAvion(Avion nuevoAvion){
		boolean resultado = true;
		for(Avion av: listaAvion){
			if(av.getIdAvion() == nuevoAvion.getIdAvion()){
				//System.out.println("No se pudo crear el avion, el ID ya existe");
				resultado= false;
				break;
			}
			if(av.getMatricula() == nuevoAvion.getMatricula()){
				//System.out.println("No se pudo crear el avion, ya existe un avion con esa matricula");
				resultado = false;
				break;
			}
			if(nuevoAvion.getListaAsientos().isEmpty()){
				//System.out.println("No se pudo crear el avion, no posee asientos");
				resultado = false;
				break;
			}
		}
		if(resultado){
			listaAvion.add(nuevoAvion);
		}
		return resultado;
	}
	public static boolean modificarAvion(Avion antiguo, Avion nuevo){
		boolean resultado= true;
		for(Avion av: listaAvion){
			if(av.equals(antiguo)){
				if(av.getIdAvion() == nuevo.getIdAvion()){
					av=nuevo;
					break;
				}
				else{
					resultado = false;
					//System.out.println("No se puede modificar el ID del avion");
				}
			}
			
		}
		
		return resultado;
	}
	public static Avion traerunoAvion(int id) {
		Avion resultado= new Avion(0, null, null, null);
		for(Avion av: listaAvion) {
			if(av.getIdAvion() == id) {
				resultado= av;
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
