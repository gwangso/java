package Day06;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int[] number = new int[3];
//		System.out.print(">");
//		int cnt = 0;
//		for(int i=0; i<100000; i++) {
//			sc.nextLine();
//			for(int j = 0; j<number.length; j++) {
//				number[j] = (int)(Math.random()*45)+1;
//				System.out.print(number[j] + " ");
//			}
//			cnt++;
//			if (number[0] == number[1] && number[1] == number[2]) {
//				System.out.println("\n정답");
//				break;
//			}
//		}

		int[] lotto = new int[9];

		// lotto배열에 중복없이 1~9까지 값 넣기
		// 1번방법
		int cnt = 0;
		while (cnt < lotto.length) {
			int n = (int) (Math.random() * 9) + 1;
			boolean t = false;
			for (int i = 0; i < cnt; i++) {
				if (lotto[i] == n) {
					break;
				}else {
					t = true;		
					break;
				}
			}
			if (!t) {
				lotto[cnt] = n;
				cnt++;
			}
		}
		
		for (int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
//		System.out.println();
//		
//		for (int j = 0; j < lotto.length; j++) {
//			int num = (int) (Math.random() * 9) + 1;
//			boolean find = true;
//			for (int i = 0; i < lotto.length; i++) {
//				if (num == lotto[i]) {
//					find = false;
//					break;
//				}
//			}
//			if (find) {
//				lotto[j] = num;
//			} else {
//				j--;
//			}
//		}
//
//		System.out.print(lotto[0] + " ");
//		System.out.print(lotto[1] + " ");
//		System.out.print(lotto[2] + " ");
//		System.out.print(lotto[3] + " ");
//		System.out.print(lotto[4] + " ");
//		System.out.print(lotto[5] + " ");
	}
}
