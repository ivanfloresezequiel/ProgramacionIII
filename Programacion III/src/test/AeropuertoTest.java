package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import PracticoI.Aeropuerto;
import PracticoI.Ciudad;

class AeropuertoTest {

	@Test
	void ShowDetails_ReturnsFormatted() {

		Ciudad theCity = new Ciudad(1, "La Rioja", "5300");

		Aeropuerto theAirport = new Aeropuerto(1, "AeropuertoEntity Capitán Vicente Almandos Almonacid", "IRJ",
				theCity);

		String returned = theAirport.showDenomination();

		assertEquals("AeropuertoEntity Capitán Vicente Almandos Almonacid - La Rioja - IRJ", returned);

	}

}
