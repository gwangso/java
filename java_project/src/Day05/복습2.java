package Day05;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run1 = true;
		int balance = 0;
		
		while (run1) {
			System.out.print("=========자판기========== ");
			System.out.printf("남은 금액 [ %,d ]\n", balance);
			System.out.println("1.콜라(1,000) 2.사이다(1,200) 3.우유(1,500) 4.충전 0.종료");
			System.out.print("메뉴 선택 => ");
			int menu1 = sc.nextInt();
			if (menu1 == 1) {
				if (balance < 1000) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println("콜라 선택");
					balance -= 1000;
				}
			}else if (menu1 ==2 ) {
				if (balance < 1200) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println("사이다 선택");
					balance -= 1200;
				}
			}else if (menu1 == 3) {
				if (balance < 1500) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println("우유 선택");
					balance -= 1500;
				}
			}else if (menu1 == 4) {
				System.out.print("충전하실 금액을 입력해주세요 => ");
				int plus = sc.nextInt();
				balance += plus;
			}else if (menu1 == 0) {
				break;
			}else {
				System.out.println("잘못선택하셨습니다.");
			}
			System.out.println();
		}
		System.out.println("\n프로그램 종료");
	}
}
