package logica;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Locale;

public class CuentaBancaria {
	protected double saldo = 0.0;

	protected ArrayList<Movimiento> movimientosCuenta = new ArrayList<>();   

	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double montoDinero) {
		if (montoDinero > 0){
			saldo += montoDinero;
			Movimiento movimientoDeposito = new Movimiento("DEPOSITO", montoDinero);
			movimientosCuenta.add(movimientoDeposito);
		}
	}

	
	public void extraer(double montoDinero) {
		if ((montoDinero>0)&&(montoDinero <= saldo)) {
			saldo -= montoDinero;
			Movimiento movimientoExtraxion = new Movimiento("ESTRACCI", montoDinero);
			movimientosCuenta.add(movimientoExtraxion);
		}
		else 
			saldo = 0;
	} 
	public String consultarMovimientos(LocalDateTime dateDesde, LocalDateTime dateHasta) {
		String variableCarga ="";
		
		if (dateDesde.compareTo(dateHasta)<= 0) {
			System.out.println("MOVIMIENTOS\nDesde: "+dateDesde.getDayOfMonth()+" "+dateDesde.getMonth()+" "+
		dateDesde.getYear()+" "+dateDesde.getHour()+":"+dateDesde.getMinute()+" Hasta: "+dateHasta.getYear()+" "+
		dateHasta.getDayOfMonth()+" "+dateHasta.getMonth()+" "+
		dateHasta.getHour()+":"+dateHasta.getMinute());
			
			for (Movimiento movimiento : movimientosCuenta) {
				System.out.println(variableCarga +=(movimiento.getDescripcionDelMovimiento()+" "
									+movimiento.getMontoDelMovimiento()+" "
									+movimiento.getFechaYHoraDelMoviento().getDayOfMonth()+" "
									+movimiento.getFechaYHoraDelMoviento().getMonth()+" "
									+movimiento.getFechaYHoraDelMoviento().getYear()+'\n'));
			}
		}
		return variableCarga;
	}
	public ArrayList<Movimiento> consultarMovimientosArreglo(LocalDateTime dateDesde, LocalDateTime dateHasta) {
		ArrayList<Movimiento> movimientosDesdeHasta = new ArrayList<>();
		
		if (dateDesde.compareTo(dateHasta)<= 0) {
			for (Movimiento movimiento : movimientosCuenta) {
				if((movimiento.getFechaYHoraDelMoviento().compareTo(dateHasta))>=0 &&
						movimiento.getFechaYHoraDelMoviento().compareTo(dateDesde)<=0) {
					movimientosDesdeHasta.add(movimiento);
				}
			}
		}
		return movimientosDesdeHasta;
	}


}
