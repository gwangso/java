package ex01;

public class Operation {

	public static void run() {
		// 산술연산자 (+, -, *, /, %)
		int kor = 80;
		int eng = 59;
		int mat = 100;
		int total = kor + eng + mat;
		double avg = total / 3.;
//		String grade ="";

		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n", avg);

		// 관계연산자 (>, >=, <, <=, ==, !=)

		// 삼항연산자 변수선언 = 조건 ? true결과값 : false결과값;
		String pass = avg >= 70 ? "합격" : "불합격";
		System.out.println(pass);
		
		//논리연산자 (&&, ||, !)
		String pass2 = (kor >= 60 && eng>=60 && mat>=60 && avg>=70) ? "합격" : "불합격";
		System.out.println(pass2);
		
		//증감연산자 ( ++, -- )
		int count = 0;
		if (kor < 60) count++;
		if (eng < 60) count++;
		if (mat < 60) count++;
		System.out.println("누락과목수 : " + count);
		
		
	}
}