package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("==========================");
			System.out.println("1.타입 | 2.연산자 | 3.조건문 | 4.반복문 | 5.배열 | 6.주소관리 | 7.주소관리1");
			System.out.print("메뉴 선택 > ");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
//				TypeSample type = new TypeSample();
//				type.run();
//				type.run();
				TypeSample.run(); // Static은 이런식으로 바로 사용할 수 있다.
				// 클레스이름.메서드 를 이용해 바로 사용 가능

				break;
			case "2":
				System.out.print("점수 : ");
				System.out.println();
				Operation.run();
				break;
			case "3":
				Condition.run();
				break;
			case "4":
				Repeat.run();
				break;
			case "5":
				Dimension.run();
				break;
			case "6":
				Address.run();
				break;
			case "7":
				Address1.run();
				break;

			}
		}

	}
}