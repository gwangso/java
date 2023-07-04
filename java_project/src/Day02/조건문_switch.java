package Day02;

import java.util.Scanner;

public class 조건문_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sa = new Scanner(System.in);
		System.out.print("숫자입력 => ");
		int a = sa.nextInt();
		
		switch(a) {
		case 1: // if (a == 1)
			System.out.println("1을 선택하였습니다.");
			break;
		case 2: // if (a == 2)
			System.out.println("2을 선택하였습니다.");
			break;
		case 3: // if (a == 3))
			System.out.println("3을 선택하였습니다.");
			break;
		default :
			System.out.println("1~3까지 입력하세요.");
		}
		
		System.out.println("");
		System.out.println("===================");
		System.out.println("");	

		// 입력한 월의 영어 출력
		Scanner sb = new Scanner(System.in);
		System.out.print("월 입력 => ");
		int b = sb.nextInt();
		
		switch(b) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default :
			System.out.println("잘못 입력하셨습니다. 1년은 12월까지 있습니다.");
		}
	}

}
