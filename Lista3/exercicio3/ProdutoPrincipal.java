package exercicio3;

public class ProdutoPrincipal {
	public static void main(String[] args) {
		
		Produto pao = new Produto() {
		};
		
		pao.setNome("Mortadela");
		pao.setPeso(5);
		pao.setPreco(60);
		
		
		System.out.println(pao.aumentarPreco(pao));
	}

}
