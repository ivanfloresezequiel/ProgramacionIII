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
		for(Avion avioni: coleccionAviones){
			if(avioni.getIdAvion() == nuevoAvion.getIdAvion()){
				resultado= false;
				break;
			}
			if(avioni.getMatricula() == nuevoAvion.getMatricula()){
				resultado = false;
				break;
			}
			if(nuevoAvion.getListaAsientos().isEmpty()){
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
		for(Vuelo vueloi: crearVuelos) {
			if(vueloi.getAvion().getIdAvion() == avion1.getIdAvion()) {
				sumaHoras += vueloi.horasMinutos();
			}
		}
		return sumaHoras/60;
	}

	
}
