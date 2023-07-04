package Day08;

public class CalculatorMain {

	public static void main(String[] args) {
		// Calculator 객체만들고
		//모든 메서드 호출하여 더하기, 빼기, 곱하기, 나누기 출력
		Calculator cal = new Calculator();
		
		cal.num1 = 5;
		
		cal.num2 = 10;
		
		cal.sum();
		
		cal.sub(13, 6);
		
		System.out.println(cal.mul());
		System.out.println(cal.div(15,2));
	}

}
