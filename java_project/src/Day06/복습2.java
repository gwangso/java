package Day06;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int balance = 5000;
		
		while (run) {
			System.out.printf("========자판기========[%,d원]\n", balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우롱차(1500) 0.종료");
			System.out.print("메뉴선택 => ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				if (balance < 1000) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println("콜라를 선택하셨습니다.");
					balance -= 1000;					
				}
			}else if (menu == 2) {
				if (balance < 1200) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println("사이다를 선택하셨습니다.");
					balance -= 1200;					
				}
			}else if (menu == 3) {
				if (balance < 1500) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println("우롱차를 선택하셨습니다.");
					balance -= 1500;					
				}
			}else if (menu == 0) {
				run = false;
			
			}else {
				System.out.println("0~3중 선택해주세요. 제발~");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}
