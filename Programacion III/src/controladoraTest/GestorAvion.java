package controladoraTest;

import java.util.LinkedList;

import PracticoI.Avion;

public class GestorAvion {
	public LinkedList<Avion> coleccionAviones= new LinkedList<Avion>();
	public boolean crearAvion(Avion nuevoAvion){
		boolean resultado = true;
		for(Avion av: coleccionAviones){
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
			coleccionAviones.add(nuevoAvion);
		}
		return resultado;
	}
}
