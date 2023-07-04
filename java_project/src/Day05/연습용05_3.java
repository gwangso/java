package Day05;

import java.util.Scanner;

public class 연습용05_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
			System.out.print("참가자" + (i + 1) + "\t");
		}
		System.out.print("\n\n");
		for (int i = 0; i < names.length; i++) {
			System.out.print(scr[i] + "번\t");
		}		
	}
}
