package Day09;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance1 = 10000; // 현재 잔액

		int cokePrice = 1000;
		int sodaPrice = 1200;
		int oolongPrice = 1500;
		
		
		while (true) {
			int balance2 = balance1; // 예상 잔액
			System.out.printf("========자판기========[%,d]\n", balance1);
			System.out.printf("1.콜라(%,d) 2.사이다(%,d) 3.우롱차(%,d) 0.종료\n",cokePrice,sodaPrice,oolongPrice);
			System.out.print("메뉴 선택 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("콜라 선택");
				balance2 -= 1000;
			} else if (menu == 2) {
				System.out.println("사이다 선택");
				balance2 -= 1200;
			} else if (menu == 3) {
				System.out.println("우롱차 선택");
				balance2 -= 1500;
			} else if (menu == 0) {
				System.out.println();
				break;
			} else {
				System.out.println("다시 선택해주세요");
			}

			if (balance2 < 0) {
				System.out.println("잔액이 부족합니다.");
			} else {
				balance1 = balance2;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
