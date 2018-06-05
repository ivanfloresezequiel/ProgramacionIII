package controladoraTest;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collection;
import java.util.LinkedList;

import PracticoI.Avion;
import PracticoI.Vuelo;

public class GestorAvion {
	public LinkedList<Avion> coleccionAviones= new LinkedList<Avion>();
	
	
	public GestorAvion(LinkedList<Avion> list) {
		coleccionAviones.addAll(list);
	}


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


	public LinkedList<Avion> getColeccionAviones() {
		
		return coleccionAviones;
	}


	public int horasVueloAvion(Collection<Vuelo> crearVuelos, Avion avion1) {
		int sumaHoras=0;
		for(Vuelo vl: crearVuelos) {
			if(vl.getAvion().getIdAvion() == avion1.getIdAvion()) {
				sumaHoras += vl.horasMinutos();
			}
		}
		return sumaHoras/60;
	}

	
}
