package logica;

import java.time.LocalDateTime;

public class Movimiento {
	private LocalDateTime fechaYHoraDelMoviento;
	private String descripcionDelMovimiento;
	private double montoDelMovimiento;
	
	
	
	public Movimiento(String descripcionDelMovimiento, double montoDelMovimiento) {
		super();
		this.fechaYHoraDelMoviento = fechaYHoraDelMoviento.now();
		this.descripcionDelMovimiento = descripcionDelMovimiento;
		this.montoDelMovimiento = montoDelMovimiento;
	}
	public LocalDateTime getFechaYHoraDelMoviento() {
		return fechaYHoraDelMoviento;
	}

	public String getDescripcionDelMovimiento() {
		return descripcionDelMovimiento;
	}

	public double getMontoDelMovimiento() {
		return montoDelMovimiento;
	}
	
	
	
}
