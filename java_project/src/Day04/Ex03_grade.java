package Day04;

import java.util.Scanner;

public class Ex03_grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run1 = true;
		
		while (run1) {
			System.out.println("=================성적표=================");
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int mat = sc.nextInt();
			
			int toa = (kor + eng + mat);
			double avg = toa/(double)3;
			String grd;
			if (avg >= 90) {
				grd = "A";
			}else if (avg >= 80) {
				grd = "B";
			}else if (avg >= 70) {
				grd = "C";
			}else if (avg >= 60) {
				grd = "D";
			}else { 
			// else if (avg < 60)로 주면 초기화가 안될 가능성이 있다고 인식해버려서 grd가 값을 받지 못 할 수도 있다.
			// 왜인지 모르겠으나 자바는 60이상이 아니고 60미만이 아닌 무언가가 있다고 판단한는 듯
			
				grd = "F";
			}
			System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("================================================");
			System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%s\n\n",kor,eng,mat,toa,avg,grd);
		}
		
		
	}

}
