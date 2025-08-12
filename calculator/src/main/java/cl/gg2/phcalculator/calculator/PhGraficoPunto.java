package cl.gg2.phcalculator.calculator;

public class PhGraficoPunto {
	private double concentracion;
	private double ph;

	public PhGraficoPunto(double concentracion, double ph) {
		this.concentracion = concentracion;
		this.ph = ph;
	}

	public double getConcentracion() { return concentracion; }
	public double getPh() { return ph; }

	public void setConcentracion(double concentracion) { this.concentracion = concentracion; }
	public void setPh(double ph) { this.ph = ph; }
}
