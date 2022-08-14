package exercicio1;

public abstract class Veiculo {

	// parametros

	private int ano;
	private String modelo;
	private String cor;
	private double quilometragem;
	private String novaCor;

	// construtor

	public Veiculo() {
		super();
	}

	// getters and setters

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;

	}

	public String getNovaCor() {
		return novaCor;
	}

	public void setNovaCor(String novaCor) {
		this.novaCor = novaCor;
	}

	public String verificarManutencao() {
		if (quilometragem < 25000) {
			return "Tudo ok";
		} else if (quilometragem >= 25000 && quilometragem < 75000) {
			return "Realizar revisão parcial!";
		} else {
			return "Realizar revisão completa!";
		}
	}

	public String mudarCor() {
		return this.cor = novaCor;

	}

	public String exibirCor() {
		return "A cor do veiculo é: " + this.cor;
	}

}
