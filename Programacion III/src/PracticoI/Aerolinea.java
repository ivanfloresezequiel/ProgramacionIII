package PracticoI;

public class Aerolinea {
	private int idAerolinea;
	private String nombre;
	private int horasVuelo=0;
	public Aerolinea(int idAerolinea, String nombre) {
		super();
		this.idAerolinea = idAerolinea;
		this.nombre = nombre;
	}
	public int getIdAerolinea() {
		return idAerolinea;
	}
	public void setIdAerolinea(int idAerolinea) {
		this.idAerolinea = idAerolinea;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHorasVuelo() {
		int cantidad=0;
		cantidad= (horasVuelo/60);
		return cantidad;
	}
	public void sumaHoraVuelo(int cantidad){
		horasVuelo+=cantidad;
	}
	
	
	
}
