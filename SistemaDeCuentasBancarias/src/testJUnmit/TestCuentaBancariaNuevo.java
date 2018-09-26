package testJUnmit;
// CREACION DE CLIENTE Y CREACION DE CAJA DE AHORRO
//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.time.Month;

import org.junit.jupiter.api.Test;

import logica.CuentaBancaria;
import logica.TipoCuentas;

class TestCuentaBancariaNuevo {

	
	
	
	
	@Test
	public void testCuentaBancariaPermDescubierto() {
		TipoCuentas cuentaB = new TipoCuentas("b");
		cuentaB.depositar(50);
		cuentaB.extraer(1060);
		assertEquals(0.00,cuentaB.getDescubierto(),2);
		
	}
	@Test
	public void testCuentaBancariaEspecialUnaSolaExtraccionAlMes() {
		TipoCuentas cuentaA = new TipoCuentas("a");
		cuentaA.depositar(50);
		cuentaA.extraer(25);
		cuentaA.extraer(25);
		assertEquals(25,cuentaA.getSaldo());
		
		
	}
	@Test
	public void testLaCuentaBancariaDebeTenerSaldoCero() {
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
		assertEquals(0.0,  cuentaBancaria1.getSaldo());
	}
	@Test
	public void testCuentaBancariaSePuedeDepositar(){
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
		cuentaBancaria1.depositar(50);
		assertEquals(50, cuentaBancaria1.getSaldo());
	}
	@Test 
	public void testCuentaBancariaSePuedeDepositarMontosMayoresCero(){
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
		cuentaBancaria1.depositar(-500);
		assertEquals(0.0, cuentaBancaria1.getSaldo());
	}
	@Test 
	public void testCuentaBancariasSoloSePuedeExtraerSaldo(){
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
		cuentaBancaria1.depositar(50);
		cuentaBancaria1.extraer(30);
		assertEquals(20, cuentaBancaria1.getSaldo());
	}
	@Test 
	public void testCuentaBancariasSoloSePuedeExtraerSaldoMayorACero(){
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
		cuentaBancaria1.depositar(50);
		cuentaBancaria1.extraer(60);
		assertEquals(0, cuentaBancaria1.getSaldo());
	}
	@Test 
	public void testCuentaBancariasSoloSePuedeExtraerMenorQueSaldo(){
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
		cuentaBancaria1.depositar(50.0);
		cuentaBancaria1.extraer(60.0);
		assertEquals(0, cuentaBancaria1.getSaldo());
	}
	@Test 
	public void testCuentaBancariasConsultarLosMovimientos(){
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
		cuentaBancaria1.depositar(500);
		cuentaBancaria1.extraer(200);

		LocalDateTime dateDesde = LocalDateTime.now();
		LocalDateTime dateHasta = LocalDateTime.now();

		String valorComparar ="DEPOSITO 500.0 26 SEPTEMBER 2018\n" + 
				"ESTRACCI 200.0 26 SEPTEMBER 2018\n";
		assertEquals(valorComparar,cuentaBancaria1.consultarMovimientos(dateDesde, dateHasta));
	}
	public void testCuentaBancariasConsultarLosMovimientosDesdeHasta(){
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
		cuentaBancaria1.depositar(500);
		cuentaBancaria1.extraer(200);

		LocalDateTime dateDesde = LocalDateTime.now();
		LocalDateTime dateHasta = LocalDateTime.now();

		String valorComparar ="DEPOSITO 500.0 25 MAY 2018\n" + 
				"ESTRACCI 200.0 25 MAY 2018\n";
		assertEquals(valorComparar,cuentaBancaria1.consultarMovimientosArreglo(dateDesde, dateHasta));
	}

}
