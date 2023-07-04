package Day06;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		boolean run1 = true;
		
		int cnt = 0; //시도횟수, 총 10번의 기회
		int chn = 10;
		
		
		while (run1) {
			int answer = (int)(Math.random()*31)+1;
			System.out.println("=======Up & Down======= 남은 시도횟수 : " + (chn-cnt));
			System.out.print("숫자를 입력해주세요 => ");
			int num = sc.nextInt();
			cnt++;
			if (num == answer) {
				System.out.println("정답입니다.");
				System.out.printf("총 %d번만에 맞추셨습니다.\n",cnt);
				break;
			}else if (num > answer) {
				System.out.println("Down");
			}else if (num < answer) {
				System.out.println("Up");
			}
			if (cnt == chn) {
				System.out.println("\n모든 기회를 소진하였습니다.\n");
				break;
			}
			System.out.println();
		}
		System.out.println("");
	}

}
