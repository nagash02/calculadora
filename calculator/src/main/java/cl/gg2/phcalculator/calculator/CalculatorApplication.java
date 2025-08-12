package cl.gg2.phcalculator.calculator;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
@RestController
@RequestMapping("/api/ph")
@CrossOrigin(origins = "*")
class PhController {

	@PostMapping("/ph/calcular")
	@Operation(summary = "Calcular el pH de una sustancia ácida o básica")
	public ResponseEntity<PhResponse> calcularPh(@RequestBody PhRequest request) {
		double pH;
		double C = request.getConcentracion();

		if (request.getFuerza().equalsIgnoreCase("fuerte")) {
			if (request.getTipo().equalsIgnoreCase("acido")) {
				pH = -Math.log10(C);
			} else {
				double pOH = -Math.log10(C);
				pH = 14 - pOH;
			}
		} else {
			double pKa = request.getPka();
			if (request.getTipo().equalsIgnoreCase("acido")) {
				pH = 0.5 * (pKa - Math.log10(C));
			} else {
				double pOH = 0.5 * (pKa - Math.log10(C));
				pH = 14 - pOH;
			}
		}

		PhResponse response = new PhResponse();
		response.setPhEstimado(Math.round(pH * 100.0) / 100.0);
		return ResponseEntity.ok(response);
	}

	@GetMapping("/ph/grafico/debil")
	@Operation(summary = "Obtener puntos de gráfico de pH para ácido débil con pKa=4.75")
	public ResponseEntity<List<PhGraficoPunto>> graficoPhDebil() {
		double pKa = 4.75;
		double[] concentraciones = {1, 0.1, 0.01, 0.001, 0.0001};
		List<PhGraficoPunto> puntos = new ArrayList<>();

		for (double C : concentraciones) {
			double ph = 0.5 * (pKa - Math.log10(C));
			puntos.add(new PhGraficoPunto(C, Math.round(ph * 100.0) / 100.0));
		}

		return ResponseEntity.ok(puntos);
	}

	@PostMapping("/titulacion/calcular")
	@Operation(summary = "Calcular la titulación ácido-base")
	public ResponseEntity<TitulacionResponse> calcularTitulacion(@RequestBody TitulacionRequest request) {
		double volumenAcido = request.getVolumenAcido();
		double concentracionAcido = request.getConcentracionAcido();
		double volumenBase = request.getVolumenBase();
		double concentracionBase = request.getConcentracionBase();

		double equivalencia = (volumenAcido * concentracionAcido) / concentracionBase;
		double phInicial = -Math.log10(concentracionAcido);
		double phFinal = 14 - (-Math.log10(concentracionBase));

		// Simular puntos para la curva
		List<TitulacionGraficoPunto> puntos = new ArrayList<>();
		for (int i = 0; i <= (int) (equivalencia * 2); i++) {
			double ph;
			if (i < equivalencia) {
				ph = 2 + i * 0.2;
			} else if (i == (int) equivalencia) {
				ph = 7;
			} else {
				ph = 7 + (i - equivalencia) * 0.3;
			}
			puntos.add(new TitulacionGraficoPunto(i, Math.round(ph * 100.0) / 100.0));
		}

		TitulacionResponse response = new TitulacionResponse();
		response.setPhInicial(Math.round(phInicial * 100.0) / 100.0);
		response.setVolumenEquivalente(Math.round(equivalencia * 100.0) / 100.0);
		response.setPhFinal(Math.round(phFinal * 100.0) / 100.0);
		response.setGrafico(puntos); // <-- Agregado

		return ResponseEntity.ok(response);
	}

	@GetMapping("/titulacion/grafico")
	@Operation(summary = "Obtener gráfico simulado de curva de titulación")
	public ResponseEntity<List<TitulacionGraficoPunto>> graficoTitulacion() {
		List<TitulacionGraficoPunto> puntos = new ArrayList<>();

		for (int i = 0; i <= 30; i++) {
			double ph;
			if (i < 14) ph = 2 + i * 0.2;
			else if (i == 15) ph = 7;
			else ph = 7 + (i - 15) * 0.3;
			puntos.add(new TitulacionGraficoPunto(i, Math.round(ph * 100.0) / 100.0));
		}

		return ResponseEntity.ok(puntos);
	}
}

