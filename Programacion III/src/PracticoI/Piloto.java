package PracticoI;

import java.text.Collator;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.LinkedList;

public class Piloto implements Comparator{
	private int idPiloto;
	private String apellido;
	private String nombre;
	private String documento;
	private LocalDate fechaNacimiento;
	private int horaVuelo=0;
	private int edadActual=0;
	
	public Piloto(int idPiloto,String nombre, String apellido, String documento, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.idPiloto = idPiloto;
		this.apellido = apellido;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		edadActual=Period.between(this.getFechaNacimiento(), LocalDate.now()).getYears();
	//	edadActual = Period.between(p.getFechaNacimiento(), LocalDate.now()).;
		
	}
	

	
	public int getEdadActual(){
		return edadActual=Period.between(this.getFechaNacimiento(), LocalDate.now()).getYears();
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
	
	public int compare(Piloto e1, Piloto e2){
		if(e1.fechaNacimiento.getYear() >= e2.fechaNacimiento.getYear()){
			return 1;}
		else
			return -1;
	}






	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
