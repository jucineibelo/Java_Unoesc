package projeto;

import java.util.ArrayList;

public class Venda {

	// parameters

	private double vlrTotal;
	private ArrayList<Produto> listavenda = new ArrayList<>();

	// constructors

	public Venda() {
		super();
	}

	public Venda(double vlrTotal, ArrayList<Produto> listavenda) {
		super();
		this.vlrTotal = vlrTotal;
		this.listavenda = listavenda;
	}

	// getters and setters

	public double getVlrTotal() {
		return vlrTotal;
	}

	public void setVlrTotal(double vlrTotal) {
		this.vlrTotal = vlrTotal;
	}

	public ArrayList<Produto> getListavenda() {
		return listavenda;
	}

	public void setListavenda(ArrayList<Produto> listavenda) {
		this.listavenda = listavenda;
	}

	// methods

	/*
	 * adicionarItemVenda(Produto prod): Este método deve receber um produto como
	 * parâmetro e adicioná-lo em uma lista. Importante também que ao adicionar um
	 * novo produto nesta lista a variável vlrTotal seja atualizada somando o valor
	 * total de cada produto adicionado
	 */

	public void adicionarItemVenda(Produto prod) {
		listavenda.add(prod);
		vlrTotal = vlrTotal + prod.getPreco();

	}

	/*
	 * visualizarVenda(): Método sem parâmetro que tem como principal objetivo
	 * exibir na tela a lista de produtos que foram adicionados pelo método
	 * adicionarItemVenda().
	 */

	public void visualizarVenda() {
		for (int i = 0; i < listavenda.size(); i++) {
			System.out.println(listavenda.get(i));
		}
	}

	/*
	 * concluirVenda(): Este método recebe por parâmetro um objeto do tipo
	 * Pagamento, e deve exibir o valor total da venda, assim como chamar o método
	 * realizarPagamento() para que seja exibida a opção de pagamento utilizada ao
	 * concluir a venda. Ao terminar a venda a lista contendo os produtos da venda
	 * deve ser esvaziada para que possa aceitar os produtos para uma nova venda.
	 */

	public void concluirVenda(Pagamento pag) {
		System.out.println("Valor total R$: "+vlrTotal);
		pag.realizarPagamento(pag);
		// listavenda = new ArrayList<>();
		listavenda.clear();

	}

}
