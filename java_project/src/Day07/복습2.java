package Day07;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = 10000;
		String[] product = new String[100];
		int cnt = 0;
		
		int cn = 0;
		int sn = 0;
		int mn = 0;
		
		while (true) {
			System.out.printf("=======자판기=======[%,d]\n", balance);
			System.out.println("1.콜라(1,000) 2.사이다(1,200) 3.우유(1,500) 4.구매목록 0.종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				if (balance < 1000) {
					System.out.println("잔액부족");
				}else {
					System.out.println("콜라 선택");
					balance -= 1000;		
					product[cnt++] = "콜라";
					cn ++;
				}
			} else if (menu == 2) {
				if (balance < 1000) {
					System.out.println("잔액부족");
				}else {
					System.out.println("사이다 선택");
					balance -= 1200;
					product[cnt++] = "사이다";
					sn ++;
				}
			} else if (menu == 3) {
				if (balance < 1000) {
					System.out.println("잔액부족");
				}else {
					System.out.println("우유 선택");
					balance -= 1500;
					product[cnt++] = "우유";
					mn ++;
				}
			} else if (menu ==4) {
				System.out.println("\n구매목록\t수량");
				System.out.println("============================");

				System.out.printf("콜라 \t%d개\n사이다 \t%d개\n우유 \t%d개\n", cn,sn,mn);
				System.out.println();
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("0~3까지의 수 중 선택해주세요.");
			}
			System.out.println();
		}
		System.out.println("남은 잔액 : " + balance);
		System.out.println("프로그램 종료");

	}

}
