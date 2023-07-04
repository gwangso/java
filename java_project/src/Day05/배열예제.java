package Day05;

import java.util.Scanner;

public class 배열예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int[] num1 = {23, 14, 15, 16, 2};
//		
//		for (int i = 0; i < num1.length; i++) {
//			if (i == num1.length-1) {
//				System.out.println(num1[i]);
//			}else {
//				System.out.print(num1[i] + ", ");
//			}
//		}
//		//또다른 방법
//		for (int i = 0; i < num1.length; i++) {
//			if (i == num1.length-1) {
//				System.out.println(num1[i]);
//				break;
//			}
//			System.out.print(num1[i] + ", ");
//			
//		}

		// a배열의 전체합 출력
//		int[] num2 = {23, 14, 15, 16, 2};
//		int sum = 0;
//		
//		for (int i = 0; i < num2.length; i++) {
//			sum += num2[i];
//		}
//		System.out.println("배열의 총합 = " +sum);

//		int[] num3 = new int[10]; // 10칸짜리 int배열 만들기
//		
//		for(int i = 0; i < num3.length; i++) {
//			System.out.print("num3배열의 " + (i) + "번째 인덱스 => ");
//			num3[i] = sc.nextInt();
//		}

//		System.out.println("짝수번째 값만 출력됩니다.");
//		for(int i = 0; i < num3.length;i++) {
//			if (i%2 == 0) {
//				if(i == num3.length || i == num3.length-1) { 
//					System.out.println(num3[i]);
//				}
//				System.out.print(num3[i] + ", ");
//			}
//		}
//		System.out.println("짝수값만 출력됩니다.");
//		for (int i =0; i < num3.length; i++) {
//			if (num3[i]%2 == 0) {
//				System.out.print(num3[i] + " ");
//			}
//		}
//		int sum = 0;
//		for (int i = 0; i<num3.length; i++) {
//			if (num3[i]%2 != 0) {
//				sum += num3[i];
//			}
//		}
//		System.out.println("홀수값의 총합 = " + sum);
		// b 배열의 값들중 3의 배수의 합, 5의 배수의 합, 3과 5의 배수의 합, 둘다 아닌값의 합

//		int sum3 = 0; 
//		int sum5 = 0;
//		int sum15 = 0;
//		int nsum = 0;
//		
//		for (int i = 0; i < num3.length; i++) {
//			if (num3[i]%3 == 0 && num3[i]%5 == 0) {
//				sum15 += num3[i];
//			}
//			if (num3[i]%3 == 0) {
//				sum3 += num3[i];
//			}
//			if (num3[i]%5 == 0) {
//				sum5 += num3[i];
//			} 
//			if (!(num3[i]%3 == 0 || num3[i]%5 == 0)) {
//				nsum += num3[i];
//			}
//		}
//		System.out.println("3과 5의 배수의 총합 " + sum15);
//		System.out.println("3의 배수의 총합 " + sum3);		
//		System.out.println("5의 배수의 총합 " + sum5);
//		System.out.println("둘다 아닌 수의 총합 " + nsum);

//		for (int i = 0; i < num3.length; i++) {
//			if (num3[i]%3 == 0 && num3[i]%5 == 0) {
//				sum15 += num3[i];
//				sum3 += num3[i];
//				sum5 += num3[i];
//			}else if (num3[i]%3 == 0) {
//				sum3 += num3[i];
//			}else if (num3[i]%5 == 0) {
//				sum5 += num3[i];
//			} else{
//				nsum += num3[i];
//			}
//		}
//		System.out.println("3과 5의 배수의 총합 " + sum15);
//		System.out.println("3의 배수의 총합 " + sum3);		
//		System.out.println("5의 배수의 총합 " + sum5);
//		System.out.println("둘다 아닌 수의 총합 " + nsum);

//		int[] c = { 1, 2, 3, 4, 5 };
//
//		for (int i = 1; i<c.length; i++) {
//			c[0] += c[i];
//		}
//		
//		System.out.println(c[0]);
//		
		
		// 배열의 값을 한칸씩 앞당기기
		int[] d = { 1, 2, 3, 4, 5 };
		
		int temp = d[0];
		for (int i = 0; i<d.length; i++) {			
			if (i == d.length-1) {
				d[i] = temp;
				break;
			}
			d[i] = d[i+1];
		}
		for (int i = 0; i<d.length; i++) {
			System.out.print(d[i] + "  ");
		}

		
		
	}

}
