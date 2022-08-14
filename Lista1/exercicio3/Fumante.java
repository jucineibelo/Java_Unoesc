package exercicio3;

public abstract class Fumante {

	// parameters

	private int numAnos;
	private int cigarrosDia;
	private double precoCarteirra;

	// Constructor

	public Fumante(int numAnos, int cigarrosDia, double precoCarteirra) {
		super();
		this.numAnos = numAnos;
		this.cigarrosDia = cigarrosDia;
		this.precoCarteirra = precoCarteirra;
	}

	public Fumante() {
		super();
	}

	// getters and setters

	public int getNumAnos() {
		return numAnos;
	}

	public void setNumAnos(int numAnos) {
		this.numAnos = numAnos;
	}

	public int getCigarrosDia() {
		return cigarrosDia;
	}

	public void setCigarrosDia(int cigarrosDia) {
		this.cigarrosDia = cigarrosDia;
	}

	public double getPrecoCarteirra() {
		return precoCarteirra;
	}

	public void setPrecoCarteirra(double precoCarteirra) {
		this.precoCarteirra = precoCarteirra;
	}

	public double calculo() {
		return (((precoCarteirra / 20) * cigarrosDia) * (365 * numAnos)) * numAnos;

	}

}
