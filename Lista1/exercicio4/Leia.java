package exercicio4;

public abstract class Leia {

	// parametros

	private int num1;
	private int num2;

	// construtor

	public Leia(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public Leia() {
		super();
	}

	// getters and setters

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int maiorMenor() {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}

	}

}
