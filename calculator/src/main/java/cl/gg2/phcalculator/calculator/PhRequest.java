package cl.gg2.phcalculator.calculator;

public class PhRequest {
	private String tipo;         // "acido" o "base"
	private String fuerza;       // "fuerte" o "debil"
	private double concentracion;
	private double pka;          // solo si es débil

	// Getters y setters
	public String getTipo() { return tipo; }
	public void setTipo(String tipo) { this.tipo = tipo; }

	public String getFuerza() { return fuerza; }
	public void setFuerza(String fuerza) { this.fuerza = fuerza; }

	public double getConcentracion() { return concentracion; }
	public void setConcentracion(double concentracion) { this.concentracion = concentracion; }

	public double getPka() { return pka; }
	public void setPka(double pka) { this.pka = pka; }
}
