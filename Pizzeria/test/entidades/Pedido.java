package entidades;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;



public class Pedido {
	private int idPedido;
	private String nombre;
	private String domicilio;
	private double importe;
	private LocalDate fechaEntrega;
	private Collection<Pizza> pizzas = new LinkedList<Pizza>();
	private static int num=0;
	public Pedido(String nombre, String domicilio, double importe, LocalDate fechaEntrega,
			Collection<Pizza> pizzas) {
		this.idPedido = num;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.importe = importe;
		this.fechaEntrega = fechaEntrega;
		this.pizzas.addAll(pizzas);
		num++;
	}
	public Pedido(String nombre2, String domicilio2, double importe2, LocalDate of, Pizza pizzaNapolitana) {
		this.idPedido = num;
		this.nombre = nombre2;
		this.domicilio = domicilio2;
		this.importe = importe2;
		this.fechaEntrega = of;
		this.pizzas.add(pizzaNapolitana);
		num++;
	}
	public double importeTotal() {
		
		return importe;
	}
	public Collection<Pizza> getPizzas() {
		
		return pizzas;
	}
	public void agregarPizza(Pizza pizzaFugazzeta) {
		this.pizzas.add(pizzaFugazzeta);
		
	}
	






}

