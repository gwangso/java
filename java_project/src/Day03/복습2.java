package Day03;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i = 0; i < 5; i++) {
//			System.out.println(Math.random());
//		}
//
//		for (int i = 1; i <= 10; i = i +2) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		for (int i = 10; i >= 1 ; i--) {
//			System.out.print(i + " ");
//		}
//		
//		// 1~10까지 가로로 출력
//		for (int i = 1; i <=10 ; i ++ ) {
//			System.out.print(i);
//			if (i == 10) {
//				System.out.println();
//			}else {
//				System.out.print(", ");
//			}
//		}
//
//		// 1~10까지의 합
//		int sum = 0;
//		
//		for (int i = 1 ; i <= 10 ; i ++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
//
//		// 1~ 100까지 7의 배수 출력
//		int cnt = 0;
//		
//		for (int i = 1; i<=1000; i ++) {
//			if (i%7 == 0) {
//				cnt ++;
//			}
//		}
//		System.out.println("1~ 1000까지 7의 배수 갯수 : " + cnt + "개");
//
//		// 구구단(6단) 
//		// break(반복문중지), continue(반복문건너뛰기)
//		int dan = 6;
//		System.out.println(dan + "단");
//		for (int i = 1; i <=9; i++) {
//			if (i == 5) {
//				System.out.println();
//				continue;
//			}
//			if (i == 9) {
//				break;
//			}
//			System.out.println(dan + " * " + i + " = " + (dan*i));
//		}
//		System.out.println(dan + "단 끝");
//	
		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력 => ");
//		int a = sc.nextInt();
//		
//		while(a>0) {
//			System.out.println("양수");
//			}
//		}
//		
//		while (true) {
//			System.out.print("숫자입력 => ");
//			int b = sc.nextInt();
//			if (b > 0 ) {
//				System.out.println("양수");
//			}else if (b<0 ) {
//				System.out.println("음수");
//			}else if (b == 0) {
//				System.out.println("0");
//				break;
//			}
//		}
//		System.out.println("반복문 종료");
//		

		while (true) {
			System.out.print("숫자입력 => ");
			int c = sc.nextInt();
			if (c == 0) {
				System.out.println("0");
				break;
			} else if (c % 2 == 0) {
				System.out.println("짝수");
			} else if (c % 2 != 0) {
				System.out.println("홀수");
			}
		}
		System.out.println("반복문 종료");

	}

}
