package exercicio6;

// 6) Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo na
//linguagem Java que pergunte a idade de uma pessoa e diga se ela pode doar sangue
//ou não

public abstract class Sangue {

	// parametros

	private int idade;

	// construtor

	public Sangue(int idade) {
		super();
		this.idade = idade;
	}

	public Sangue() {
		super();
	}

	// getters e setters

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String doar() {
		if (idade >= 18 && idade <= 67) {
			return "Você está apto a doar sangue.";
		} else {
			return "Você não pode doar sangue!";
		}
	}

}
