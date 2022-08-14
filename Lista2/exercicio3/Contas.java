package exercicio3;

public abstract class Contas {

	// parameters

	private int numeroConta;
	private String tipoConta;
	private String titularConta;
	private double saldo;

	// constructors

	public Contas() {
		super();
	}

	public Contas(int numeroConta, String tipoConta, String titularConta) {
		super();
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.titularConta = titularConta;
	}

	// getters and setters

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	void depositar(double valor) {
		saldo = saldo + valor;
	}

	void sacar(double valor) {
		if (saldo < valor) {
			System.out.println("Saldo Insuficiente! ");
		} else {
			saldo = saldo - valor;
		}

	}

	public String verificarSaldo() {
		return "Títular da conta: " + titularConta + "\nNumero da conta: " +numeroConta+ "\nTipo da conta: " + tipoConta
				+ "\nSaldo atual: " + saldo;

	}

}
