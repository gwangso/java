package Day01;

import java.util.Scanner;

public class 조건문_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 20;
		
		if (age >=  19) {
			System.out.println("성인입니다.");
		}else if (age >= 17) {
			System.out.println("고등학생입니다.");
		}else if (age >13){
			System.out.println("중학생입니다.");
		}else if (age >= 8){
			System.out.println("초등학생입니다.");
		}else {
			System.out.println("어린이입니다.");
		}
		
		System.out.println("");
		System.out.println("=========================");
		System.out.println("");
		
		// a의 변수의 값에 따라 "양수", "음수", "0"을 출력하시오 
		int a = 0;
		if(a > 0) {
			System.out.println("변수 a의 값은 양수입니다.");
		} else if (a < 0) {
			System.out.println("변수 a의 값은 음수입니다.");
		} else if (a == 0){
			System.out.println("변수 a의 값은 0입니다.");
		}
//		
//		System.out.println("");
//		System.out.println("=========================");
//		System.out.println("");
//		
//	 	변수 score의 값에 따라
// 		90 이상 A
//	 	80 이상 B
//	 	70 이상 C
//	 	60 이상 D 
// 		60 미만 F
//		int score = 88;
//		if(score >= 90) {
//			System.out.println("A");
//		}else if (score >= 80) {
//			System.out.println("B");
//		}else if (score >= 70) {
//			System.out.println("C");
//		}else if (score >= 60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
//		int score = 88
//		if(score >= 90) {
//			System.out.println("A");
//		}else if (score >= 70) {
//			System.out.println("C");
//		}else if (score >= 80) {
//			System.out.println("B");
//		}else if (score >= 60) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
//		이럴 경우 결과값은 C 가 뜬다. 왜냐하면 2번째 조건문
//		즉 70이상인 곳에서 끝이나기 때문에
//		System.out.println("");
//		System.out.println("=========================");
//		System.out.println("");
//		
//	 	변수 score의 값에 따라
//		95 이상 A+
// 		90 이상 A0
//		85 이상 B+
//	 	80 이상 B0
//		75 이상 C+
//	 	70 이상 C0
//	 	60 이상 D
// 		60 미만 F
//		0점이면 Fa
//		int score2 = 00;
//		if(score2 >= 90) {
//			if(score2 >= 95) {
//			System.out.println("A+");	
//			}else {
//				System.out.println("A0");
//			}
//		}else if (score2 >= 80) {
//			if (score2 >= 85) {
//				System.out.println("B+");
//			}else {
//				System.out.println("B");
//			}
//		}else if (score2 >= 70) {
//			if (score2 >= 75) {
//				System.out.println("C+");
//			}else {
//				System.out.println("C0");
//			}
//		}else if (score2 >= 60) {
//			if (score2 >= 65) {
//				System.out.println("D+");
//			}else {
//				System.out.println("D0");
//			}
//		}else if (score2 == 0) {
//			System.out.println("Fa");
//		}else {
//			System.out.println("F");
//		}
//		
//		System.out.println("");
//		System.out.println("=========================");
//		System.out.println("");
//		
//		
//		Scanner su = new Scanner(System.in);
//		System.out.print("숫자입력 => ");
//		int num = su.nextInt();
//		
//		if (num == 0) {
//			System.out.println("입력하신 값은 '0'입니다.");
//		}else if (num % 2 == 0) {
//			System.out.println("입력하신 값은 '짝수'입니다.");
//		}else {
//			System.out.println("입력하신 값은 '홀수'입니다.");
//		}
		
	}
}
