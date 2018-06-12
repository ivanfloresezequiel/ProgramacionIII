package PracticoI;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;

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
	
	
	public Vuelo(String condigoVuelo, Aeropuerto salida, LocalDateTime fechaHoraSalida, Aeropuerto arribo,
			LocalDateTime fechaHoraArribo, Aerolinea aerolinea, LinkedList<Piloto> listaPilotos, Avion avion,
			LinkedList<Asignacion> pasajeros) {
		super();
		
		this.condigoVuelo = condigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.listaPilotos = listaPilotos;
	
		this.avion = avion;
		this.pasajeros = pasajeros;
		
		
		
	}
	
	public Vuelo(String condigoVuelo2, Object salida2, LocalDateTime of, Object arribo2, LocalDateTime of2,
			Object aerolinea2, Collection<Piloto> tripulacion, Object avion2, Object pasajeros2) {
		this.condigoVuelo = condigoVuelo2;
		
		this.fechaHoraSalida = of;
		
		this.fechaHoraArribo = of2;
		
		this.listaPilotos = (LinkedList<Piloto>) tripulacion;
		
	
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
		System.out.println("\nDetalle de asignaciones - Vuelo "+ this.getCondigoVuelo());
		for(Asiento s: avion.getListaAsientos()){
				for(Asignacion p: pasajeros){
				
						if ( p.getAsiento().getNumeroAsiento() == s.getNumeroAsiento()){
								System.out.println("Asiento"+ s.getNumeroAsiento() + "-"+"Ocupado");
								contador=1;
						}
				}
				if(contador==0){
					System.out.println("Asiento"+ s.getNumeroAsiento() + "-"+"Libre");
				
				}
				contador=0;
			
				
	}
		
	}

	public int horasMinutos(){
		int cantidad=0;
		LocalDate fechaLlegada = LocalDate.of(fechaHoraArribo.getYear(), fechaHoraArribo.getMonthValue(),fechaHoraArribo.getDayOfMonth());
		LocalDate fechaSalida = LocalDate.of(fechaHoraSalida.getYear(), fechaHoraSalida.getMonthValue(), fechaHoraSalida.getDayOfMonth());
		int diferencia = Period.between(fechaSalida,fechaLlegada).getDays();
		if(diferencia >= 1){
			cantidad = (1440 -((fechaHoraSalida.getHour()*60) + fechaHoraSalida.getMinute())) + (fechaHoraArribo.getHour() * 60 )+ fechaHoraArribo.getMinute();
		}
		else{
			if(fechaHoraArribo.getMinute() >= fechaHoraSalida.getMinute())
				cantidad = ((fechaHoraArribo.getHour() - fechaHoraSalida.getHour())* 60) + (fechaHoraArribo.getMinute() - fechaHoraSalida.getMinute());
			else
				cantidad = ((fechaHoraArribo.getHour() - fechaHoraSalida.getHour())* 60) - (fechaHoraSalida.getMinute() - fechaHoraArribo.getMinute());
		}
			return cantidad;
		}

	
	public String getDetails() {
		Locale l = new Locale("es","ES");
		String resultado = "Vuelo "+ this.condigoVuelo + " - " + avion.getModelo() + "\r\n"+ 
		fechaHoraSpanish(fechaHoraSalida) +" "+ salida.getCodigo() + " (" + salida.getCiudad().getNombre() + " - " + salida.getNombre() + ")" + "\r\n"
		+ fechaHoraSpanish(fechaHoraArribo)+ " "+ arribo.getCodigo() +" (" +  arribo.getCiudad().getNombre() + " - " + arribo.getNombre() + ")" + "\r\n"
				+ "Operado por "+ aerolinea.getNombre() + "." + " Duraci�n " + this.horasMinutos()/60 + "h " + this.horasMinutos()%60 + "m";
		
		return (resultado);
				
		
	}
	public String fechaHoraSpanish(LocalDateTime departureDateTime) {
		Locale l = new Locale("es","ES");
		return Character.toUpperCase(departureDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, l).charAt(0)) + departureDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, l).substring(1, departureDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, l).length()).toLowerCase() + " "+ departureDateTime.getDayOfMonth() + " de " + departureDateTime.getMonth().getDisplayName(TextStyle.FULL, l) +" "+ departureDateTime.getHour() + ":" + departureDateTime.getMinute();
	}
	
	}




