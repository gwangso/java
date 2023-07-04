package Day04;

import java.util.Scanner;

public class Ex07_up_down {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println(answer); 

//		boolean run1 = true;

		int cnt = 0;
		int ty = 10;
		int answer = (int) (Math.random() * 31) + 1; // 1~31까지 랜덤숫자
		
		while (true) {
			System.out.println("===== Up & Down =====\t" + (ty - cnt));
			System.out.print("숫자를 입력해주세요 => ");

			int num = sc.nextInt();
			cnt ++;

			// up, down, 정답 후 반복문 종료
			if (num == answer) {
				System.out.println("정답입니다.");
				System.out.println(cnt + "번만에 맞추셨습니다.");
				if (cnt == 1) {
					System.out.println("perfect");
				} else if (cnt <= 3) {
					System.out.println("good");
				} else if (cnt <= 5) {
					System.out.println("normal");
				} else {
					System.out.println("soso");
				}
				break;
			} else if (cnt == 10) {
				System.out.println(ty + "번의 기회를 모두 소진했습니다.");
				System.out.print("재시작하시겠습니까?(Y/y) => ");
				String re = sc.next();
				if (!(re.equals("y") || re.equals("Y"))) {
					answer = (int) (Math.random() * 31) + 1;
					break;
				}
				cnt = 0;
			} else if (num < answer) {
				System.out.println("Up");
			} else if (num > answer) {
				System.out.println("Down");
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}

}
