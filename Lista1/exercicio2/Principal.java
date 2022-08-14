package exercicio2;

public class Principal {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo() {
		};
		
		veiculo.setDistancia(10000);
		veiculo.setGasto(50);
		
		
		
		
		System.out.println(veiculo.media());
	
		

	}

}
