package Taller.src.clases;

import java.time.LocalDate;
//Atributos Service: ID, Vehiculo, Cliente, Fecha de Service, Detalle, Precio Final

public class Service {

	private int idService;
	private Vehiculo vehiculo1;
	private Cliente cliente1;
	private LocalDate fechaDeService;
	private String detalle;
	private float precioFinal;
	
	
	public Service(int idService, Vehiculo vehiculo1, Cliente cliente1, LocalDate fechaDeService, String detalle,
			float precioFinal) {
		this.idService = idService;
		this.vehiculo1 = vehiculo1;
		this.cliente1 = cliente1;
		this.fechaDeService = fechaDeService;
		this.detalle = detalle;
		this.precioFinal = precioFinal;
	}


	public static Service instancia(int i, Vehiculo elVehiculo, Cliente elCliente, LocalDate fechaDeService, String detalle,
			float precioFinal) {
		Service serviceNuevo = new Service(i, elVehiculo, elCliente, fechaDeService, detalle, precioFinal);
		
		if(serviceNuevo.vehiculo1.equals(null)) {
			return null;
		}
		
		return serviceNuevo;
	}


	public String mostrarResumen() {
		
		return "Service Nro: "+ this.idService + "\nCliente: "+ this.cliente1.mostrarCliente() + "\nVehiculo: "+ this.vehiculo1.mostrarVehiculo()+ "\nTrabajo Realizado: " + this.detalle + "\nTotal: $ " + this.precioFinal;
	}
	
	

	
	

}
