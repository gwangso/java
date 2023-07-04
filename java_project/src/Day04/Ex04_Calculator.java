package Day04;

import java.util.Scanner;

public class Ex04_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean run1 = true;

		while (run1) {
			// 첫번째 숫자 입력
			System.out.println("==============계산기==============");
			System.out.print("첫번째 숫자입력 => ");
			int num1 = sc.nextInt();

			String menu1 = null;
			while (true) {
				System.out.print("연산자 선택 => ");
				menu1 = sc.next();
				if (menu1.equals("+") || menu1.equals("-") || menu1.equals("*") || menu1.equals("/")
						|| menu1.equals("%")) {
					break;
				} else {
					System.out.println("연산자를 다시 선택해주세요.");
				}
			}

			System.out.print("두번째 숫자 입력 => ");
			int num2 = sc.nextInt();

			int result;

			if (menu1.equals("+")) {
				result = num1 + num2;
				System.out.printf("%d + %d = %d\n", num1, num2, result);
			} else if (menu1.equals("-")) {
				result = num1 - num2;
				System.out.printf("%d - %d = %d\n", num1, num2, result);
			} else if (menu1.equals("*")) {
				result = num1 * num2;
				System.out.printf("%d * %d = %d\n", num1, num2, result);
			} else if (menu1.equals("/")) {
				result = num1 / num2;
				System.out.printf("%d / %d = %d\n", num1, num2, result);
			} else if (menu1.equals("%")) {
				result = num1 % num2;
				System.out.printf("%d %% %d = %d\n", num1, num2, result);
			} else {
				System.out.println("연산자를 잘못입력하셨습니다.");
			}

		}
	}

}
