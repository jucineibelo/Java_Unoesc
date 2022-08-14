package exercicio1;

public abstract class Exibir {
	
	// parametros
	private double numero;

	// construtor

	public Exibir() {
		super();
	}

	// getters and setters

	public double getNumero() {
		return numero;
	}

	public void setNumero(double numero) {
		this.numero = numero;
	}

	// method
	public double sucessor(double a) {
		return a + 1;
	}
	
	public double antecessor(double a) {
		return a -1;
	}

}

