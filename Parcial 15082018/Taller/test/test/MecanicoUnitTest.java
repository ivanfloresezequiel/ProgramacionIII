package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import clases.Mecanico;

class MecanicoUnitTest {

	//Atributos Mecanico: ID, Apellido, Nombres, Matricula, Fecha de Nacimiento, Direccion
	@Test
	void instanciarMecanico_MecanicoSinMatricula_generaError() {
		
		Mecanico elMecanico=Mecanico.instancia(1, "Perez", "Juan Carlos", null, LocalDate.of(1980, 2, 15),"San Martin 123");
		
		assertNull(elMecanico);		
	}
	
	@Test
	void instanciarMecanico_MecanicoCompleto_instanciaCorrecta() {
		Mecanico elMecanico=Mecanico.instancia(1, "Perez", "Juan Carlos", "1000", LocalDate.of(1980, 2, 15),"San Martin 123");
		
		assertNotNull(elMecanico);		
	}
	
	@Test
	void mostrarMecanico_formatoEspecifico_muestraFormateado() {
		Mecanico elMecanico=Mecanico.instancia(1, "Perez", "Juan Carlos", "1000", LocalDate.of(1980, 2, 15),"San Martin 123");
		String formatoSalida=elMecanico.mostrarMecanico();
		
		assertEquals("Perez, Juan Carlos (1000)", formatoSalida);
	}

}
