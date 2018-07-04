package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

class GestorPedidoUnitTest {

	@Test
	void crearPedido_creacionCorrecta() {

		GestorPedido elGestor = new GestorPedido(new LinkedList<Pedido>());

		elGestor.crearPedido(factoryPedido());
		int pedidosLuegoDeCrear = elGestor.getColeccionPedidos().size();

		assertEquals(1,pedidosLuegoDeCrear);

	}
	
	
	@Test
	void crearPedido_pedidoSinPizza_creacionIncorrecta() {

		GestorPedido elGestor = new GestorPedido(new LinkedList<Pedido>());

		elGestor.crearPedido(factoryPedidoIncompleto());
		int pedidosLuegoDeCrear = elGestor.getColeccionPedidos().size();
		
		assertEquals(0,pedidosLuegoDeCrear);

	}
	
	@Test
	void crearPedido_pedidoSinCliente_creacionIncorrecta() {

		GestorPedido elGestor = new GestorPedido(new LinkedList<Pedido>());

		elGestor.crearPedido(factoryPedidoSinCliente());
		int pedidosLuegoDeCrear = elGestor.getColeccionPedidos().size();
		
		assertEquals(0,pedidosLuegoDeCrear);

	}
	
	@Test
	void calcularPrecio_pedidoCompleto_returnsPrecio() {
		Pedido unPedido = factoryPedido();
		
		assertEquals(251.05d, unPedido.importeTotal(),2);
	}
	
	
	private Pedido factoryPedido() {
		Pizza pizzaNapolitana = new Pizza("Napolitana", 100.80d, new Base("Masa tipo"), cubiertaNapolitana());
		Pizza pizzaFugazzeta = new Pizza("Fugazzeta", 150.25d, new Base("Masa tipo"), cubiertaFugazzeta());
		
		Pedido unPedido = new Pedido("Perez, Juan","San Martin 123",0d,LocalDate.of(2018, 07, 02),pizzaNapolitana);
		unPedido.agregarPizza(pizzaFugazzeta);

		return unPedido;
	}
	
	private Pedido factoryPedidoIncompleto() {
		return new Pedido("Perez, Juan","San Martin 123",0d,LocalDate.of(2018, 07, 02),null);
	}
	

	private Pedido factoryPedidoSinCliente() {
		return new Pedido(null,null,0d,LocalDate.of(2018, 07, 02),pizzaNapolitana);
	}


	private Collection<Cubierta> cubiertaNapolitana() {
		Cubierta salsa = new Cubierta("Salsa tomate");
		Cubierta queso = new Cubierta("Mozzarela");
		Cubierta morron = new Cubierta("Tomate");
		Cubierta oregano = new Cubierta("Oregano");

		return new LinkedList<Cubierta>(Arrays.asList(salsa, queso, morron, oregano));
	}
	private Collection<Cubierta> cubiertaFugazzeta() {
		Cubierta salsa = new Cubierta("Salsa tomate");
		Cubierta queso = new Cubierta("Mozzarela");
		Cubierta cebolla = new Cubierta("Cebolla");
		Cubierta parmesano = new Cubierta("Parmesano");

		return new LinkedList<Cubierta>(Arrays.asList(salsa, queso, cebolla, parmesano));
	}

}
