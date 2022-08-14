package exercicio6;

// 6) Para doar sangue � necess�rio ter entre 18 e 67 anos. Fa�a um aplicativo na
//linguagem Java que pergunte a idade de uma pessoa e diga se ela pode doar sangue
//ou n�o

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
			return "Voc� est� apto a doar sangue.";
		} else {
			return "Voc� n�o pode doar sangue!";
		}
	}

}
