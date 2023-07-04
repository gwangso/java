package Day06;

import java.util.Scanner;

public class 연습장06_3 {

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
			System.out.println("===== Up & Down ===== 참가자 " + names[t]);
			int answer = (int) (Math.random() * 31) + 1;
		System.out.println(answer);
			while (true) {
				System.out.print("숫자를 입력해주세요 => ");
				int num = sc.nextInt();
				cnt++;

				// up, down, 정답 후 반복문 종료
				if (num == answer) {
					System.out.println("정답입니다.");
					System.out.println(cnt + "\n번만에 맞추셨습니다.\n");
					scr[t] = cnt;
					cnt = 0;
					t++;
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
			System.out.println();
		}
		
		for (int i = 1; i < names.length; i++) {
			for (int j = 1; j<names.length;j++) {
				if (scr[j-1] > scr[j]) {
					String tempS = names[j-1];
					int tempN = scr[j-1];
					names[j-1] = names[j];
					scr[j-1] = scr[j];
					names[j] = tempS;
					scr[j] = tempN;
				}
			}
		}
		
		System.out.println("===========결과===========");
		for (int i = 0; i < names.length; i++) {
			System.out.print("참가자" + (i + 1) + "\t");
		
		}
		System.out.print("\n\n");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + "\t");
		}
		System.out.print("\n\n");
		for (int i = 0; i < names.length; i++) {
			System.out.print(scr[i] + "번\t");
		}
		System.out.println();
				
		int com = 0;
		for (int i = 0; i < names.length; i++) {
			if (scr[i] == scr[0]) {
				com ++;				
			}
		}
		if (com >= 2) {
			System.out.println("공동 1등입니다.");
		}
		for (int i = 0; i < names.length; i++) {
			if (scr[i] == scr[0]) {
				System.out.println(names[i] + "님, 1등 축하드립니다.");				
			}
		}
	}
}
