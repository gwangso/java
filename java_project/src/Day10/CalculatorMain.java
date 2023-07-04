package Day10;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.setNum1(12);
		cal.setNum2(5);
		cal.sum();
		cal.sub(8, 15);
		System.out.println(cal.mul());
		System.out.println(cal.div(72, 5));
		
//		System.out.println("===================================");
//		
//		Calculator cal1 = new Calculator();
//		cal1.num1 = 9;
//		cal1.num2 = 4;
//		cal1.sum();
//		cal1.sub(7, 2);
//		System.out.println(cal1.mul());
//		System.out.println(cal1.div(10, 3));
//		
//		cal.num1 = 5;
		
	}
}
