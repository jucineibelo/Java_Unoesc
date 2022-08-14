package exercicio3;

public class Principal {

	public static void main(String[] args) {
		Fumante fumante = new Fumante(1, 20, 10) {
		};
		
		System.out.println(fumante.calculo());
	}

}
