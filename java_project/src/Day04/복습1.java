package Day04;

import java.util.Scanner;

public class 복습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 => ");
		int num1 = sc.nextInt();
		
		// 입력받은 수가 0이 아닌 짝수, 홀수, 0 출력
		// 입력받은 수가 3의 배수, 7의 배수, 3과 7의 배수, 둘다 아님 출력
		
		if (num1 ==0) {
			System.out.println("0입니다.");
		}else if (num1%2 == 0) {
			System.out.println("짝수입니다.");
			if (num1%3 == 0 && num1%7 ==0) {
				System.out.println("3과 7의 배수입니다.");
			}else if (num1%3 ==0) {
				System.out.println("3의 배수입니다.");
			}else if (num1%7 ==0) {
				System.out.println("7의 배수입니다.");
			}else {
				System.out.println("둘다아님");
			}
		}else if (num1%2 != 0) {
			System.out.println("홀수입니다.");
			if (num1%3 == 0 && num1%7 ==0) {
				System.out.println("3과 7의 배수입니다.");
			}else if (num1%3 ==0) {
				System.out.println("3의 배수입니다.");
			}else if (num1%7 ==0) {
				System.out.println("7의 배수입니다.");
			}else {
				System.out.println("둘다아님");
			} 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
