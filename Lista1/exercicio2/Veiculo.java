package exercicio2;

public abstract class Veiculo {

	// parameters

	private double distancia;
	private double combustivel;

	// constructor

	public Veiculo(double distancia, double gasto) {
		super();
		this.distancia = distancia;
		this.combustivel = gasto;
	}

	public Veiculo() {
		super();
	}

	// Getters and setters

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getGasto() {
		return combustivel;
	}

	public void setGasto(double gasto) {
		this.combustivel = gasto;
	}

	// Methods

	public double media() {
		return distancia / combustivel;
	}
}
