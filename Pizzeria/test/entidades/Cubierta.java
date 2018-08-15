package entidades;

public class Cubierta {
	private int idCubierta;
	private String nombre;
	private static int num = 0;
	public Cubierta( String nombre) {
		this.idCubierta = num;
		this.nombre = nombre;
		num++;
	}
	
	
	
}
