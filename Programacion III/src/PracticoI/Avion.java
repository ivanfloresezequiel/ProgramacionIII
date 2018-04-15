package PracticoI;

import java.util.LinkedList;

public class Avion {
	private int idAvion;
	private String modelo;
	private String matricula;
	private LinkedList<Asiento> listaAsientos;
	public Avion(int idAvion, String modelo, String matricula, LinkedList<Asiento> listaAsientos) {
		super();
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.matricula = matricula;
		this.listaAsientos = listaAsientos;
	}
	


}

