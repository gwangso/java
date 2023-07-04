package Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Student[] std = new Student[10]; // std에 Student의 객체가 들어간다.
		List<Student> list = new ArrayList<Student>();

		while (true) {
			System.out.println("===============학사관리시스템===============");
			System.out.println("1.학생등록 2.학생리스트 3.학생검색 0.종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
//				Student s = new Student();// 따로 여러개 해야할 필요 없다
										  // Scanner sc를 여러개 만들 필요 없듯이
				System.out.print("학번 > ");
				String nNo = sc.next();
				System.out.print("이름 > ");
				String nName = sc.next();
				System.out.print("학과 > ");
				String nDept = sc.next();
				System.out.print("학년 > ");
				int nYear = sc.nextInt();
				Student s = new Student(nNo, nName, nDept, nYear);				
				System.out.println("'" + s.getName() + "'학생 등록 완료!");
				list.add(s);
			} else if (menu == 2) {
				System.out.println("학번\t이름\t학과\t학년");
				System.out.println("_____________________________");
				for (int i = 0; i<list.size();i++) {
					list.get(i).print();
				}
			} else if (menu == 3) {
				System.out.print("학번을 입력하세요 > ");
				String search = sc.next();
				boolean find = false;
				for (int i = 0; i<list.size();i++) {
					if(search.equals(list.get(i).getNo())) {
						find = true;
						list.get(i).print();
					}
				}
				if (!find) {
					System.out.println("학생을 찾을 수 없습니다.");
				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
