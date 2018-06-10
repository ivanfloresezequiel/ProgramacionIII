package PracticoI;

import java.util.LinkedList;

public class Avion {
	private int idAvion;
	private String modelo;
	private String matricula;
	private LinkedList<Asiento> listaAsientos;
	private int horasVuelo=0;
	public Avion(int idAvion, String modelo, String matricula, LinkedList<Asiento> listaAsientos) {
		super();
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.matricula = matricula;
		this.listaAsientos = listaAsientos;
	}
	public int getIdAvion() {
		return idAvion;
	}
	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public LinkedList<Asiento> getListaAsientos() {
		return listaAsientos;
	}
	public void setListaAsientos(LinkedList<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}
	
	public void sumaHoraVuelo(int cantidad){
		horasVuelo+=cantidad;
	}
	public int getHorasVuelo() {
		int cantidad=0;
		cantidad= (horasVuelo/60);
		return cantidad;
	}
	
}

