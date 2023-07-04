package Day04;

import java.util.Scanner;

public class Ex06_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===========sum===========");
			System.out.print("첫번째 수 입력 => ");
			int num1 = sc.nextInt();
			System.out.print("두번째 수 입력 => ");
			int num2 = sc.nextInt();
			
			System.out.println("1.총합 2.짝수의합 3.홀수의합 0.종료");
			System.out.print("입력 => ");
			int menu1 = sc.nextInt();
			if (num1 >num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			int sum1 = 0;
			if (menu1 == 1) {
				for (int i = num1; num2>= i; i++) {
					sum1 += i;
				}
			}else if (menu1 == 2) {
				for (int i = num1; num2>= i; i++) {
					if (i%2 == 0) {
						sum1 +=i;
					}
				}
			}else if (menu1 == 3) {
				for (int i = num1; num2>= i; i++) {
					if (i%2 != 0) {
						sum1 +=i;
					}
				}
			}else if (menu1 == 0) {
				break;
			}
			System.out.println("총합 = " + sum1);
			System.out.println();
		}
		System.out.println();
		System.out.println("=====프로그램 종료=====");
	}
		
}
