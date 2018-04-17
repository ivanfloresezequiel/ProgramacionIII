package PracticoI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Vuelo {
	
	private String condigoVuelo;
	private Aeropuerto salida;
	private LocalDateTime fechaHoraSalida;
	private Aeropuerto arribo;
	private LocalDateTime fechaHoraArribo;
	private Aerolinea aerolinea;
	private LinkedList<Piloto> listaPilotos;
	private Avion avion;
	private LinkedList<Asignacion> pasajeros;
	private LinkedList<Integer> idPilotos;
	
	
	
	public Vuelo(String condigoVuelo, Aeropuerto salida, LocalDateTime fechaHoraSalida, Aeropuerto arribo,
			LocalDateTime fechaHoraArribo, Aerolinea aerolinea, LinkedList<Piloto> listaPilotos, Avion avion,
			LinkedList<Asignacion> pasajeros) {
		super();
		int cantidad=0;
		this.condigoVuelo = condigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.listaPilotos = listaPilotos;
		this.avion = avion;
		this.pasajeros = pasajeros;
		
		//if(fechaHoraArribo.getMinute() > fechaHoraSalida.getMinute())
			//cantidad = ((fechaHoraArribo.getHour() - fechaHoraSalida.getHour())* 60) + (fechaHoraArribo.getMinute() - fechaHoraSalida.getMinute());
		//else
			//cantidad = ((fechaHoraArribo.getHour() - fechaHoraSalida.getHour())* 60) - (fechaHoraArribo.getMinute() - fechaHoraSalida.getMinute());
		//System.out.println("hora de llegada: "+fechaHoraArribo.getHour() + cantidad+ "minutos de llegada: " + fechaHoraArribo.getMinute() + "minutos salida: " + fechaHoraSalida.getMinute());
		cantidad = this.horasMinutos();
		aerolinea.sumaHoraVuelo(cantidad);
		for(Piloto pilo: listaPilotos){
			pilo.sumaHoraVuelo(cantidad);
			
		}
	}
	public LinkedList<Piloto> getListaPilotos() {
		return listaPilotos;
	}
	public void setListaPilotos(LinkedList<Piloto> listaPilotos) {
		this.listaPilotos = listaPilotos;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public LinkedList<Asignacion> getPasajeros() {
		return pasajeros;
	}
	public void setPasajeros(LinkedList<Asignacion> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	public String getCondigoVuelo() {
		return condigoVuelo;
	}
	public void setCondigoVuelo(String condigoVuelo) {
		this.condigoVuelo = condigoVuelo;
	}
	public Aeropuerto getSalida() {
		return salida;
	}
	public void setSalida(Aeropuerto salida) {
		this.salida = salida;
	}
	public LocalDateTime getFechaHoraSalida() {
		return fechaHoraSalida;
	}
	public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}
	public Aeropuerto getArribo() {
		return arribo;
	}
	public void setArribo(Aeropuerto arribo) {
		this.arribo = arribo;
	}
	public LocalDateTime getFechaHoraArribo() {
		return fechaHoraArribo;
	}
	public void setFechaHoraArribo(LocalDateTime fechaHoraArribo) {
		this.fechaHoraArribo = fechaHoraArribo;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	
	public void detalleAsignaciones(){
		int contador=0;
		
			System.out.println("Detalle de asignaciones - Vuelo "+ this.getCondigoVuelo());
			for(Asiento s: avion.getListaAsientos()){
				for(Asignacion p: pasajeros){
				
						if ( p.getAsiento().getNumeroAsiento() == s.getNumeroAsiento()){
								System.out.println("Asiento "+ s.getNumeroAsiento() + "-"+"Ocupado");
								contador=1;
						}
				}
				if(contador==0){
					System.out.println("Asiento "+ s.getNumeroAsiento() + "-"+"Libre");
				
				}
				contador=0;
			
				
	}
		
	}
	
	
	private int horasMinutos(){
		int cantidad=0;
		if(fechaHoraArribo.getMinute() >= fechaHoraSalida.getMinute())
			cantidad = ((fechaHoraArribo.getHour() - fechaHoraSalida.getHour())* 60) + (fechaHoraArribo.getMinute() - fechaHoraSalida.getMinute());
		else
			cantidad = ((fechaHoraArribo.getHour() - fechaHoraSalida.getHour())* 60) - (fechaHoraSalida.getMinute() - fechaHoraArribo.getMinute());
		return cantidad;
	}
	
	
	
	public void detallesVuelo(){
		System.out.println(avion.getModelo() + "\n"+ fechaHoraSalida.getDayOfWeek() + " "+ fechaHoraSalida.getDayOfMonth() + " de " + fechaHoraSalida.getMonth() +" "+ fechaHoraSalida.getHour() + ":" + fechaHoraSalida.getMinute() + salida.getCodigo() + "(" + salida.getCiudad().getNombre() + "-" + salida.getNombre() + ")" + "\n"
				+ fechaHoraArribo.getDayOfWeek() + " "+ fechaHoraArribo.getDayOfMonth() + " de " + fechaHoraArribo.getMonth() +" "+ fechaHoraArribo.getHour() + ":" + fechaHoraArribo.getMinute() + arribo.getCodigo() + "(" + arribo.getCiudad().getNombre() + "-" + arribo.getNombre() + ")" + "\n"
				+ "Operado por "+ aerolinea.getNombre() + "." + "Duracion " + this.horasMinutos()/60 + "h " + this.horasMinutos()%60 + "m"
				);
	}
}
