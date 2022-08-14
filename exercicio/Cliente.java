package exercicio;

public class Cliente extends Pessoa {

	// parameters

	private int codigo;

	// constructrs

	public Cliente(int codigo, String nome) {
		super(nome);
		this.codigo = codigo;
	}

	// getters and setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String ImprimeDados() {
		return "Nome: " + getNome() + "\nCódigo: " + codigo;

	}

}
