package exercicio;

public abstract class Pessoa {

	// parametro

	private String nome;

	// construtor

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	// getters and setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// methods

	abstract String ImprimeDados();

}
