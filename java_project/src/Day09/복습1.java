package Day09;

import java.util.Scanner;

public class 복습1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)(Math.random()*31)+1;
		
		while (true) {
			System.out.println("==========up&down=========");
			System.out.print("숫자 입력 > ");
			int chan = sc.nextInt();
			
			if (chan == answer)	{
				System.out.println("!!정답입니다!!");
				break;
			}else if (chan > answer) {
				System.out.println("Down");
			}else if (chan < answer) {
				System.out.println("Up");
			}
			System.out.println();
		}
		System.out.println("게임 종료");	
	}
}