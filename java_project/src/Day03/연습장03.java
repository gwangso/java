package Day03;

import java.util.Scanner;

public class 연습장03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//계산기
//		System.out.print("숫자를 입력해 주십시오 => ");
//		int num1 = sc.nextInt();
//		int num2;
//		int result;
//		
//		while (true) {
//			System.out.println("1. 더하기 2. 빼기 3. 곱하기 4. 나누기 5. 나머지");
//			System.out.print("메뉴를 선택해주세요 => ");
//			int menu1 = sc.nextInt();
//			if (menu1 > 0 && menu1 < 6) {
//				System.out.print("계산하실 숫자를 입력해 주십시오 => ");
//				num2 = sc.nextInt();		
//				switch (menu1) {
//				case 1:
//					System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
//					num1 = num1 + num2;
//					break;
//				case 2:
//					System.out.printf("%d + %d = %d", num1, num2, (num1 - num2));
//					num1 = num1 - num2;
//					break;
//				case 3:
//					System.out.printf("%d + %d = %d", num1, num2, (num1 * num2));
//					num1 = num1 * num2;
//					break;
//				case 4:
//					System.out.printf("%d + %d = %f", num1, num2, (num1 / (double)num2));
//					num1 = num1 / num2;
//					break;
//				case 5:
//					System.out.printf("%d + %d = %d", num1, num2, (num1 % num2));
//					num1 = num1 % num2;
//					break;
//				}
//			}else {
//				System.out.println("메뉴를 잘못선택하셨습니다.");
//				continue;
//			}
//			
//			System.out.println("1. 계속하기 2. 새로하기 3.종료하기");
//			System.out.print("계속하시겠습니까 => ");
//			int menu2 = sc.nextInt();
//			if (menu2 == 1) {
//				
//			}else if (menu2 == 2) {
//				result = 0;
//				System.out.println("새로 시작하겠습니다.");
//				System.out.println("숫자를 입력해주세요");
//				num1 = sc.nextInt();
//				continue;
//			}else if (menu2 == 3) {
//				System.out.println("종료합니다.");
//				break;
//			}else {
//				System.out.println("메뉴를 잘못선택하셨습니다.");
//				continue;
//			}
//		}
//		
//		// 자판기문제
//		boolean run = true;
//		// balance1은 결제 시 남는 예상 금액
//		// balance2는 결제 후 남은 금액
//		int balance1 = 10000; // 잔액
//		int balance2 = balance1;
//		
//		while (run) {
//			System.out.println("=====자판기===== 잔액 : " + balance2);
//			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우롱차(1500) 0.종료");
//			System.out.print("메뉴 선택 => ");
//			int menu = sc.nextInt();
//			
//			switch (menu) {
//			case 1:
//				System.out.println("콜라 선택");
//				balance1 -= 1000; 
//				break;
//			case 2:
//				System.out.println("사이다 선택");
//				balance1 -= 1200; 
//				break;
//			case 3:
//				System.out.println("우롱차 선택");
//				balance1 -= 1500; 
//				break;
//			case 4:
//				System.out.print("충전할 금액 => ");
//				balance1 = balance1 + sc.nextInt();
//				break;
//			case 0:
//				run = false;
//				break;
//			default:
//				System.out.println("0~3까지 입력");
//			}
//			//최종단계 
//			if (balance1 < 0) {
//				System.out.println("잔액이 부족합니다.");
//				balance1 = balance2;
//			} else {
//				balance2 = balance1;
//			}
//			
//			System.out.println();
//			
//		}
//		System.out.println("프로그램 종료");

		
//		System.out.println("================계산기================");
//		System.out.print("숫자를 입력해 주십시오 => ");
//		
//		int num1 = sc.nextInt();
//		int num2;
//		
//		while (true) {
//			System.out.println("1. 더하기 2. 빼기 3. 곱하기 4. 나누기 5. 나머지");
//			System.out.print("메뉴를 선택해주세요 => ");
//			int menu1 = sc.nextInt();
//			if (menu1 > 0 && menu1 < 6) {
//				System.out.print("계산하실 숫자를 입력해 주십시오 => ");
//				num2 = sc.nextInt();		
//				switch (menu1) {
//				case 1:
//					System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
//					num1 = num1 + num2;
//					break;
//				case 2:
//					System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
//					num1 = num1 - num2;
//					break;
//				case 3:
//					System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
//					num1 = num1 * num2;
//					break;
//				case 4:
//					System.out.printf("%d / %d = %.3f\n", num1, num2, (num1 / (double)num2));
//					num1 = num1 / num2;
//					break;
//				case 5:
//					System.out.printf("%d % %d = %d\n", num1, num2, (num1 % num2));
//					num1 = num1 % num2;
//					break;
//				}
//			}else {
//				System.out.println("메뉴를 잘못선택하셨습니다.");
//				continue;
//			}
//			
//			System.out.println("1. 계속하기 2. 새로하기 3.종료하기");
//			System.out.print("계속하시겠습니까 => ");
//			int menu2 = sc.nextInt();
//			if (menu2 == 1) {
//			}else if (menu2 == 2) {
//				System.out.println("새로 시작하겠습니다.");
//				System.out.print("숫자를 입력해주세요");
//				num1 = sc.nextInt();
//				continue;
//			}else if (menu2 == 3) {
//				System.out.println("종료합니다.");
//				break;
//			}else {
//				System.out.println("메뉴를 잘못선택하셨습니다.");
//				continue;
//			}
//		}
//		
//		
//		for (int i = 1 ; i<=2; i++) {
//			System.out.print("로그인 재시도?( Y / y ) => ");
//			String tryLogin1 = sc.next();
//			if ((tryLogin1.equals("Y") || tryLogin1.equals("y"))) {
//				System.out.println("(다시돌아감)");
//			} else { 
//				System.out.println("로그인시도를 그만합니다.");
//			}
//			if (!(tryLogin1.equals("Y") || tryLogin1.equals("y"))) {
//				System.out.println("로그인시도를 그만합니다.");
//			}else {
//				System.out.println("(다시돌아감)");
//			}
//			if (!tryLogin1.equals("Y") && !tryLogin1.equals("y")) {
//				System.out.println("로그인시도를 그만합니다.");
//			}else {
//				System.out.println("(다시돌아감)");
//			}
//		}
//		
		
		int a = 5;
		double b = 5.22;
		String c = "목숨";
		char d = 'ㄱ';
		
		
		System.out.printf("%d \t %.3f \n %s \"%c\"", a, b, c, d);

	}

}