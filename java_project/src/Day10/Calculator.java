package Day10;

public class Calculator {
	// 필드(인스턴스 변수, 멤버)
	private int num1;
	private int num2;
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	
	public void sum() {
		System.out.println(num1 + num2);
	}

	public void sub(int n1, int n2) {
		if (n1 >= n2) {
			System.out.println(n1 - n2);
		} else {
			System.out.println(n2 - n1);
		}
	}

	public int mul() {
		return num1 * num2;
	}

	public double div(int n1, int n2) {
		return n1 / (double) n2;
	}
}