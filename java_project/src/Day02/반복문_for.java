package Day02;

import java.util.Scanner;

public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i=1; i < 50; i++) { // i++ == i = i+1
//			System.out.println("안녕하세요");
//		}
//		// 1부터 10까지
//		for(int i = 0; i<10; i++) {
//			System.out.print(i + " ");
//		}
//		// 1부터 10까지 홀수
//		System.out.println("");
//		for(int i = 1; i <= 10; i= i+2) {
//			System.out.print(i + " ");
//		}
//		// 0부터 9까지 짝수
//		System.out.println("");
//		for(int i = 0; i < 10; i = i + 2) {
//			System.out.print(i + " ");
//		}
//		System.out.println("");
//		// 3부터 100ㄲ지
//		for(int i = 3; i <=100; i ++) {
//			System.out.print(i + " ");
//			if (i == 50 || i == 25 || i == 75) {
//				System.out.println("");
//			}
//		}
//		System.out.println("");
//		for(int i = 1; i<=10; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println("");
//		for(int i = 2; i <=20; i = i + 2) {
//			System.out.print(i + " ");
//		}
//		System.out.println("");
//		for(int i = 1; i <= 20; i = i + 2) {
//			System.out.print(i + " ");
//		}
//		System.out.println("");
//		for(int i=1; i<=20; i++) {
//			if (i %2 == 0) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println("");
//		for(int i= 1; i <=10; i++) {
//			if (i<=9) {
//				System.out.print(i +", ");
//			}else if (i == 10) {
//				System.out.print(i);
//			}
//		}
//		System.out.println("");
//		
//		
//		
//		int sum = 0;
//		for (int i = 1; i <=10; i++) {
//			sum = sum + i;
//		}
//		System.out.println("1부터 10까지의 총합 = \n" + sum);
//		
//		Scanner sa = new Scanner(System.in);
//		System.out.print("원하시는 구구단을 입력하십시오 => ");
//		int dan = sa.nextInt();
//		
//		for(int i =1; i<20; i++) {
//			System.out.println(dan + " * " + i + " = " + (dan*i));
//		}
//		
//		
//		Scanner sb = new Scanner(System.in);
//		Scanner si = new Scanner(System.in);
//		
//		int a = sa.nextInt();
//		System.out.print("최댓값 ");
//		int b = sb.nextInt();
//
//		System.out.print("시작값 ");
//		for (int i= sb.nextInt(); i<=b; i++) {
//			System.out.print(i + " ");
//		}
//		
//		//1~100까지 3의 배수 갯수출력
//		int cnt = 0;
//		
//		for (int i = 0; i <= 100; i++) {
//			if(i%3 == 0) {
//				cnt++; // cnt = cnt + 1
//			}
//		}
//		System.out.println(cnt);
//		
//		
//		int i = 0;
//		
//		for (; i <= 100; i++) {
//		}
//		System.out.println(i);
//
//		//1~100까지 3의 배수 갯수
//		
//
//		int cnt1 = 0;
//		int cnt2 = 0;
//		
//		for (int i = 1; i<=100; i++) {
//			if (i%3 == 0) {
//				cnt1 ++;
//			if (i%5 == 0) {
//				cnt2 ++;
//			}
//		}
//		System.out.println("3의배수 " + cnt1 + "개");
//		System.out.println("5의배수 " + cnt2 + "개");		
//	
//
//		int cnt3 = 0;
//		int cnt4 = 0;
//		
//		for (int i = 1; i<=100; i++) {
//			if (i%3 == 0 && i%5 == 0) {
//				cnt3 ++;
//				cnt4 ++;
//			} else if (i%3 == 0) {
//				cnt3 ++;
//			} else if (i%5 == 0) {
//				cnt4 ++;
//			}
//		}
//		System.out.println("3의배수 " + cnt3 + "개");
//		System.out.println("5의배수 " + cnt4 + "개");		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇 부터 => ");
//		int c = sc.nextInt();
//		System.out.print("몇 까지 => ");
//		int d = sc.nextInt();
//		
//		int sum5 = 0;
//		
//		for (int i = c; i <= d; i++) {
//			sum5 = sum5 + i;
//		}
//		System.out.println(sum5);
//		
//		// 피즈버즈 게임
//		// 입력받은 수부터 입력받은 수까지 출력
//		// 3의 배수는 피즈, 5의 배수는 버즈, 3과 5의 배수는 피즙즈
//		// 예시) 1, 2, 피즈, 4, 버즈, 피즈, 7, 8, 피즈, 버즈, 
//		
//		Scanner se = new Scanner(System.in);
//		System.out.print("최솟값 = ");
//		int e = se.nextInt();
//		System.out.print("최댓값 = ");
//		int f = se.nextInt();
//		
//		for (int i = e; i <= f; i++) {
//			if(i%3 == 0 && i%5 == 0) {
//				System.out.println("피즈버즈");
//			}else if (i%3 == 0) {
//				System.out.println("피즈");
//			}else if (i%5 == 0) {
//				System.out.println("버즈");
//			}else {
//				System.out.println(i);
//			}
//		}
		
		Scanner se = new Scanner(System.in);
		System.out.print("최솟값 = ");
		int e = se.nextInt();
		System.out.print("최댓값 = ");
		int f = se.nextInt();
		
		for (int i = e; i <= f; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("피즈버즈");
			}else if (i%3 == 0) {
				System.out.println("피즈");
			}else if (i%5 == 0) {
				System.out.println("버즈");
			}else {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
