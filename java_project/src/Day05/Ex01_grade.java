package Day05;

import java.util.Scanner;

public class Ex01_grade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[10];
		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] mat = new int[10];
		int[] toa = new int[10];
		double[] avg = new double[10];
		char[] grd = new char[10];
		
		int cnt = 0;
		
		boolean run1 = true;
		
		while (run1) {
			System.out.println("============성적등록============");
			System.out.println("1.성적등록 2.성적리스트 0.종료");
			System.out.print("메뉴 선택 => ");
			int menu = sc.nextInt();
			
			if (menu==1) {
				System.out.println("----------성적등록 페이지-----------");
				System.out.print("학생이름 => ");
				name[cnt] = sc.next();
				System.out.print("국어성적 => ");
				kor[cnt] = sc.nextInt();
				System.out.print("영어성적 => ");
				eng[cnt] = sc.nextInt();
				System.out.print("수학성적 => ");
				mat[cnt] = sc.nextInt();
				toa[cnt] = kor[cnt] + eng[cnt]+mat[cnt];
				avg[cnt] = toa[cnt]/(double)3;
				if (avg[cnt]>=90) {
					grd[cnt] = 'A';
				}else if(avg[cnt] >= 70) {
					grd[cnt] = 'B';
				}else if (avg[cnt] >= 50) {
					grd[cnt] = 'C';
				}else if (avg[cnt] >= 30) {
					grd[cnt] = 'D';
				}else {
					grd[cnt] = 'F';
				}
				cnt ++;
			}else if (menu==2) {
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
				System.out.println("==========================================================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n",name[i],kor[i],eng[i],mat[i],toa[i],avg[i],grd[i]);
				}
			}else if (menu==0) {
				System.out.println();
				break;
			}else {
				System.out.println("0~2까지 입력할 수 있습니다.");
			}
			System.out.println();
			
		}
		System.out.println("프로그램 종료");
		
	}

}
