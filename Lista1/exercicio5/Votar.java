package exercicio5;

public abstract class Votar {

	private int idade;

	public Votar(int idade) {
		super();
		this.idade = idade;
	}

	public Votar() {
		super();
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String podeVotar() {
		if (idade < 16) {
			return " Infelizmente você não pode votar!";
		} else {
			return " Você está apto a votar!";
		}
	}

}
