package projeto;

public class Produto {

	// parametrs

	private String nome;
	private double preco;
	private int quantidadeEstoque;

	// constructors

	public Produto() {
		super();
	}

	public Produto(String nome, double preco, int quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidade;
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

	public int getQuantidade() {
		return quantidadeEstoque;
	}

	public void setQuantidade(int quantidade) {
		this.quantidadeEstoque = quantidade;
	}

	// methods

	boolean verificarEstoque(Produto prod) {
		if (quantidadeEstoque > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Produto: " + nome + " - Preço R$: " + preco;
	}

	/*
	 * verificarEstoque(Produto prod): Este método deve receber por parâmetro um
	 * objeto do tipo Produto, o qual deve ter seu estoque analisado. O retorno deve
	 * ser do tipo boolean, resultando true caso o estoque seja maior que zero ou
	 * false caso esteja zerado.
	 */

}
