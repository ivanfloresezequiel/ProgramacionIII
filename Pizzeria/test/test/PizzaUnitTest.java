package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class PizzaUnitTest {

	@Test
	void instanciarPizza_pizzaConBase_ReturnBase() {
		Pizza unaPizza=new Pizza("Napolitana",100.80d,new Base("Masa tipo"),cubiertaNapolitana());
		
		assertEquals("Masa Tipo", unPedido.getBase());
	}

	private Collection<Cubierta> cubiertaNapolitana() {
		Cubierta salsa= new Cubierta("Salsa tomate");
		Cubierta queso=new Cubierta("Mozzarela");
		Cubierta morron= new Cubierta("Tomate");
		Cubierta oregano= new Cubierta("Oregano");
		
		return new LinkedList<Cubierta>(Arrays.asList(salsa,queso,morron,oregano));
	}


}
