package Taller.src.clases;

import java.time.LocalDate;

//Atributos Mecanico: ID, Apellido, Nombres, Matricula, Fecha de Nacimiento, Direccion
public class Mecanico {
	private int idMecanico;
	private String apellido;
	private String nombres;
	private String matricula;
	private LocalDate fechaDeNacimiento;
	private String direccion;
	
	public Mecanico(int idMecanico, String apellido, String nombres, String matricula, LocalDate fechaDeNacimiento,
			String direccion) {
		
		this.idMecanico = idMecanico;
		this.apellido = apellido;
		this.nombres = nombres;
		this.matricula = matricula;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.direccion = direccion;
	}
	
	public static Mecanico instancia (int idMecanico, String apellido, String nombres, String matricula,LocalDate fechaDeNacimiento, String direccion) {
		Mecanico s1 = new Mecanico(idMecanico, apellido, nombres, matricula, fechaDeNacimiento, direccion);
		
	
		if(matricula == null) {
			return null;
			
		}
	
		
		return s1;
	}

	public String mostrarMecanico() {
		
		return this.apellido + ", " + this.nombres + " (" + this.matricula + ")"; 
	}
	
	
	
}
