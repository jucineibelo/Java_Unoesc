package exercicio;

public class Gerente extends Funcionario {

	private String area;

	public Gerente(String nome, double salario, String area) {
		super(nome, salario);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public double calculaImposto() {
		return (getSalario() * 5) / 100;
	}

	
	
	@Override
	String ImprimeDados() {
		return "Nome: " + getNome() + "\nSalario: " + getSalario() + "\nImposto: "
				+ calculaImposto() + "\nArea: " + area;
	}

}
