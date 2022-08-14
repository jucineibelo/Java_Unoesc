package exercicio8;

public abstract class Expoente {

	// parametros
	private int base;
	private int expoente;

	// construtores

	public Expoente(int base, int expoente) {
		super();
		this.base = base;
		this.expoente = expoente;
	}

	public Expoente() {
		super();
	}

	// getters e setters

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getExpoente() {
		return expoente;
	}

	public void setExpoente(int expoente) {
		this.expoente = expoente;
	}

	public double calcularExpoente() {
		return Math.pow(base, expoente);

	}

}
