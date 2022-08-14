package exercicio;

public class TesteCadastro {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(666, "Tiburciano");
		Funcionario funcionario = new Funcionario( "Julio", 4250);
		Gerente gerente = new Gerente("Diery", 5600, "Coisa");

	

		CadastroPessoas cadastro = new CadastroPessoas();

		cadastro.cadastraPessoa(gerente);
		cadastro.cadastraPessoa(funcionario);
		cadastro.cadastraPessoa(cliente);
		
		cadastro.imprimeCadastro();
		
		System.out.println(cliente.ImprimeDados());
		System.out.println(funcionario.ImprimeDados());
		System.out.println(gerente.ImprimeDados());

	}

}
