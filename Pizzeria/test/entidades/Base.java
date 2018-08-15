package entidades;

public class Base {
	private int base;
	private String nombre;
	private static int num;
	
	public Base(String pNombre) {
		this.base = num;
		this.nombre = pNombre;
		num++;
	}
	public String nombreBase() {
		return this.nombre;
	}
}
