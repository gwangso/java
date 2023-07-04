package Day01;

import java.util.Scanner;

public class 입력값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 a의 값에 따라 "양수", "음수", "0"출력
		Scanner sv = new Scanner(System.in);
		// 콘솔에서 입력받고 싶을때 사용
		System.out.print("원하는 숫자 입력 => ");
//		// ln은 줄바꿈을 의미 println 프린트 후 줄을 바꿔라,
//		// print 프린트 후 줄을 바꾸지 말아라
		int a = sv.nextInt();
		if (a>0) {
			System.out.println("입력하신 값은 '양수'입니다.");
		}else if (a<0) {
			System.out.println("입력하신 값은 '음수'입니다.");
		}else if (a==0) {
			System.out.println("입력하신 값은 '0'입니다.");
		}

		System.out.println("");
		System.out.println("=========================");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 문자를 입력해주세요 => ");
		String aa = sc.nextLine();
		System.out.println("입력하신 문자열은 '" + aa + "' 입니다.");		// Scanner sc = 바꾸는 방법 궁금
		
		// String으로 문자열을 받을 경우
		// next()은 문자열을 받되 띄어쓰기 이후는 받지 못한다
		// nextLine()을 사용하면 띄어쓰기도 인식하여 받는다

		System.out.println("");
		System.out.println("=========================");
		System.out.println("");
		
		Scanner sa = new Scanner(System.in);
		System.out.print("나이를 입력해 주세요 => ");
		int age = sa.nextInt();
		
		if(age >= 19 ) {
			System.out.println("성인입니다.");
		}else if (age > 13) {
			System.out.println("청소년입니다.");
		}else if (age >= 8) {
			System.out.println("초등학생입니다.");
		}else {
			System.out.println("어린이입니다.");
		}
		
		System.out.println("");
		System.out.println("=========================");
		System.out.println("");
		
		// 변수  num의 값에 따라 짝수, 홀수, 0출력
		// 입력예시) 숫자 입력>5
		// 출력예시) 홀수 입니다
		Scanner su = new Scanner(System.in);
		System.out.print("숫자입력 => ");
		int num = su.nextInt();
		
		if (num == 0) {
			System.out.println("입력하신 값은 '0'입니다.");
		}else if (num % 2 == 0) {
			System.out.println("입력하신 값은 '짝수'입니다.");
		}else {
			System.out.println("입력하신 값은 '홀수'입니다.");
		}
		
		System.out.println("");
		System.out.println("=========================");
		System.out.println("");
	
		// 변수 num의 값에 따라 3의 배수, 5의 배수, 3과 5의 배수, 둘다아님 출력
		Scanner sb = new Scanner(System.in);
		System.out.print("3, 5의 배수 => ");
		int b = sb.nextInt();

		if (b % 3 == 0 && b % 5 == 0) { //&&(and)를 사용해야한다. 15는 내가 계산한거잖음
			System.out.println("'3'과 '5'의 배수입니다.");
		}else if(b % 3 == 0) {
			System.out.println("'3'의 배수입니다.");
		}else if (b % 5 == 0) {
			System.out.println("'5'의 배수입니다.");
		}else {
			System.out.println("둘다 아닙니다.");
		}
		
		System.out.println("");
		System.out.println("=========================");
		System.out.println("");
		
		Scanner sd = new Scanner(System.in);
		System.out.print("4, 7의 배수 => ");
		int d = sd.nextInt();
		
		if (d % 4 == 0 || d % 7 == 0) {
			if(d % 4 == 0 && d % 7 == 0) {
				System.out.println("'4'와 '7'의 배수입니다.");
			}else if (d % 4 == 0) {
				System.out.println("'4'의 배수입니다.");
			}else {
				System.out.println("'7'과 의 배수입니다.");
			}
		}else {
			System.out.println("'4'의 배수도 '7'의 배수도 아닙니다.");
		}
		
		System.out.println("");
		System.out.println("=========================");
		System.out.println("");
		
		char quotes ='"';
		Scanner sh = new Scanner(System.in);
		System.out.print("할 말을 적어주세요 => ");
		String str = sh.nextLine();
		System.out.println("그는 \"" + str + "\"라고 소리쳤다.");
		
			// 현제 사용한 스캔 값은 sa, ac, av, su, sb, sd이다
			// 현재 사용한 변수는 a, aa, age, num, b,d 입니다.
		
	}

}
