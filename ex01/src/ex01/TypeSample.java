package ex01;

public class TypeSample {
	
	public static void run() {
		//숫자변수
		int num1 = 80; // 대입
		float num2 = 22.41f; // float는 뒤에 f를 적어줘야 한다.
		double num3 = 48.22;
		
		//문자변수
		char name1 = '감'; //작은따옴표, 한글자만
		String name2 = "오랜만이야."; //클레스
		
		//참거짓(불린)
		boolean isFind = false;
		
		System.out.print("num1 = " + num1++ + "\n");
		System.out.println("num2 = " + num2);
		System.out.println(num1);
		
	}
}
