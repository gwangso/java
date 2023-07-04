package Day04;

import java.util.Scanner;

public class 연습장04_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

//		boolean run1 = true;
//		boolean run2 = true;
//		
//		int num1;
//		int num2;
//		
//		while (run1) {
//			System.out.println("===========up and down============");
//			
//			
//			System.out.print("최솟값을 설정해주세요 => ");
//			num1 = sc.nextInt();
//			System.out.print("최댓값을 설정해주세요 => ");
//			num2 = sc.nextInt();
//			if (num1 > num2) {
//				System.out.println("최솟값이 최댓값보다 큽니다.\n다시설정해주세요\n");
//				continue;
//			
//			
//			}
//			int menu1;
//			while (true) {
//				System.out.println("1.오름차순 2.내림차순");
//				System.out.print("정렬방법을 선택해주세요 => ");
//				menu1 = sc.nextInt();
//				if (menu1 == 1) {
//					for (int i = num1; num2 >= i; i++) {
//						System.out.print(i + " ");
//					}
//				break;
//				}else if (menu1 ==2) {
//					for (int i = num2; num1 <= i; i--) {
//						System.out.print(i+ " ");
//					}
//				break;
//				}else {
//					System.out.println("1과 2중 선택하셔야 합니다.");
//				}
//			System.out.println();
//			
//			}
//			
//		System.out.println();
//		System.out.println();
//		}
//		
//		boolean run3 = true;
//		int balance1 = 10000;
//		int balance2 = balance1;
//		
//		while (run3) {
//			System.out.printf("=======자판기========[%,d원]\n", balance2);
//			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.충전 0.종료");
//			System.out.print("메뉴를 선택해주세요 => ");
//			int menu = sc.nextInt();
//
//			if (menu == 1) {
//				System.out.println("콜라를 선택하셨습니다.");
//				balance1 -= 1000;
//			} else if (menu == 2) {
//				System.out.println("사이다를 선택하셨습니다.");
//				balance1 -= 1200;
//			} else if (menu == 3) {
//				System.out.println("우유를 선택하셨습니다.");
//				balance1 -= 1500;
//			} else if (menu == 4) {
//				System.out.print("충전할 금액 => ");
//				int inMoney = sc.nextInt();
//				balance1 += inMoney;
//			} else if (menu == 0) {
//				run3 = false;
//			} else {
//				System.out.println("잘못선택하셨습니다.\n다시 선택해주세요.");
//			}
//			if (balance1 <0) {
//				System.out.println("금액이 부족합니다.\n다시선택해주세요.");
//				balance1 = balance2;
//			}else if (balance1 >= 0) {
//				balance2 = balance1;
//			}
//			System.out.println();
//		}
//		System.out.println("프로그램을 종료합니다.");
//		
//		
//		boolean run1 = true;
//		boolean run2 = true;
//
//		while (run1) {
//			//첫번째 숫자 입력
//			System.out.println("==============계산기==============");
//			System.out.print("첫번째 숫자입력 => ");
//			int num1 = sc.nextInt();
//			
//			//메뉴설정, 1~5 범위 외에 입력시 재시도
//			String menu1 = null;
//				System.out.println("연산자를 다시 선택해주세요.");
//			do {
//				System.out.print("연산자 선택 => ");
//				menu1 = sc.next();
//			}while (!(menu1.equals("+") ||menu1.equals("-")||menu1.equals("*")||menu1.equals("/")||menu1.equals("%")));
//			
//			System.out.print("두번째 숫자 입력 => ");
//			int num2 =sc.nextInt();
//			
//			int result;
//			
//			if (menu1.equals("+")) {
//				result = num1 + num2;
//				System.out.printf("%d + %d = %d\n",num1,num2,result);
//			}else if(menu1.equals("-")) {
//				result = num1 - num2;
//				System.out.printf("%d - %d = %d\n",num1,num2,result);
//			}else if (menu1.equals("*")) {
//				result = num1 * num2;
//				System.out.printf("%d * %d = %d\n",num1,num2,result);
//			}else if (menu1.equals("/")) {
//				result = num1 / num2;
//				System.out.printf("%d / %d = %d\n",num1,num2,result);
//			}else if (menu1.equals("%")) {
//				result = num1 % num2;
//				System.out.printf("%d %% %d = %d\n",num1,num2,result);
//			}
//			
//		}
//
//		String a = "A";
//		String b = "B";
//		
//		System.out.println(a + " " + b);
//		
//		String temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println(a + " " + b);
//
//		for (int i = 1; i <=4; i++) {
//			System.out.print("뭔가 입력해봐 => ");
//			int num = 0;
//			if (sc.hasNextInt()) { // hasNextInt 숫자가 들어오면 true, 문자가 입력되면 false	
//				// 어떤 값을 입력하면 그 값은 buffer에 저장된다.
//				// 그런데 저장할 때 누른 'enter'값도 같이 저장된다.
//				// 일반적인 nextInt의 경우 enter값을 제외하고 Int만 가져온다.
//				// 만약 문자를 입력하면 가져올 값이 없고 오류가 발생하게 된다.
//				// hasNextInt()역시 buffer에 값을 저장한다.
//				// 숫자가 입력되면 True를 출력하게된다.
//				// 문자가 입력되면 false가 출력된다.		
//				num = sc.nextInt(); // Int값을 가져온다
//				sc.nextLine(); // 문자열과 'enter'값을 없에주는 역할을 한다.
//				System.out.println(num + "을 입력했습니다.");
//			} else {
//				sc.nextLine(); // 문자열과 'enter'값을 없에주는 역할을 한다.
//				System.out.println("숫자만 입력가능");
//			}
//		}
	}

}
