package Taller.src.clases;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

//Atributos Cliente: ID, Apellido, Nombres, Documento, Fecha de Nacimiento, Direccion, Telefono, coleccionVehiculos
public class Cliente {
	private int idCliente;
	private String apellido;
	private String nombres;
	private String documento;
	private LocalDate fechaDeNacimiento;
	private String direccion;
	private String telefono;
	private Collection<Vehiculo> vehiculos = new LinkedList<Vehiculo>();
	public Cliente(int idCliente, String apellido, String nombres, String documento, LocalDate fechaDeNacimiento,
			String direccion, String telefono) {
		
		this.idCliente = idCliente;
		this.apellido = apellido;
		this.nombres = nombres;
		this.documento = documento;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
	
	}
	
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public static Cliente instancia (int idCliente, String apellido, String nombres, String documento, LocalDate fechaDeNacimiento,
			String direccion, String telefono) {
		Cliente clienteNuevo = new Cliente (idCliente, apellido, nombres, documento, fechaDeNacimiento, direccion, telefono);
		
		if(documento == null) {
			return null;
		}
		
		
		
		return clienteNuevo;
	}
	public String mostrarCliente() {
		
		return this.apellido + ", " + this.nombres + " - " + this.telefono;
	}
	public void asignarVehiculo(Vehiculo auto1) {
		vehiculos.add(auto1);
		
	}
	public List<Vehiculo> devolverVehiculos() {
		return (List<Vehiculo>) vehiculos;
	}
	
	
}
