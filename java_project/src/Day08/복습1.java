package Day08;

import java.util.Scanner;

public class 복습1 {

	public static void main(String[] args) {

//		// 두개의 수를 입력받아 더하기 빼기 곱하기 나머지 구하기
//
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("수를 입력해주세요 > ");
//		int num1 = sc.nextInt();
//		
//		// 계산기 문제
//		while (true) {
//			System.out.println("1.더하기 2.빼기 3. 곱하기 4.나누기 5.나머지 9.초기화 0.종료");
//			System.out.print("메뉴선택 > ");
//			int menu = sc.nextInt();
//
//			System.out.print("수를 입력해주세요 > ");
//			int num2 = sc.nextInt();
//			
//			if (menu == 1) {
//				num1 += num2;
//				System.out.println(num1);
//			} else if (menu == 2) {
//				num1 -= num2;
//				System.out.println(num1);
//			} else if (menu == 3) {
//				num1 *= num2;
//				System.out.println(num1);
//			} else if (menu == 4) {
//				num1 /= num2;
//				System.out.println(num1);
//			} else if (menu == 5) {
//				num1 %= num2;
//				System.out.println(num1);
//			} else if (menu == 9) {
//				num1 = sc.nextInt();
//			} else if (menu==0) {
//				break;
//			} else {
//				System.out.println("다시선택해주세요");
//			}
//		}
//		System.out.println("프로그램 종료");

//		//1~100까지 3의배수 갯수 출력
//		int cnt = 0;
//		
//		for (int i = 1; i <=100; i++) {
//			if (i%3 == 0) {
//				cnt ++;
//			}
//		}
//		System.out.println("1~100까지의 3의 배수 개수 : " +  cnt + "개");

		//1~100까지 3의배수, 5의배수, 3과 5의 배수 갯수 출력
		int cnt15 = 0;
		int cnt5 = 0;
		int cnt3 = 0;
		int cnt = 0;
		
		for (int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				cnt15++;
				cnt5++;
				cnt3++;
			}else if (i%3==0) {
				cnt3++;
			}else if (i%5==0) {
				cnt5++;
			}else {
				cnt++;
			}
		}
		System.out.println("3의배수 : "+ cnt3 + "개");
		System.out.println("5의배수 : "+ cnt5 + "개");
		System.out.println("3과 5의배수 : "+ cnt15 + "개");
		System.out.println("둘다 아님 : " + cnt + "개");
		
		
	}

}
