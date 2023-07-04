package ex02;

import java.util.*;

public class ScoreManagement_another {

	public static void run() { // static이 붙으면 필드가 없어도 실행된다.

		Scanner sc = new Scanner(System.in);
		List<ScoreVO> list = new ArrayList<ScoreVO>();
		ScoreVO score = new ScoreVO("1","모란",98,78,62);
		list.add(score);
		score = new ScoreVO("2","동백",65,78,99);
		list.add(score);
		score = new ScoreVO("3","국화",94,96,95);
		list.add(score);
		
		boolean roof = true;
		
		allroof:
		while (roof) {
			System.out.println("==========성적 관리===========");
			System.out.println("1.성적입력 | 2.성적조회 | 3.성적목록 | 4.수정 | 5.삭제 | 0.종료");
			System.out.print("메뉴선택 > ");
			String menu1 = sc.nextLine();
			System.out.println("============================");
			boolean find = false;
			switch (menu1) {
			case "0":
				break allroof;
//				roof = false;
//				break;
			case "1":
				System.out.print("학번 > ");
				String nSno = sc.nextLine();
				System.out.print("이름 > ");
				String nName = sc.nextLine();
				System.out.print("국어 성적 > ");
				int nKor = Integer.parseInt(sc.nextLine());
				System.out.print("영어 성적 > ");
				int nEng = Integer.parseInt(sc.nextLine());
				System.out.print("수학 성적 > ");
				int nMat = Integer.parseInt(sc.nextLine());
				ScoreVO scr = new ScoreVO(nSno, nName, nKor, nEng, nMat);
//				scr.setGrd();
				list.add(scr);
				System.out.println("학생등록 완료.");
				break;
			case "2":
				System.out.print("학번 입력 > ");
				String search = sc.nextLine();
				for (ScoreVO s : list) {
					if (s.getSno().equals(search)) {
						find = true;
						s.print_port();
					}
				}
				if (!find) {
					System.out.println("학생 없음");
				}
				break;
			case "3":
				System.out.println("\t\t학번\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
				System.out.println("================================================================================");
				for (ScoreVO s : list) {
//					s.setTot(s.getKor()+s.getEng()+s.getMat());
//					s.setAvg(s.getTot()/3.);
//					String grade = getGrade(s.getAvg());
//					s.setGrd(grade);
					s.print_land();
				}
				break;
			case "4":
				System.out.print("학번 입력 > ");
				search = sc.nextLine();
				for (ScoreVO s : list) {
					if (s.getSno().equals(search)) {
						find = true;
						System.out.print("국어 > ");
						s.setKor(sc.nextInt());
						System.out.print("영어 > ");
						s.setEng(sc.nextInt());
						System.out.print("수학 > ");
						s.setMat(sc.nextInt());
						sc.nextInt();
						s.setAvg();
						s.setTot();
						s.setGrd();
						s.print_port();
						System.out.println("수정완료");
					}
				}
				if (!find) {
					System.out.println("학생 없음");
				}
				break;
			case "5":
				System.out.print("학번 입력 > ");
				search = sc.nextLine();
				for (int i = 0; i<list.size();i++) {
					if (list.get(i).getSno().equals(search)) {
						find = true;
						list.remove(i);
						System.out.println("퇴학 완료");
					}
				}
				if (!find) {
					System.out.println("학생 없음");
				}
				break;
			default:
				System.out.println("다시 입력");
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}
	
	public static String getGrade(double avg) {
		String grade = "";
		if (avg>= 90) {
			if (avg>=95) {
				grade = "A+";								
			}else {
				grade = "A0";				
			}
		} else if (avg>= 80) {
			if (avg>=85) {
				grade = "B+";								
			}else {
				grade = "B0";				
			}
		} else if (avg>= 70) {
			if (avg>=75) {
				grade = "C+";								
			}else {
				grade = "C0";				
			}
		} else if (avg>= 60) {
			if (avg>=65) {
				grade = "D+";								
			}else {
				grade = "D0";				
			}
		} else {
			grade = "F";
		}
		return grade;
	}

}