package Taller.test.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import Taller.src.clases.*;

class ServiceUnitTest {

	//Atributos Service: ID, Vehiculo, Cliente, Fecha de Service, Detalle, Precio Final

	@Test
	void instanciarService_ServiceSinVehiculo_generaError() {

		Cliente elCliente=Cliente.instancia(1, "Lopez", "Juan Manuel", "30123456", LocalDate.of(1990, 5, 20),"9 de Julio 1000","3825405060");
		Service elService=Service.instancia(1, null, elCliente, LocalDate.of(2018, 10, 10),"Cambio de Aceite y Filtro",1500.00f);
		
		assertNull(elService);		
	}
	
	@Test
	void instanciarService_ServiceCompleto_instanciaCorrecta() {
		Vehiculo elVehiculo=Vehiculo.instancia(1, "VW Golf", "ABC123", 2009);
		Cliente elCliente=Cliente.instancia(1, "Lopez", "Juan Manuel", "30123456", LocalDate.of(1990, 5, 20),"9 de Julio 1000","3825405060");
		Service elService=Service.instancia(1, elVehiculo, elCliente, LocalDate.of(2018, 10, 10),"Cambio de Aceite y Filtro",1500.00f);
		
		assertNotNull(elService);		
	}
	
	@Test
	void mostrarResumen_formatoEspecifico_muestraFormateado() {
		Vehiculo elVehiculo=Vehiculo.instancia(1, "VW Golf", "ABC123", 2009);
		Cliente elCliente=Cliente.instancia(1, "Lopez", "Juan Manuel", "30123456", LocalDate.of(1990, 5, 20),"9 de Julio 1000","3825405060");
		Service elService=Service.instancia(1, elVehiculo, elCliente, LocalDate.of(2018, 10, 10),"Cambio de Aceite y Filtro",1500.05f);
		
		String formatoSalida=elService.mostrarResumen();
		
		assertEquals("Service Nro: 1\nCliente: Lopez, Juan Manuel - 3825405060\nVehiculo: VW Golf modelo 2009 - Patente ABC123\nTrabajo Realizado: Cambio de Aceite y Filtro\nTotal: $ 1500.05", formatoSalida);
	}

}
