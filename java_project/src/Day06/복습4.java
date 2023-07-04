package Day06;

import java.util.Scanner;

public class 복습4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// a배열의 0번째값을 출력할땐 a[0]

//		int[] a = {12, 3, 4, 5, 34};
//		for (int i  = 0; i<a.length;i++) {
//			if (i == a.length-1) {
//				System.out.println(a[i]);
//				break;
//			}
//			System.out.print(a[i] + ", ");
//		}

//		int[] b = new int[10];
//		
//		for (int i = 0; i<b.length; i++) {
//			b[i] = i+1;
//			System.out.print(b[i] + " ");
//		}

//		int[] c = {12, 3, 5, 2, 15};
//		int sum = 0;
//		// c배열의 총합
//		
//		for (int i = 0; i<c.length; i++) {
//			sum += c[i];
//		}
//		System.out.println("총합 : " + sum);

//		int[] d = {12, 3, 2, 24, 42};
//		// d[0]번째에 모든 값 누적
//		
//		for (int i = 1; i<d.length; i++) {
//			d[0] += d[i];
//		}
//		System.out.print("총합 " + d[0]);

		int[] e = { 12, 3, 2, 24, 42 };
		// e배열 한칸씩 앞당기기 {3, 2, 24, 42, 12}
		int temp = e[0];
		for (int i = 1; i<e.length; i++) {
			e[i-1] = e[i];
			if (i == e.length-1) {
				e[i] = temp;
			}
		}
		for (int i = 0; i<e.length; i++) {
		System.out.print(e[i] + " ");
		}
		
		
		
	}

}
