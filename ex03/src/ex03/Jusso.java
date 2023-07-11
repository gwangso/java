package ex03;

import java.util.*;

public class Jusso {

	public static void run() {
		Scanner sc = new Scanner(System.in);
		List<StudentVO> students = new ArrayList<StudentVO>();
		
		int cnt = 1;
		// Sample Data
		StudentVO std = new StudentVO(cnt++,"마그네슘","지브롤터","010-1010-1010");
		students.add(std);
		std = new StudentVO(cnt++,"알루미늄","하나무라","010-4851-4684");
		students.add(std);
		std = new StudentVO(cnt++,"붕소","부산","010-2323-4461");
		students.add(std);
	

		allroof: while (true) {
			System.out.println("================================================");
			System.out.println("1.등록 | 2.목록 | 3.조회 | 4.수정 | 5.삭제 | 0.종료");
			System.out.print("메뉴 선택 > ");
			String menu1 = sc.nextLine();

			switch (menu1) {
			case "0":
				break allroof;
				
			case "1":
				StudentVO nStd = new StudentVO();
				nStd.nJoin(cnt);
				students.add(nStd);
				System.out.println("학생 등록 완료");
				System.out.println("현제 학생 수 : " + students.size());
				break;
				
			case "2":
				System.out.println("학번\t\t이름\t주소\t연락처");
				System.out.println("================================================");
				for (int i = 0; i<students.size();i++) {
					students.get(i).print_land();
				}
				break;
				
			case "3":
				System.out.print("학번 입력 > ");
				String find = sc.nextLine();
				StudentVO fstd = new StudentVO();
				fstd = search(students, find);
				if (fstd.getSno()!=null) {
					fstd.print_port();
				}else {
					System.out.println("학생없음");
				}
				break;
				
			case "4":
				System.out.println("===========수정페이지===========");
				System.out.print("학번 입력 > ");
				find = sc.nextLine();
				fstd = new StudentVO();
				fstd = search(students, find);//검색 메소드
				if (fstd.getSno()!=null) {
					System.out.print("주소 > ");
					String fad = sc.nextLine();
					System.out.println("'" + fstd.getName() + "'학생의 주소를 '" + fstd.getAddress() + "'에서 '" + fad + "'로 바꿉니다.");
					fstd.setAddress(fad);
				}else {
					System.out.println("학생없음");
				}
				break;
				
			case "5":
				System.out.println("===========삭제페이지===========");
				System.out.print("학번 입력 > ");
				find = sc.nextLine();
				fstd = new StudentVO();
				fstd = search(students, find);
				if (fstd.getSno()!=null) {
					students.remove(fstd);
					System.out.println("삭제 완료");
				}else {
					System.out.println("학생없음");
				}
				break;
				
			default:
				System.out.println("왜 하라는대로 안하는거야.다시 선택해!");
				
			}
			System.out.println();
		}
		System.out.println("프로그램이 종료됩니다.");
	}
	
	public static StudentVO search(List<StudentVO> list, String sno) {
		StudentVO stu = new StudentVO();
		for (StudentVO s : list) {
			if (s.getSno().equals(sno)) {
				stu = s;
				break;
			}
		}
		return stu;
	}
}