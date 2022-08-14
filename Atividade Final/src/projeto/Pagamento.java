package projeto;

public class Pagamento {

	// parameters

	private int tipoPagamento;

	// constructors

	public Pagamento(int tipoPagamento) {
		super();
		this.tipoPagamento = tipoPagamento;
	}

	public Pagamento() {
		super();
	}

	// getters and setters

	public int getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(int tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	// methods

	/*
	 * Pagamento: selecionarTipoPagamento(int pag): Este método deve receber por
	 * parâmetro um valor inteiro indicando a escolha do pagamento, 1 para Dinheiro,
	 * 2 para Cheque ou 3 para Cartão e armazenar este valor inteiro na variável
	 * tipoPagamento.
	 */

	public void selecionarTipoPagamento(int pag) {
		if (pag == 1) {
			tipoPagamento = pag;
		} else if (pag == 2) {
			tipoPagamento = pag;
		} else if (pag == 3) {
			tipoPagamento = pag;
		} else {
			System.out.println("Opção Invalida");
		}
	}

	/*
	 * realizarPagamento(Pagamento pag): Este método deve receber por parâmetro um
	 * objeto do tipo Pagamento e através do seu atributo tipoPagamento, exibir na
	 * tela a informação que o pagamento foi realizado juntamente com o tipo de
	 * pagamento escolhido
	 */
	public void realizarPagamento(Pagamento pag) {
		if (pag.getTipoPagamento() == 1) {
			System.out.println("Você selecionou dinheiro, pagamento realizado com sucesso!");
		} else if (pag.getTipoPagamento() == 2) {
			System.out.println("Você selecionou cheque, pagamento realizado com sucesso!");
		} else if (pag.getTipoPagamento() == 3) {
			System.out.println("Você selecionou Cartão, pagamento realizado com sucesso!");
		} else {
			System.out.println("Opção Invalida");
		}
	}

}
