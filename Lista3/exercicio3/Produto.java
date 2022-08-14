package exercicio3;

public abstract class Produto {

	// parameters

	private String nome;
	private double preco;
	private double peso;
	private double aumento;
	private double total;

	// constructors

	public Produto() {
		super();
	}

	public Produto(String nome, double preco, double peso) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}

	// getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// methods

	String aumentarPreco(Produto p) {
		System.out.println("Preço Atual: " + preco);
		if (preco < 50) {
			aumento = preco * 0.2;
			total = preco + aumento;

		} else {
			aumento = preco * 0.1;
			total = preco + aumento;
		}
		return "Reajuste de R$: " +aumento + " o preço final ficou de R$: "+total+".";
	}

}
