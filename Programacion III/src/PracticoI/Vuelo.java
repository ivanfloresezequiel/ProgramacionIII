package PracticoI;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
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
	
	static final HashSet <Piloto> listamayor= new HashSet<Piloto>();
	
	
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
		avion.sumaHoraVuelo(cantidad);
		//aerolinea.sumaHoraVuelo(cantidad);
		for(Piloto pilo: listaPilotos){
			pilo.sumaHoraVuelo(cantidad);
			
		}
		for(Piloto p: listaPilotos){
			listamayor.add(p);
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

	private int horasMinutos(){
		int cantidad=0;
		//SimpleDateFormat fechaLlegada1 = new SimpleDateFormat("fechaHoraArribo.getDayOfMonth() 'de' fechaHoraArribo.getMonth() 'de' fechaHoraArribo.getYear()", new locale("es"));
		LocalDate fechaLlegada = LocalDate.of(fechaHoraArribo.getYear(), fechaHoraArribo.getMonthValue(),fechaHoraArribo.getDayOfMonth());
		LocalDate fechaSalida = LocalDate.of(fechaHoraSalida.getYear(), fechaHoraSalida.getMonthValue(), fechaHoraSalida.getDayOfMonth());
		int diferencia = Period.between(fechaSalida,fechaLlegada).getDays();
		//System.out.println("diferencia igual= " + diferencia);
		
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

	public void detallesVuelo(){
		//SimpleDateFormat formato = new SimpleDateFormat("day 'de' MMMM 'del' yyyy", new Locale("es"));
		//String horaLlegada = formato.format(fechaHoraArribo);
		//System.out.println(horaLlegada);
		System.out.println("\nDetalle de Vuelo\n"+avion.getModelo() + "\n"+ fechaHoraSalida.getDayOfWeek() + " "+ fechaHoraSalida.getDayOfMonth() + " de " + fechaHoraSalida.getMonth() +" "+ fechaHoraSalida.getHour() + ":" + fechaHoraSalida.getMinute() + salida.getCodigo() + "(" + salida.getCiudad().getNombre() + "-" + salida.getNombre() + ")" + "\n"
				+ fechaHoraArribo.getDayOfWeek() + " "+ fechaHoraArribo.getDayOfMonth() + " de " + fechaHoraArribo.getMonth() +" "+ fechaHoraArribo.getHour() + ":" + fechaHoraArribo.getMinute() + arribo.getCodigo() + "(" + arribo.getCiudad().getNombre() + "-" + arribo.getNombre() + ")" + "\n"
				+ "Operado por "+ aerolinea.getNombre() + "." + "Duracion " + this.horasMinutos()/60 + "h " + this.horasMinutos()%60 + "m"
				);
	}

	public static void mayoresPiloto(){
		LinkedList <Piloto> imprimir= new LinkedList<Piloto>();
		//Period edadActual= Period.ofDays(1);
		System.out.println("\nPilotos mayores a 40 años\n");
			for(Piloto p: listamayor){
				//edadActual = Period.between(p.getFechaNacimiento(), LocalDate.now());
				if(p.getEdadActual() >40){
					imprimir.add(p);
					
				}
			}
			
						
		//LinkedLis
			Collections.sort(imprimir, new Comparator<Piloto>(){
				@Override
				public int compare(Piloto p1, Piloto p2){
					return new Integer(p2.getEdadActual()).compareTo(new Integer(p1.getEdadActual()));
				}
			});

		//Collections.sort(imprimir, new Comparator<Integer>);
			for(Piloto p: imprimir){
				System.out.println(p.getApellido()+ ", " +p.getNombre() + "-" + p.getEdadActual());
			}
		
		
			//listamayor
		}
	
	}




