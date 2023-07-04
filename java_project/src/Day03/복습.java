package Day03;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// 양수, 음수, 0 출력
//		Scanner sa = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요 => ");
//		int num1 = sa.nextInt();
//
//		if (num1 > 0) {
//			System.out.println("양수");
//		} else if (num1 < 0) {
//			System.out.println("음수");
//		} else if (num1 == 0) {
//			System.out.println("0");
//		}
//
//		System.out.println();
//		System.out.println("------------------");
//		System.out.println();
//		
//		//홀수, 0이 아닌 짝수, 0
//		Scanner sb = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요 => ");
//		int num2 = sb.nextInt();
//
//		if (num2 == 0) {
//			System.out.println("0입니다.");
//		} else if (num2%2 == 0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}		
//
//		System.out.println();
//		System.out.println("------------------");
//		System.out.println();		
//		
//		// 3의배수, 7의배수, 3과 7의 배수, 둘다아님
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요 => ");
//		int num3 = sc.nextInt();
//		if (num3 == 0) {
//			System.out.println("0입니다.0");
//		}else if (num3 % 3 == 0) {
//			if (num3 %7 == 0) {
//				System.out.println("3과 7의 배수");
//			}else {
//				System.out.println("3의 배수");
//			}
//		}else if (num3 % 7 == 0) {
//			System.out.println("7의 배수");
//		}else {
//			System.out.println("둘다 아님");
//		}
//		
		// 3의배수, 7의배수, 3과 7의 배수, 둘다아님
		Scanner sd = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 => ");
		int num4 = sd.nextInt();
		if (num4 == 0) {
			System.out.println("0입니다.0");
		}else if (num4 % 3 == 0 && num4 % 7 == 0) {
			System.out.println("3과 7의 배수");
		}else if (num4 % 3 == 0) {
			System.out.println("3의 배수");
		}else if (num4 % 7 == 0) {
			System.out.println("7의 배수");
		}else {
			System.out.println("둘다 아님");
		}
		
		
		
		
		
		
		
	}

}
