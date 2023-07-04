package Day07;

import java.util.Scanner;

public class 복습1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		// 아이디가 틀렸습니다. 비밀번호가 틀렸습니다. 로그인 성공
//		String id = "test";
//		String pw = "1234";
//
//		System.out.print("아이디 입력 > ");
//		String loginId = sc.next();
//		System.out.print("비밀번호 입력 > ");
//		String loginPw = sc.next();
//
//		if (loginId.equals(id)) {
//			if (loginPw.equals(pw)) {
//				System.out.println("로그인 성공");
//			} else {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//		} else {
//			System.out.println("아이디가 틀렸습니다.");
//		}

//		// 1~입력받은 수까지의 합 출력
//		System.out.print("수입력 > ");
//		int num1 = sc.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= num1; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		// 입력받은 단의 구구단 출력
//		System.out.print("단 입력 > ");
//		int dan = sc.nextInt();
//		
//		for(int i = 1; i<=19; i++) {
//			System.out.printf("%d x %d = %d\n",dan, i, (dan*i));
//		}

		// 구구단 2~9단, 중복if문
//		for (int i = 2; i<9; i++) {
//			System.out.printf("[%d 단]\t\t",i);
//		}
//		System.out.println();
//		
//		for (int i = 1; i <=9; i++) {
//			for (int j = 2; j<=9; j++) {
//				System.out.printf("%d x %d = %d\t",j,i,j*i);
//			}
//			System.out.println();
//		}

//		//1~100까지 3의배수는 피즈 , 5의 배수는 버즈, 3과 5의배수는 피즈버즈, 나머지는 숫자 출력
//		// 1, 2, 피즈, 4, 버즈
//		for (int i =1; i<=100; i++) {
//			if (i%3==0 && i%5==0) {
//				System.out.println("피즈버즈");
//			}else if (i%3 ==0) {
//				System.out.println("피즈");
//			}else if (i%5 == 0) {
//				System.out.println("버즈");
//			}else { 
//				System.out.println(i);
//			}
//			
//		}

		int[] lotto = new int[9];
		int cnt = 0;
		while (true) {
			boolean run = false;
			int num = (int) ((Math.random() * 9) + 1);
			for (int i = 0; i <= cnt; i++) {
				if (lotto[i] == num) {
					run = false;
					break;
				} else {
					run = true;
				}
			}
			if (run) {
				lotto[cnt] = num;
				cnt++;
			}
			if (cnt == lotto.length) {
				break;
			}
			}
		

		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

	}

}
