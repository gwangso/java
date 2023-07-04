package Day04;

import java.util.Scanner;

public class 연습장04_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int sum1 = 0;
//		
//		while (true) {
//			System.out.println("===========sum===========");
//			System.out.print("첫번째 수 입력 => ");
//			int num1 = sc.nextInt();
//			System.out.print("두번째 수 입력 => ");
//			int num2 = sc.nextInt();
//			
//			System.out.println("1.총합 2.짝수의합 3.홀수의합 0.종료");
//			System.out.print("입력 => ");
//			int menu1 = sc.nextInt();
//					
//			if (menu1 == 1) {
//				sum1 = sum1 + num1 + num2;
//			}else if (menu1 == 2) {
//				if (num1%2 == 0 && num2%2 == 0) {
//					sum1 = sum1 + num1 + num2;
//				}else if(num1%2 == 0) {
//					sum1 = sum1 + num1;
//				}else if(num2%2 == 0) {
//					sum1 = sum1 + num2;
//				}
//			}else if (menu1 == 3) {
//				 if (num1%2 != 0 && num2%2 != 0) {
//					sum1 = sum1 + num1 + num2;
//				}else if(num1%2 != 0) {
//					sum1 = sum1 + num1;
//				}else if(num2%2 != 0) {
//					sum1 = sum1 + num2;
//				}
//			}else if (menu1 == 0) {
//				break;
//			}
//			System.out.println("총합 = " + sum1);
//		}
//		System.out.println("프로그램 종료");

//		while (true) {
//			System.out.println("===========sum===========");
//			System.out.print("첫번째 수 입력 => ");
//			int num1 = sc.nextInt();
//			System.out.print("두번째 수 입력 => ");
//			int num2 = sc.nextInt();
//			
//			System.out.println("1.총합 2.짝수의합 3.홀수의합 0.종료");
//			System.out.print("입력 => ");
//			int menu1 = sc.nextInt();
//			if (num1 >num2) {
//				int temp = num1;
//				num1 = num2;
//				num2 = temp;
//			}
//			int sum1 = 0;
//			
//			for (int i = num1; num2>= i; i++) {
//				sum1 += i;
//			}
//			if (menu1 == 1) {
//			
//			}else if (menu1 == 2) {
//				for (int i = num1; num2>= i; i++) {
//					if (i%2 == 0) {
//						sum1 +=i;
//					}
//				}
//			}else if (menu1 == 3) {
//				for (int i = num1; num2>= i; i++) {
//					if (i%2 != 0) {
//						sum1 +=i;
//					}
//				}
//			}else if (menu1 == 0) {
//				break;
//			}
//			System.out.println("총합 = " + sum1);
//			System.out.println();
//		}
//		System.out.println();
//		System.out.println("=====프로그램 종료=====");

		boolean run1 = true;
		int cnt = 0;
		int t = 0;

		System.out.print("참가자 수를 설정해주세요 => ");
		int ptc = sc.nextInt();

		String[] names = new String[ptc];
		for (int i = 0; i < names.length; i++) {
			System.out.print("참가자 이름을 적어주세요 => ");
			names[i] = sc.next();
		}
		int[] scr = new int[ptc];

		while (run1) {
			int answer = (int) (Math.random() * 31) + 1;
			while (true) {
				System.out.println("===== Up & Down =====");
				System.out.print("숫자를 입력해주세요 => ");
				int num = sc.nextInt();
				cnt++;

				// up, down, 정답 후 반복문 종료
				if (num == answer) {
					System.out.println("정답입니다.");
					System.out.println(cnt + "번만에 맞추셨습니다.\n");
					scr[t] = cnt;
					cnt = 0;
					t++;
					System.out.println("다음 참가자");
					if (t == ptc) {
						run1 = false;
						System.out.println("게임 종료");
					}
					break;
				} else if (num < answer) {
					System.out.println("Up");
				} else if (num > answer) {
					System.out.println("Down");
				}
				System.out.println();
			}
		}
		System.out.println("===========결과===========");
		for (int i = 0; i < names.length; i++) {
			System.out.print("참가자"+ (i+1) + "\t");
		}
		System.out.print("\n\n");
		for (int i = 0; i < names.length; i++) {
			System.out.print(scr[i] + "번\t");
		}
		
//		String a = " ";
//		if (sc.hasNext()) {
//			a = sc.next();
//			sc.nextDouble();
//			System.out.println(a);
//		}else {
//			sc.nextDouble();
//			System.out.println("값지우기");
//		}
//		

	}

}
