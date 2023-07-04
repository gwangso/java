package Day04;

import java.util.Scanner;

public class Ex01_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		System.out.print("충전할 금액을 입력해주십시오 => ");
		int balance = sc.nextInt();

		while (run) {
			System.out.printf("=======자판기========[%,d원]\n", balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.충전 0.종료");
			System.out.print("메뉴를 선택해주세요 => ");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (balance < 1000 ) {
					System.out.println("잔액이 부족합니다.");
					//해당 if문 이후에 따른 명령문이 있는게 아니라 continue 필요 없음
				}else {
					System.out.println("콜라를 선택하셨습니다.");
					balance -= 1000;
				}
			} else if (menu == 2) {
				if (balance < 1200 ) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println("사이다를 선택하셨습니다.");
					balance -= 1200;
				}
			} else if (menu == 3) {
				if (balance < 1500 ) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println("우유를 선택하셨습니다.");
					balance -= 1500;
				}
			} else if (menu == 4) {
				System.out.print("충전할 금액 => ");
				int inMoney = sc.nextInt();
				balance += inMoney;
			}else  if (menu == 0) {
				run = false;
			} else {
				System.out.println("잘못선택하셨습니다.\n다시 선택해주세요");
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
