package cl.gg2.phcalculator.calculator;

import java.util.List;

public class TitulacionResponse {
	private double phInicial;
	private double volumenEquivalente;
	private double phFinal;
	private List<TitulacionGraficoPunto> grafico; // <-- NUEVO

	public double getPhInicial() { return phInicial; }
	public void setPhInicial(double phInicial) { this.phInicial = phInicial; }

	public double getVolumenEquivalente() { return volumenEquivalente; }
	public void setVolumenEquivalente(double volumenEquivalente) { this.volumenEquivalente = volumenEquivalente; }

	public double getPhFinal() { return phFinal; }
	public void setPhFinal(double phFinal) { this.phFinal = phFinal; }

	public List<TitulacionGraficoPunto> getGrafico() { return grafico; }
	public void setGrafico(List<TitulacionGraficoPunto> grafico) { this.grafico = grafico; }
}
