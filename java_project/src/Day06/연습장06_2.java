package Day06;

import java.util.Arrays;
import java.util.Scanner;

public class 연습장06_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = {5, 8, 2, 4, 9};

		
		for (int j = 1; j<a.length; j++) {
			for (int i = 1; i<a.length; i++) {
				if (a[i-1] <= a[i]) {
					int temp = a[i-1];
					a[i-1] = a[i];
					a[i] = temp;
				}
			}
		}
		
		for (int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));
		

	}

}