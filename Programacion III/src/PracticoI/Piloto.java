package PracticoI;

import java.time.LocalDate;

public class Piloto {
	private int idPiloto;
	private String apellido;
	private String nombre;
	private String documento;
	private LocalDate fechaNacimiento;
	private int horaVuelo=0;
	
	public Piloto(int idPiloto,String nombre, String apellido, String documento, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
	}
	public void sumaHoraVuelo(int cantidad){
		horaVuelo+=cantidad;
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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHoraVuelo() {
		int cantidad=0;
		cantidad= (horaVuelo/60);
		return cantidad;
	}
	
	

}
