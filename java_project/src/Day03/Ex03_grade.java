package Day03;

import java.util.Scanner;

public class Ex03_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("=====성적표=====");
			System.out.print("국어 => ");
			int kor = sc.nextInt();
			System.out.print("영어 => ");
			int eng = sc.nextInt();
			System.out.print("수학 => ");
			int mat = sc.nextInt();

			int tot = kor + eng + mat;
			double ave = Math.round(tot / (double)3);
			String grade;

			if (ave >= 90) {
				grade = "A";
			} else if (ave >= 80) {
				grade = "B";
			} else if (ave >= 70) {
				grade = "C";
			} else if (ave >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}

			System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("===================================================");
			System.out.printf("%d \t%d \t%d \t%d \t%.2f \t%s\n",kor,eng,mat,tot,ave,grade);
			System.out.println();

		}

	}

}
