package PracticoI;

public class Asiento {
	private int idAsiento;
	private String identificacion;
	public Asiento(int idAsiento, String identificacion) {
		this.idAsiento = idAsiento;
		this.identificacion= identificacion;
	}
	public int getIdAsiento() {
		return idAsiento;
	}
	public void setIdAsiento(int idAsiento) {
		this.idAsiento = idAsiento;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
	

}
