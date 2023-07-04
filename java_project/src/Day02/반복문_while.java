package Day02;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		System.out.println("");
//		
//		int a = 1;
//		while (a <= 10) {
//			System.out.println(a);
//			a++;
//		}
//
//		
//		
//		Scanner sb = new Scanner(System.in);
//
//		while (true) {
//			System.out.print("숫자입력 => ");
//			int b = sb.nextInt();
//			if (b == 0) {
//				break;
//			}
//		}
//		System.out.println("반복종료");
//		
//		
		Scanner sc = new Scanner(System.in);
		// 반복해서 숫자를 입력받아 출력
		// 3의 배수는 피즈, 5의배수는 버즈, 3과 5의 배수는 피즈버즈
		// 0이 입력되면 반복 종류

		while (true) {
			System.out.print("숫자를 입력해주세요 => ");
			int c = sc.nextInt();
			if (c == 0) {
				System.out.println("피즈버즈게임을 끝냅니다.");
				break;
			} else if (c % 3 == 0 && c % 5 == 0) {
				System.out.println("피즈버즈");
			} else if (c % 3 == 0) {
				System.out.println("피즈");
			} else if (c % 5 == 0) {
				System.out.println("버즈");
			} else {
				System.out.println(c);
			}
		}

	}

}
