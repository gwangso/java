package Day08;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = 10000;

		while (true) {
			System.out.printf("=======자판기=======[%,d]\n", balance);
			System.out.println("1.콜라(1,000) 2.사이다(1,200) 3.우롱차(1,500) 4.충전 0.종료");
			System.out.print("메뉴 선택 > ");
			int menu1 = sc.nextInt();

			if (menu1 == 1) {
				if (balance >= 1000) {
					System.out.println("콜라 선택");
					balance -= 1000;
				} else {
					System.out.println("잔액부족");
				}

			} else if (menu1 == 2) {
				if (balance >= 1200) {
					System.out.println("사이다 선택");
					balance -= 1200;
				} else {
					System.out.println("잔액부족");
				}

			} else if (menu1 == 3) {
				if (balance >= 1500) {
					System.out.println("우롱차 선택");
					balance -= 1000;
				} else {
					System.out.println("잔액부족");
				}
			} else if (menu1 == 4) {
				boolean ok = true;
				while (ok) {
					System.out.print("충전할 금액 입력 > ");
					int money = sc.nextInt();
					while (true) {
						System.out.printf("%,d원을 충전하시겠습니까?(Y/y or N/n) > ",money);
						String re = sc.next();
						if (re.equals("Y") || re.equals("y")) {
							balance += money;
							ok = false;
							break;
						} else if (re.equals("N") || re.equals("n")) {
							System.out.println("충전을 그만합니다.");
							System.out.println("처음으로 돌아갑니다.");
							ok = false;
							break;
						} else {
							System.out.println("다시입력해주세요");
						}
					}
				}
			} else if (menu1 == 0) {
				break;

			} else {
				System.out.println("다시선택해주세요.");

			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
