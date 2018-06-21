package PracticoI;

import java.text.SimpleDateFormat;
import java.time.Duration;
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

	private String codigoVuelo;
	private Aeropuerto salida;
	private LocalDateTime fechaHoraSalida;
	private Aeropuerto arribo;
	private LocalDateTime fechaHoraArribo;
	private Aerolinea aerolinea;
	private Collection<Piloto> listaPilotos;
	private Avion avion;
	private Collection<Asignacion> pasajeros;

	public Vuelo(String condigoVuelo, Aeropuerto salida, LocalDateTime fechaHoraSalida, Aeropuerto arribo,
			LocalDateTime fechaHoraArribo, Aerolinea aerolinea, Collection<Piloto> listaPilotos, Avion avion,
			Collection<Asignacion> pasajeros) {

		this.codigoVuelo = condigoVuelo;
		this.salida = salida;
		this.fechaHoraSalida = fechaHoraSalida;
		this.arribo = arribo;
		this.fechaHoraArribo = fechaHoraArribo;
		this.aerolinea = aerolinea;
		this.listaPilotos = (LinkedList<Piloto>) listaPilotos;
		this.avion = avion;
		this.pasajeros = (LinkedList<Asignacion>) pasajeros;

	}

	public Collection<Piloto> getListaPilotos() {
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

	public Collection<Asignacion> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(LinkedList<Asignacion> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public String getCondigoVuelo() {
		return codigoVuelo;
	}

	public void setCondigoVuelo(String condigoVuelo) {
		this.codigoVuelo = condigoVuelo;
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

	public int duracionVueloEnMinutos() {

		return (int) Duration.between(fechaHoraSalida, fechaHoraArribo).toMinutes();
	}

	public String getDetails() {

		String resultado = "Vuelo " + this.codigoVuelo + " - " + avion.getModelo() + "\r\n"
				+ fechaHoraSpanish(fechaHoraSalida) + " " + salida.getCodigo() + " (" + salida.getCiudad().getNombre()
				+ " - " + salida.getNombre() + ")" + "\r\n" + fechaHoraSpanish(fechaHoraArribo) + " "
				+ arribo.getCodigo() + " (" + arribo.getCiudad().getNombre() + " - " + arribo.getNombre() + ")" + "\r\n"
				+ "Operado por " + aerolinea.getNombre() + "." + " Duracion " + this.duracionVueloEnMinutos() / 60
				+ "h " + this.duracionVueloEnMinutos() % 60 + "m";

		return (resultado);

	}

	public String fechaHoraSpanish(LocalDateTime departureDateTime) {
		Locale regionArgentina = new Locale("es", "AR");
		return Character.toUpperCase(departureDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, regionArgentina).charAt(0))
				+ departureDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, regionArgentina)
						.substring(1, departureDateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, regionArgentina).length())
						.toLowerCase()
				+ " " + departureDateTime.getDayOfMonth() + " de "
				+ departureDateTime.getMonth().getDisplayName(TextStyle.FULL, regionArgentina) + " "
				+ departureDateTime.getHour() + ":" + departureDateTime.getMinute();
	}

}
