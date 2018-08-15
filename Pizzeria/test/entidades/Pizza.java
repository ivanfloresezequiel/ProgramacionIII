package entidades;

import java.util.Collection;
import java.util.Collections;

public class Pizza {
	private int idPizza;
	private String nombre;
	private Base base;
	private Collection<Cubierta> cubierta;
	private double precio;
	private static int num;
	public Pizza( String nombre,double precio, Base base, Collection<Cubierta> cubierta) {
		
		this.idPizza = num;
		this.nombre = nombre;
		this.base = base;
		this.cubierta = cubierta;
		
		this.precio = precio;
		num++;
	}
	public String getBase() {
		return this.base.nombreBase();
	}

	






}
