package Day05;

import java.util.Scanner;

public class 연습용05_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변수 개수를 설정해주세요 => ");
		int[] numbers1 = new int[sc.nextInt()];
		
 		for (int i = 0; i < numbers1.length; i++) {
			System.out.print("숫자를 입력해 주세요 => ");
			numbers1[i] = sc.nextInt();
		}
		
		System.out.println("numbers에 들어있는 숫자들입니다.");
		for (int i = 0; i < numbers1.length; i++) {
			System.out.print(numbers1[i] + " ");
		}
		
		// 
		
		int[] num3 = new int[10]; // 10칸짜리 int배열 만들기
		
		for(int i = 0; i < num3.length; i++) {
			System.out.print("num3배열의 " + (i) + "번째 인덱스 => ");
			num3[i] = sc.nextInt();
		}
		
		System.out.println("짝수번째 값만 출력됩니다.");
		for(int i = 0; i < num3.length;i++) {
			if (i%2 == 0) {
				if(i == num3.length || i == num3.length-1) { 
					System.out.println(num3[i]);
				}
				System.out.print(num3[i] + ", ");
			}
		}

		//
		
		int[] c = { 1, 2, 3, 4, 5 };
		while (true) {
			int temp = c[0];
			for (int i = 0; i<c.length; i++) {
				if (i == c.length-1) {
					c[i] = temp;
				}else {
					c[i] = c[i+1];
				}
			}
			for (int i = 0; i<c.length; i++) {
				System.out.print(c[i] + "  ");
			}
			System.out.print("\n다시하시겠습니까?(Y/y) => ");
			String re = sc.next();
			if (!(re.equals("y")|| re.equals("Y"))) {
				break;
			}

		}


	}
}