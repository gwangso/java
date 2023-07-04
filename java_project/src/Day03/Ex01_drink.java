package Day03;

import java.util.Scanner;

public class Ex01_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int balance = 10000; // 잔액
	
		while (run) {
			System.out.println("=====자판기===== 잔액 : " + balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우롱차(1500) 4.충전 0.종료");
			System.out.print("메뉴 선택 => ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("콜라 선택");
				if (balance < 1000) {
					System.out.println("잔액이 부족합니다.");
				}else 
					balance -= 1000; //balance = balance - 1000
				break;
			case 2:
				System.out.println("사이다 선택");
				if (balance < 1200) {
					System.out.println("잔액이 부족합니다.");
				}else 
					balance -= 1200; //balance = balance - 1000
				break;
			case 3:
				System.out.println("우롱차 선택");
				if (balance < 1500) {
					System.out.println("잔액이 부족합니다.");
				}else 
					balance -= 1500; //balance = balance - 1000
				break;
			case 4:
				System.out.print("충전할 금액 => ");
				balance = balance + sc.nextInt();
				break;
			case 0:
				run = false;
				break;
			default:
				System.out.println("0~3까지 입력");
			}

			System.out.println();
		}
		System.out.println("프로그램 종료");
			
	}

}
