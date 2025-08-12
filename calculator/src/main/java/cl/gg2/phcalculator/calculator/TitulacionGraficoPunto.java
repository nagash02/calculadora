package cl.gg2.phcalculator.calculator;

public class TitulacionGraficoPunto {
	private double volumen;
	private double ph;

	public TitulacionGraficoPunto(double volumen, double ph) {
		this.volumen = volumen;
		this.ph = ph;
	}

	public double getVolumen() { return volumen; }
	public void setVolumen(double volumen) { this.volumen = volumen; }

	public double getPh() { return ph; }
	public void setPh(double ph) { this.ph = ph; }
}
