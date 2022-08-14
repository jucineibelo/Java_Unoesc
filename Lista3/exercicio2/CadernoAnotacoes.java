package exercicio2;

import java.util.ArrayList;

public abstract class CadernoAnotacoes {

	// atributes

	private ArrayList<String> listaAnotacoes = new ArrayList<>();
	private String anotacao;

	// getters and setters

	public ArrayList getListaAnotacoes() {
		return listaAnotacoes;
	}



	public String getAnotacao() {
		return anotacao;
	}
	
	// methods

	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}

	public void setListaAnotacoes(ArrayList<String> listaAnotacoes) {
		this.listaAnotacoes = listaAnotacoes;
	}

	void adicionarAnotacao() {
		listaAnotacoes.add(anotacao);
	}

	void apagarAnotacoes() {
		listaAnotacoes.clear();
	}

	public String visualizarAnotacoes() {
		if (listaAnotacoes.isEmpty()) {
			return "Lista de anotações vazia";  
		} else {
			return "Lista de anotações: " + listaAnotacoes+"\n";
		}
	}

}
