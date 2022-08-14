package exercicio7;

import javax.swing.JTextField;

public abstract class Idade {

	// Parametros

	private double ChicoMetros = 1.50;
	private double ZeMetros = 1.10;
	private int contador;

	// Construtores

	public Idade(double chicoMetros, double zeMetros) {
		super();
		ChicoMetros = chicoMetros;
		ZeMetros = zeMetros;
	}

	public Idade() {
		super();
	}

	// Getters e Setters

	public double getChicoMetros() {
		return ChicoMetros;
	}

	public void setChicoMetros(double chicoMetros) {
		ChicoMetros = chicoMetros;
	}

	public double getZeMetros() {
		return ZeMetros;
	}

	public void setZeMetros(double zeMetros) {
		ZeMetros = zeMetros;
	}

	public String idade() {
		while (ChicoMetros > ZeMetros) {
			ChicoMetros = ChicoMetros + 0.02;
			ZeMetros = ZeMetros + 0.03;
			contador++;
		}
		return "A idade de Chico será: " + contador + " anos, para acalçar Zé";

	}

}
