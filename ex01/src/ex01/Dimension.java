package ex01;

import java.util.Scanner;

public class Dimension {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[22];
		String[] addresses = new String[22];
		int index = 0;
		boolean roof = true;
		while (roof) {
			System.out.println("==========================");
			System.out.println("1.주소등록 | 2.주소목록 | 0.종료");
			System.out.print("메뉴선택 > ");
			String menu = sc.nextLine();
			
			switch (menu) {
			case "0":
				roof = false;
				break;
			case "1":
				System.out.print("이름을 입력하세요 > ");
				names[index] = sc.next();
				System.out.print("주소를 입력하세요 > ");
				addresses[index] = sc.next();
				index++;
				System.out.println(index + "명 입력완료!");
				break;
			case "2":
				System.out.println("번호\t이름\t주소");
				System.out.println("=======================");
				for (int i = 0; i<index; i++) {
					System.out.printf("%d\t%s\t%s\n",i+1,names[i],addresses[i]);
				}
				break;
			default:
				System.out.println("메뉴를 다시 선택해주세요!");
			}
			if (index == 22) {
				roof = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}