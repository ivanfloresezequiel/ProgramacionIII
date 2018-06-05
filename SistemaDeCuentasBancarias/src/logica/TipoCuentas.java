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
		LocalDate fechaActual = LocalDate.now();
		if(tipoCuenta == "a") {
			if(ultimoDeposito.getMonthValue() != fechaActual.getMonthValue() || ultimoDeposito.getYear() != fechaActual.getYear()) {
				super.extraer(montoDinero);
			}
		}
		if(tipoCuenta == "b") {
			if(this.saldo < montoDinero && this.descubierto >-1000) {
				if(descubierto >= montoDinero - this.saldo) {
					montoDinero-=this.saldo;
					this.saldo=0.0;
					descubierto-= montoDinero;
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
