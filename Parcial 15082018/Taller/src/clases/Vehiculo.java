package Taller.src.clases;

public class Vehiculo {
	//Atributos Vehiculo: ID, Marca y Modelo, Patente, A�o
	private int idVehiculo;
	private String marcaModelo;
	private String patente;
	private int anio;
	
	
	
	public Vehiculo(int idVehiculo, String marcaModelo, String patente, int anio) {
	
		this.idVehiculo = idVehiculo;
		this.marcaModelo = marcaModelo;
		this.patente = patente;
		this.anio = anio;
	}



	public static Vehiculo instancia(int id, String marcaModelo, String patente, int anio) {
		Vehiculo vehiculoNuevo = new Vehiculo( id, marcaModelo, patente,anio);
		if(vehiculoNuevo.equals(null)) {
			System.out.println("entre");
			return null;
			
		}
		else {
			return vehiculoNuevo;
		}
	}



	public String mostrarVehiculo() {
		return this.marcaModelo + " modelo " + this.anio + " - Patente " + this.patente;
	}

}
