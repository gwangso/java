package Day09;

public class Calculator {
	// 필드(인스턴스 변수)
	int num1; // class필드 1
	int num2; // class필드 2

	// 메서드
	// 메서드명 sum, 리턴타입 X, 매개변수 X, 실행문구 : 필드 num1+num2 출력
	public void sum() {
		System.out.println(num1 + num2);
	}

	// 메소드명 sub, 리턴타입 X, 매개변수 정수 두개, 실행문구 매개변수 두개의 차
	public void sub(int a, int b) {
		if (a >= b) {
			System.out.println("a가 큰 경우" + (a - b));
		} else {
			System.out.println("b가 큰 경우" + (b - a));
		}
	}

	// 메소드명 mul, 리턴타입 o, 매개변수 x, 실행문구 : 필드 num1*num2 리턴
	public int mul() {
		return num1 * num2;
	}

	// 메소드명 div, 리턴타입 o, 매개변수 정수 두개, 실행문구: 매개변수 나눈값 리턴
	public double div(int a, int b) {
		if (a >= b) {
			return a / (double) b;
		} else {
			return b / (double) a;
		}
	}

}
