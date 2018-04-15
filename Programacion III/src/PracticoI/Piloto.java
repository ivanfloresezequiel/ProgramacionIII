package PracticoI;

import java.time.LocalDate;

public class Piloto {
	private int idPiloto;
	private String apellido;
	private String documento;
	private LocalDate fechaNacimiento;
	public Piloto(int idPiloto, String apellido, String documento, LocalDate fechaNacimiento) {
		super();
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
