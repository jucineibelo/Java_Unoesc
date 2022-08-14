package exercicio;

import java.util.ArrayList;

public class CadastroPessoas {

	private ArrayList<Pessoa> listaPessoa = new ArrayList<>();

	public CadastroPessoas() {
		super();
	}

	public CadastroPessoas(ArrayList<Pessoa> listaPessoa) {
		super();
		this.listaPessoa = listaPessoa;
	}

	public ArrayList<Pessoa> getListaPessoa() {
		return listaPessoa;
	}

	public void setListaPessoa(ArrayList<Pessoa> listaPessoa) {
		this.listaPessoa = listaPessoa;
	}

	void cadastraPessoa(Pessoa pess) {
		listaPessoa.add(pess);

	}

	void imprimeCadastro() {
		for (int i = 0; i < listaPessoa.size(); i++) {
			Pessoa aux = listaPessoa.get(i);
			System.out.println(aux.getNome());

		}

	}

}
