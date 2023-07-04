package Day02;

import java.util.Scanner;

public class 연습장02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		// 문장을 입력하는 방법입니다.
//		Scanner sa = new Scanner(System.in);
//		System.out.print("여기에 입력해 주세요 => ");
//		String str_a = sa.nextLine();
//		
//		System.out.println("입력하신 문장은 \"" + str_a + "\"입니다.");
//
//		System.out.println("");
//		System.out.println("===================");
//		System.out.println("");
//		
//		System.out.println("입력하신 숫자부터 원하시는 값까지의 합을 구합니다.");
//		System.out.println("숫자는 0, 음수, 10000이상은 입력할 수 없습니다.");
//
		
		// 최솟값과 최댓값을 설정
		// 그 안의 값을 모두 합함
		// 단 최솟값을 0이나 음수로 설정시 다시 반복
		// 단 최댓값이 최솟값보다 적으면 다시 반복
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주십시오 => ");
		int c = sc.nextInt();
		while (c <= 0) {
			System.out.print("숫자를 다시입력해주십시오 => ");
			c = sc.nextInt();
		}
		Scanner sd = new Scanner(System.in);
		System.out.print("최대 더하실 값을 입력해주십시오 => ");
		int d = sd.nextInt();
		while (d < c) {
			System.out.print("최대 더하실 값을 다시 입력해주십시오 => ");
			d = sd.nextInt();
		}
		
		int e = c;
		
		int sum_c = 0;
		
		while (c <= d) {
			sum_c = sum_c + c;
			c ++;
		}
		System.out.println(e + "부터 " + d + "까지의 총 합은 " + sum_c + " 입니다.");

		
		
//		System.out.println("");
//		System.out.println("===================");
//		System.out.println("");		
//		
//
//		String id = "aa";
//		String pw = "12345";
//		
//		Scanner si = new Scanner(System.in);
//		System.out.print("아이디 입력 => ");
//		String loginId = si.next();
//		System.out.print("비밀번호 입력 => ");
//		String loginPw = si.next();
//		
//		// 기본자료형의 대등 표시 ==
//		// 참조자료형(문자) 대등 표시 == 자료.equals(비교대상)
//		
//		// 아이디가 틀렸습니다/비밀번호가 틀렸습니다./로그인 성공
//		if (loginId.equals(id)){
//			if (loginPw.equals(pw)) {
//				System.out.println("로그인 성공");
//			}else {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//		}else {
//			System.out.println("아이디가 틀렸습니다.");
//		}
//			
//		System.out.println("");
//		System.out.println("===================");
//		System.out.println("");	
//		
//		String id = "aa";
//		String pw = "12345";
//		
//		Scanner si = new Scanner(System.in);
//		System.out.print("아이디 입력 => ");
//		String loginId = si.next();
//		System.out.print("비밀번호 입력 => ");
//		String loginPw = si.next();
//		
//		// 기본자료형의 대등 표시 ==
//		// 참조자료형(문자) 대등 표시 == 자료.equals(비교대상)
//		
//		// 아이디가 틀렸습니다/비밀번호가 틀렸습니다./로그인 성공
//		if (loginId.equals(id) && loginPw.equals(pw)){
//			System.out.println("로그인 성공");
//		}else if(!loginId.equals(id)) {
//			System.out.println("아이디가 틀렸습니다.");
//		}else if(!loginPw.equals(pw)){
//			System.out.println("비밀번호가 틀렸습니다.");
//		}
//		
//		System.out.println("");
//		System.out.println("===================");
//		System.out.println("");	
//		
//		Scanner se = new Scanner(System.in);
//		System.out.print("월을 입력해주세요 => ");
//		int e = se.nextInt();
//		
//		switch(e) {
//		case 1:
//			System.out.println(e + "월은 겨울입니다.");
//			break;
//		case 2:
//			System.out.println(e + "월은 겨울입니다.");
//			break;
//		case 3:
//			System.out.println(e + "월은 봄입니다.");
//			break;
//		case 4:
//			System.out.println(e + "월은 봄입니다.");
//			break;
//		case 5:
//			System.out.println(e + "월은 봄입니다.");
//			break;
//		case 6:
//			System.out.println(e + "월은 여름입니다.");
//			break;
//		case 7:
//			System.out.println(e + "월은 여름입니다.");
//			break;
//		case 8:
//			System.out.println(e + "월은 여름입니다.");
//			break;
//		case 9:
//			System.out.println(e + "월은 가을입니다.");
//			break;
//		case 10:
//			System.out.println(e + "월은 가을입니다.");
//			break;
//		case 11:
//			System.out.println(e + "월은 가을입니다.");
//			break;
//		case 12:
//			System.out.println(e + "월은 겨울입니다.");
//			break;
//		default :
//			System.out.println("잘못 입력하셨습니다. 1년은 12월까지 있습니다.");
//		}
//		
//		
//		System.out.println("");
//		System.out.println("===================");
//		System.out.println("");	
//		
//		
//		Scanner sf = new Scanner(System.in);
//		System.out.print("월을 입력해주세요 => ");
//		int f = sf.nextInt();
//		
//		if(f == 1) {
//			System.out.println(f + "월은 January입니다.");
//		}else if (f == 2) {
//			System.out.println(f + "월은 February입니다.");
//		}else if (f == 3) {
//			System.out.println(f + "월은 March입니다.");
//		}else if (f == 4) {
//			System.out.println(f + "월은 April입니다.");
//		}else if (f == 5) {
//			System.out.println(f + "월은 May입니다.");
//		}else if (f == 6) {
//			System.out.println(f + "월은 June입니다.");
//		}else if (f == 7) {
//			System.out.println(f + "월은 July입니다.");
//		}else if (f == 8) {
//			System.out.println(f + "월은 August입니다.");
//		}else if (f == 9) {
//			System.out.println(f + "월은 September입니다.");
//		}else if (f == 10) {
//			System.out.println(f + "월은 October입니다.");
//		}else if (f == 11) {
//			System.out.println(f + "월은 November입니다.");
//		}else if (f == 12) {
//			System.out.println(f + "월은 Decemeber입니다.");
//		}else {
//			System.out.println("잘못 입력하셨습니다. 1년은 12월까지 있습니다.");
//		}
//		
		
//		Scanner sg = new Scanner(System.in);
//		
//		//
//		System.out.print("최댓값을 써주세요 => ");
//		int g = sg.nextInt();
//		System.out.print("최솟값을 써주세요 => ");
//		int i = sg.nextInt();
//		int cnt1 = 0;
//		while (i>g) {
//			System.out.print("최솟값을 다시 구해주세요");
//			i = sg.nextInt();
//		}
//		int h = i;
//		for(; i < g; i++) {
//			cnt1 ++;
//		}
//		System.out.println(h + "부터 " + g + "까지 총 " +cnt1 +"개입니다.");
//		
		
	}

}
