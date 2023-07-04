package Day04;

import java.util.Scanner;

public class Ex05_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		while(true) {
			System.out.println("===========sort============");
			
			System.out.print("첫번째 숫자 => ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자 => ");
			int num2 = sc.nextInt();
			
			if (num1>num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			System.out.println("1.오름차순 2.내림차순 0.종료");
			System.out.print("선택 => ");
			int menu1 = sc.nextInt();
			if (menu1 == 1) {
				for (int i = num1; num2 >= i; i++) {
					System.out.print(i +" ");
					cnt ++;
					if (cnt == 20) {
						System.out.println();
						cnt = 0;
					}
				}
			}else if(menu1 == 2) {
				for (int i = num2; i >= num1; i--) {
					System.out.print(i + " ");
					cnt ++;
					if (cnt == 20) {
						System.out.println();
						cnt = 0;
					}
				}
			}
			cnt = 0;
			System.out.println();
			
		}
	}

}
