package Day11;

public class 연습장11_3 {
	public static void main(String[] args) {
		Test a = new Test();
		Test b = new Test();
		Test c = new Test();
		Test d = new Test();
		
		b.num1Up();
		System.out.println("static이 없는 경우 b를 1업");
		System.out.println(a.num1);
		System.out.println(b.num1);
		System.out.println(c.num1);
		System.out.println(d.num1);
		
		b.num2Up();
		System.out.println("static이 있는 경우 b를 1업");
		System.out.println(a.num2);
		System.out.println(b.num2);
		System.out.println(c.num2);	
		System.out.println(d.num2);
	}
}
class Test{
	int num1 = 100;
	static int num2 = 200;
	public void num1Up() {
		num1++;
	}
	public void num2Up() {
		num2++;
	}
	
}
