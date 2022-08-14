package projeto;

public class Principal {

	public static void main(String[] args) {

		Venda venda = new Venda();
		Pagamento pagamento = new Pagamento();

		Produto batata = new Produto("Batata", 3.90, 200);
		Produto carneBv = new Produto("Carne Bovina", 39.90, 100);
		Produto alface = new Produto("Alface", 2, 30);
		Produto abacaxi = new Produto("Abacaxi", 5, 100);

		System.out.println(abacaxi.verificarEstoque(abacaxi));
		System.out.println(abacaxi.getPreco());
		System.out.println(abacaxi.getNome());
		System.out.println(abacaxi.getQuantidade());

		System.out.println("");

		venda.adicionarItemVenda(abacaxi);
		venda.adicionarItemVenda(alface);
		venda.adicionarItemVenda(batata);
		venda.visualizarVenda();
		System.out.println("");

		pagamento.setTipoPagamento(2);
		venda.concluirVenda(pagamento);

	}

}
