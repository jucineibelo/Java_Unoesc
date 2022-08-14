package exercicio;

public class Funcionario extends Pessoa {

	// parametrs

	private double salario;

	// constructors

	public Funcionario( String nome, double salario) {
		super(nome);
		this.salario = salario;
	}

	// getters and setters

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// methods

	public double calculaImposto() {
		return (salario * 3) / 100;
	}

	@Override
	String ImprimeDados() {
		return  "Nome: " + getNome() + "\nSalario: " + salario + "\nImposto: " + calculaImposto();
	}

}
