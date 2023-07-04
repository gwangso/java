package Day08;

import java.util.Scanner;


public class 연습장08_1 {

	public static void main(String[] args) {
		
//		allLoop:
//		for (int i = 2; i < 10; i++) {
//			for (int j = 2; j < 10; j++) {
//				if (i == 5) {
//					break allLoop;
//				}
//				System.out.println(i + " * " + j + " = " + (i * j));
//			}
//			
//		}
		
		Scanner sc = new Scanner(System.in);
		연습장08_3 cho = new 연습장08_3();
		System.out.println("글좀써라");
		String answer = sc.next();
		String a = cho.getInitialSound(answer);
		if (a.equals("ㄹ")) {
			System.out.println(a);
		}else {
			System.out.println("이런 ㅅ");
		}

	}
}
