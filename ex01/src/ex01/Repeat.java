package ex01;

import java.util.Scanner;

public class Repeat {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		// 반복문 for문

		// 반복문 while문
		boolean roof = true;
		while (roof) {
			System.out.println("=========================");
			System.out.println("1.100까지의 합 | 2.100까지의 짝수의 합 | 3.100까지의 홀수의합 0.종료");
			System.out.print("메뉴선택 > ");
			String menu = sc.nextLine();
			int tot = 0;
			
			switch (menu) {
			case "0":
				System.out.println("프로그램이 종료됩니다.");
				roof = false;
				break;
			case "1":
				for (int i = 1; i<=100; i++) {
					tot += i;
				}
				System.out.println("1~100까지의 합 = " + tot);
				break;
			case "2":
				for (int i = 2; i<=100; i += 2) {
					tot += i;
				}
				System.out.println("1~100까지 짝수의 합 = " + tot);
				break;
			case "3":
				for (int i = 1; i<=100; i+=2) {
					tot += i;
				}
				System.out.println("1~100까지 홀수의 합 = " + tot);
				break;
			default:
				System.out.println("메뉴를 다시 입력하세요!");
			}	
			System.out.println();
		}
	}
}