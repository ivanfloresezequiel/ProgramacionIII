package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class PedidoUnitTest {

	@Test
	void instanciarPedido_pedidoSinPizza_ReturnFalse() {
		Pizza pizzaNapolitana=new Pizza("Napolitana",100.80d,new Base("Masa tipo"),cubiertaNapolitana());
		Pedido unPedido = new Pedido("Perez, Juan","San Martin 123",0d,LocalDate.of(2018, 07, 02),unaPizza);
		
		assertEquals(1, unPedido.getPizzas().size());
	}
	
	@Test
	void agregarPizza_pedidoConPizza_incrementaColeccion() {
		Pizza pizzaNapolitana=new Pizza("Napolitana",100.80d,new Base("Masa tipo"),cubiertaNapolitana());
		Pedido unPedido = new Pedido("Perez, Juan","San Martin 123",0d,LocalDate.of(2018, 07, 02),unaPizza);
		
		Pizza pizzaFugazzeta = new Pizza("Fugazzeta", 150.25d, new Base("Masa tipo"), cubiertaFugazzeta());
		unPedido.agregarPizza(pizzaFugazzeta);
		
		assertEquals(2, unPedido.getPizzas().size());
	}

	
	private Collection<Cubierta> cubiertaNapolitana() {
		Cubierta salsa= new Cubierta("Salsa tomate");
		Cubierta queso=new Cubierta("Mozzarela");
		Cubierta morron= new Cubierta("Tomate");
		Cubierta oregano= new Cubierta("Oregano");
		
		return new LinkedList<Cubierta>(Arrays.asList(salsa,queso,morron,oregano));
	}
	private Collection<Cubierta> cubiertaFugazzeta() {
		Cubierta salsa = new Cubierta("Salsa tomate");
		Cubierta queso = new Cubierta("Mozzarela");
		Cubierta cebolla = new Cubierta("Cebolla");
		Cubierta parmesano = new Cubierta("Parmesano");

		return new LinkedList<Cubierta>(Arrays.asList(salsa, queso, cebolla, parmesano));
	}

}
