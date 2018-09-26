package logica;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TipoCuentas extends CuentaBancaria {
	private String tipoCuenta;
	private double descubierto=0.0;
	private LocalDate ultimoDeposito= LocalDate.now().minusYears(1);
	public TipoCuentas(String a) {
		tipoCuenta = a;
	}
	public void extraer(double montoDinero) {
		double aux;
		LocalDate fechaActual = LocalDate.now();
		if(tipoCuenta == "a") {
			if(ultimoDeposito.getMonthValue() != fechaActual.getMonthValue() || ultimoDeposito.getYear() != fechaActual.getYear()) {
				ultimoDeposito = fechaActual;
				System.out.println(ultimoDeposito);
				
				super.extraer(montoDinero);
			}
		}
		if(tipoCuenta == "b") {
			if(this.saldo < montoDinero && this.descubierto > -1000) {
				aux= descubierto + (this.saldo - montoDinero); 
				if(aux >= -1000) {
					
					this.saldo=0.0;
					descubierto= aux;
				}
			}
		}
		else{
			super.extraer(montoDinero);
		}
		
	}
	
	public Double getDescubierto() {
		
		return this.descubierto;
	}
	

}
