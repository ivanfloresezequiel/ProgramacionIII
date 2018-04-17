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
	@Override
	public String toString() {
		return "Pasajero [idPasajero=" + idPasajero + ", CUIL=" + CUIL + ", apellido=" + apellido + ", nombres="
				+ nombres + ", telefono=" + telefono + "]";
	}
	public int getIdPasajero() {
		return idPasajero;
	}
	public void setIdPasajero(int idPasajero) {
		this.idPasajero = idPasajero;
	}
	public String getCUIL() {
		return CUIL;
	}
	public void setCUIL(String cUIL) {
		CUIL = cUIL;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
