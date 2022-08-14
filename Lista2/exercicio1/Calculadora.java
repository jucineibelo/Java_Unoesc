package exercicio1;

public abstract class Calculadora {

	// parameters

	private double n1;
	private double n2;

	//constructors 

	public Calculadora() {
		super();
	}

	public Calculadora(double n1, double n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}

	// getters and setters

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	// methods

	public double somar() {
		return n1 + n2;
	}

	public double subtrair() {
		return n1 - n2;
	}

	public double multiplicar() {
		return n1 * n2;
	}

	public double dividir() {
		return n1 / n2;
	}

}
