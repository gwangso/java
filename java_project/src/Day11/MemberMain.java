package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<Member>();
		Long id = 100l;// 뒤에 l을 붙여야 long type으로 인식
		
		while (true) {
			System.out.println("1.멤버등록 2.멤버리스트 3.멤버검색 0.종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				System.out.print("이메일 > ");
				String nEmail = sc.next();
				System.out.print("비밀번호 > ");
				String nPw = sc.next();
				System.out.print("이름 > ");
				String nName = sc.next();
				Member m = new Member(id++, nEmail +"@.naver.com", nPw, nName); // id++는 id를 입력하고 +1시킨거다
				//따라서 번호는 100부터 시작한다.
				System.out.println("'" + nName + "'님 멤버가입 축하드립니다.");
				System.out.println("아이디는 '" + m.getId() + "'입니다.");
				list.add(m);
				
			}else if (menu ==2) {
				System.out.println("아이디\t이메일\t비밀번호\t이름\t가입날짜");
				System.out.println("=======================================================");
//				for (int i = 0; i<list.size();i++) {
//					list.get(i).print();
//				}
				for(Member s : list) { //향상된 for문 or foreach문
					// arraylist 배열 set let 등등 여러가지 데이터를 가진것들이 온다
					//list에 들어있는것을 뽑아서 Member s에 집어넣는 방식
					// list가 전부 s에 담길때까지 반복
					s.print();
				}
			}else if (menu == 3) {
				System.out.print("아이디를 입력하세요 > ");
				long searchId = sc.nextLong();
				boolean find = false;
				for(int i = 0; i<list.size(); i++) {
					if (list.get(i).getId().equals(searchId)) {
						System.out.println("아이디\t이메일\t	비밀번호\t이름\t가입날짜");
						System.out.println("=======================================================");
						list.get(i).print();
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("등록되지 않은 아이디입니다.");
				}
			}else if (menu ==0) {
				break;
			}else {
				System.out.println("다시 입력해주세요");
			}
			
		}
		
	}

}
