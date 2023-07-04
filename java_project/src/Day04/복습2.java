package Day04;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i = 1; i <= 10 ; i++) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//			for(int i = 10; i >0  ; i--) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		int sum1 = 0 ;
//		for (int i = 1; i<= 100; i ++) {
//			sum1 += i;
//		}
//		System.out.println(sum1);
//		
//		Scanner sc = new Scanner(System.in);
//		int sum1 = 0;
//		
//		System.out.print("숫자입력 => ");
//		int num1 = sc.nextInt();
//		
//		for (int i = 1; i<=num1; i++) {
//			sum1 += i;
//		}
//		System.out.println("1~"+num1+"까지의 합 : " + sum1);
//
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자입력 => ");
			int num2 = sc.nextInt();
			if (num2 == 0) {
				System.out.println("0을 입력하셨습니다.");
				break;
			}else if (num2 > 0) {
				System.out.println("양수입니다.");
			}else if (num2 <0) {
				System.out.println("음수입니다.");
			}			
		}
		System.out.println("반복문을 종료합니다.");
		
	}

}
