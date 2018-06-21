package PracticoI;

import java.sql.Date;
import java.text.Collator;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.LinkedList;

public class Piloto {
	private int idPiloto;
	private String apellido;
	private String nombre;
	private String documento;
	private LocalDate fechaNacimiento;

	
	public Piloto(int idPiloto,String apellido, String nombre, String documento, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;

		
	}
	
	public int getAge(LocalDate fechaActual){
		int resultado=Period.between(this.getFechaNacimiento(),fechaActual).getYears();
		return resultado;
	}

	public int getIdPiloto() {
		return idPiloto;
	}
	public void setIdPiloto(int idPiloto) {
		this.idPiloto = idPiloto;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getSurnameAndName() {
		return apellido+ ", "+nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
