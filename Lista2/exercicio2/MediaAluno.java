package exercicio2;

public abstract class MediaAluno {

	// parameters

	private String nome;
	private int idade;
	private double n1;
	private double n2;
	private double n3;
	private double media;

	// constructors

	public MediaAluno() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double calcularMedia() {
		return media = (n1 + n2 + n3) / 3;
	}

	public String verificarAprovacao() {
		if (media < 5) {
			return "Aluno: " + nome + "\nIdade: " + idade + "\nNota: " + media + "\nReprovado!";
		} else if (media >= 5 && media < 7) {
			return "Aluno: " + nome + "\nIdade: " + idade + "\nNota: " + media + "\nEm exame!";
		} else {
			return "Aluno: " + nome + "\nIdade: " + idade + "\nNota: " + media + "\nAprovado!";
		}
	}

}
