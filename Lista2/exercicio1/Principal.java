package exercicio1;

public class Principal {

	public static void main(String[] args) {
		Calculadora calc = new Calculadora() {
		};
		
		calc.setN1(10);
		calc.setN2(20);
		
		System.out.println(calc.somar());

	}

}
