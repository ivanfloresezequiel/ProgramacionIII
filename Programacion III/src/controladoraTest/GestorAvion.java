package controladoraTest;

import java.util.Collection;
import java.util.LinkedList;

import PracticoI.Avion;
import PracticoI.Vuelo;

public class GestorAvion {
	public LinkedList<Avion> coleccionAviones = new LinkedList<Avion>();

	public GestorAvion(LinkedList<Avion> list) {
		coleccionAviones.addAll(list);
	}

	public boolean crearAvion(Avion nuevoAvion) {
		boolean resultado = comprobarNoExisteAvionIdMatricula(nuevoAvion);
			
		if (resultado) {
			coleccionAviones.add(nuevoAvion);
		}
		return resultado;
	}

	private boolean comprobarNoExisteAvionIdMatricula(Avion nuevoAvion) {
		for (Avion avion : coleccionAviones) {
			if(avion.getIdAvion() == nuevoAvion.getIdAvion()) {
				return false;
			}
			if(avion.getMatricula().equals(nuevoAvion.getMatricula())) {
				return false;
			}
			
		}
		return true;
	}

	public LinkedList<Avion> getColeccionAviones() {

		return coleccionAviones;
	}

	public int horasVueloAvion(Collection<Vuelo> crearVuelos, Avion avion1) {
		int sumaHoras = 0;
		for (Vuelo vueloi : crearVuelos) {
			if (vueloi.getAvion().getIdAvion() == avion1.getIdAvion()) {
				sumaHoras += vueloi.duracionVueloEnMinutos();
			}
		}
		return sumaHoras / 60;
	}

}
