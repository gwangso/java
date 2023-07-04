package Day03;

import java.util.Scanner;

public class Ex04_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		boolean run = true;
		boolean con = true;
		int result = 0;
		
		while (run) {
			int num1 = result;
			if (con) {
				System.out.println("========계산기========");
				System.out.print("첫번째 숫자 입력 => ");
				num1 = sc.nextInt();
			}
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
			System.out.print("메뉴 선택 => ");
			int menu = sc.nextInt();
			
			System.out.print("두번째 숫자 입력 => ");
			int num2 = sc.nextInt();
			
			switch(menu) {
			case 1:
				result =(num1+num2);
				System.out.printf("%d + %d = %d\n", num1, num2, result);
				break;
			case 2:
				result = (num1-num2);
				System.out.printf("%d - %d = %d\n", num1, num2, result);
				break;
			case 3:
				result = num1*num2;
				System.out.printf("%d * %d = %d\n", num1, num2, result);
				break;
			case 4:
				result = num1/num2 ;
				System.out.printf("%d / %d = %d\n", num1, num2, result);
				break;
			case 5:
				result = num1%num2;
				System.out.printf("%d %% %d = %d\n", num1, num2, result);
				break;
			default:
				System.out.println("1~5까지 입력가능");
			}
			// 종료하시겠습니까? (Y/y)
			while(true) {
				System.out.print("1.종료 2.새로하기 3.이어하기 => ");
				int ans = sc.nextInt();
				if (ans == 1) {
					run = false;
					break;
				}else if (ans == 2) {
					System.out.println("새로 시작하겠습니다.");
					con = true;
					break;
				}else if (ans == 3) {
					con = false;
					break;
				}else {
					System.out.println("1~3까지 입력해주세요");
				}
			}
		}
		System.out.println("계산기 종료");
		
	}

}
