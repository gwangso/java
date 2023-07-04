package Day08;

public class Calculator {
	int num1;
	int num2;
	int result;
	
	// 메서드명 : sum , 리턴타입 : X, 매개변수 : 없음, 실행문구 : 필드 num1+num2
	public void sum() {
		System.out.println(num1 + num2);
	}
	
	// 메서드명 : sub, 리턴타입 : X, 매개변수 : int2개, 실행문구 : 매개변수 두개의 합 출력 
	public void sub(int num1, int num2){
		System.out.println(num1-num2);
	}
	
	// 메서드명 : mul, 리턴타입 : o, 매개변수 : x, 실행문구 : 필드 num1*num2
	public int mul() {
		return num1*num2;
	}
	
	// 메서드명 : div, 리턴타입 : o, 매개변수 : 없음, 실행문구 : 매개변수 두개의 나누기 출력
	public double div(int a, int b) {
		return a/(double)b;
	}
}
