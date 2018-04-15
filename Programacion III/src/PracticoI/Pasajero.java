package PracticoI;

public class Pasajero {
	private int idPasajero;
	private String CUIL;
	private String apellido;
	private String nombres;
	private String telefono;
	public Pasajero(int idPasajero, String cUIL, String apellido, String nombres, String telefono) {
		super();
		this.idPasajero = idPasajero;
		CUIL = cUIL;
		this.apellido = apellido;
		this.nombres = nombres;
		this.telefono = telefono;
	}
	
	
}
