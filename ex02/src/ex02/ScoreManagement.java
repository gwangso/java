package ex02;

import java.util.*;

public class ScoreManagement {

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
		int count = 0;
		
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
				System.out.println("학번 : 2023" + (count+4));
				System.out.print("이름 > ");
				String nName = sc.nextLine();
				System.out.print("국어 성적 > ");
				int nKor = sc.nextInt();sc.nextLine();
				System.out.print("영어 성적 > ");
				int nEng = sc.nextInt();sc.nextLine();
				System.out.print("수학 성적 > ");
				int nMat = sc.nextInt();sc.nextLine(); 
				score = new ScoreVO(String.valueOf(count+4), nName, nKor, nEng, nMat);
//				scr.setGrd();
				count++;
				list.add(score);
				System.out.println("학생등록 완료.");
				break;
			
			case "2":
				System.out.print("학번 입력 > ");
				String src = sc.nextLine();
				
				score = search(list, src); //score변수는 위에있다
				if (score.getSno()==null) {
					System.out.println("학생 없음");					
				}else {
					score.print_port();
				}
				break;
	
			case "3":
				System.out.println("\t\t학번\t이름\t국어\t영어\t수학\t총점\t평균\t등급");
				System.out.println("================================================================================");
				for (ScoreVO s : list) {
					s.print_land();
				}
				break;
			
			case "4":
				System.out.print("학번 입력 > ");
				src = sc.nextLine();
				for (ScoreVO s : list) {
					if (s.getSno().equals(src)) {
						find = true;
						System.out.print("국어 > ");
						s.setKor(Integer.parseInt(sc.nextLine()));
						System.out.print("영어 > ");
						s.setEng(Integer.parseInt(sc.nextLine()));
						System.out.print("수학 > ");
						s.setMat(Integer.parseInt(sc.nextLine()));
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
				src = sc.nextLine();
				score = search(list,src);
				if (score.getSno()==null) {
					System.out.println("학생 없음");
				}else {
					list.remove(score);
					System.out.println("퇴학완료");
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
	
	public static ScoreVO search(List<ScoreVO> list, String sno) { //String으로 받듯이 ScoreVO클레스로 받는것
		ScoreVO vo = new ScoreVO();
		boolean find = false;
		for (ScoreVO s : list) {
			if(s.getSno().equals(sno)) {
				vo = s;
			}
		}
		return vo; // 못찾으면 vo에는 null값이 들어가 있다.
	}
}