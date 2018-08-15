package test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;

import clases.Cliente;
import clases.Vehiculo;

class ClienteUnitTest {

	// Atributos Cliente: ID, Apellido, Nombres, Documento, Fecha de Nacimiento, Direccion, Telefono, coleccionVehiculos

	@Test
	void instanciarCliente_ClienteSinDocumento_generaError() {

		Cliente elCliente=Cliente.instancia(1, "Lopez", "Juan Manuel", null, LocalDate.of(1990, 5, 20),"9 de Julio 1000","3825405060");
		
		assertNull(elCliente);		
	}
	
	@Test
	void instanciarCliente_ClienteCompleto_instanciaCorrecta() {
		Cliente elCliente=Cliente.instancia(1, "Lopez", "Juan Manuel", "30123456", LocalDate.of(1990, 5, 20),"9 de Julio 1000","3825405060");
		
		assertNotNull(elCliente);		
	}
	
	@Test
	void mostrarCliente_formatoEspecifico_muestraFormateado() {
		Cliente elCliente=Cliente.instancia(1, "Lopez", "Juan Manuel", "30123456", LocalDate.of(1990, 5, 20),"9 de Julio 1000","3825405060");
		String formatoSalida=elCliente.mostrarCliente();
		
		assertEquals("Lopez, Juan Manuel - 3825405060", formatoSalida);
	}
	
	@Test
	void asignarVehiculo_vehiculoCompleto_asignacionExitosa() {
		Vehiculo elVehiculo=Vehiculo.instancia(1, "VW Golf", "ABC123", 2009);
		Cliente elCliente=Cliente.instancia(1, "Lopez", "Juan Manuel", "30123456", LocalDate.of(1990, 5, 20),"9 de Julio 1000","3825405060");
		
		elCliente.asignarVehiculo(elVehiculo);
		
		assertEquals(1, elCliente.devolverVehiculos().size());
		
	}
	
	@Test
	void devolverVehiculos_clienteConVehiculos_coleccionConDatos() {
		Vehiculo vwGolf=Vehiculo.instancia(1, "VW Golf", "ABC123", 2009);
		Vehiculo toyotaCorolla=Vehiculo.instancia(1, "Toyota Corolla", "XYZ890", 2009);
		Cliente elCliente=Cliente.instancia(1, "Lopez", "Juan Manuel", "30123456", LocalDate.of(1990, 5, 20),"9 de Julio 1000","3825405060");
		elCliente.asignarVehiculo(vwGolf);
		elCliente.asignarVehiculo(toyotaCorolla);
		
		List<Vehiculo> losVehiculos=elCliente.devolverVehiculos();
		
		assertEquals(2, losVehiculos.size());
		
	}
	
	@Test
	void devolverVehiculos_clienteSinVehiculos_coleccionSinDatos() {
		Cliente elCliente=Cliente.instancia(1, "Lopez", "Juan Manuel", "30123456", LocalDate.of(1990, 5, 20),"9 de Julio 1000","3825405060");
		
		List<Vehiculo> losVehiculos=elCliente.devolverVehiculos();

		assertEquals(0, losVehiculos.size());
		
	}

}
