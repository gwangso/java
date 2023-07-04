package Day09;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		String a = new String("홍길동");
		System.out.println(a);
		// 문자열은 class이기 때문에 원본은 이렇게 쓰는게 정답이다.
		// 다만 자주 쓰기 때문에 String a = "홍길동"; 형태로 쓸 수 있게 한 것.
		
		cal.num1 = 10;
		cal.num2 = 5;
		
		cal.sum();
		cal.sub(5, 2);
		System.out.println(cal.mul());
		System.out.println(cal.div(9, 2));
		
		Calculator cal1 = new Calculator();
		cal1.sum(); //cal1에는 아무 값도 대입 X 따라서 기본변수가 들어가 있음
		System.out.println(cal1.num1);
	}

}
