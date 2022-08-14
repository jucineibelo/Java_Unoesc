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
			return " Infelizmente voc� n�o pode votar!";
		} else {
			return " Voc� est� apto a votar!";
		}
	}

}
