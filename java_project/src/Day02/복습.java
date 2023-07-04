package Day02;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//복습하는 내용입니다. if문, 연산자 등등 사용합니다.
//		//숫자를 입력받고, 양수, 음수, 0을 출력하시오
//		
//		System.out.println("입력해주신 숫자의 양수, 음수를 구분합니다.");
//		System.out.println("0은 0으로 출력됩니다.");
//		Scanner sa = new Scanner(System.in);
//		System.out.print("숫자 입력해주세요 => ");
//		int a = sa.nextInt();
//		
//		if (a > 0) {
//			System.out.println("입력하신 수는 양수입니다.");
//		}else if (a < 0) {
//			System.out.println("입력하신 수는 음수입니다.");
//		}else if (a == 0) {
//			System.out.println("입력하신 수는 0 입니다.");
//		}
//		
//		System.out.println("");
//		System.out.println("===================");
//		System.out.println("");		
//		
//		// 점수에 따라 학점을 나눕니다.
//		// score 90 이상 A
//		// 80이상 B
//		// 70이상 C
//		// 60이상 D
//		// 60미만 F
//		System.out.println("절대평가에 따라 당신의 학점을 나타냅니다.");
//		Scanner sb = new Scanner(System.in);
//		System.out.print("점수를 입력해주세요 => ");
//		int b = sb.nextInt();
//		
//
//		if (b >= 90) {
//			System.out.println("A등급입니다.");
//		}else if (b >= 80) {
//			System.out.println("B등급입니다.");
//		}else if (b >= 70) {
//			System.out.println("C등급입니다.");
//		}else if (b >= 60) {
//			System.out.println("D등급입니다.");
//		}else if (b >= 0  && b < 60) {
//			System.out.println("F등급입니다.");
//		}else {
//			System.out.println("점수를 잘못입력하셨습니다.");
//		}
//		
//		System.out.println("");
//		System.out.println("===================");
//		System.out.println("");		
//		
//		//2와 7의 배수를 찾습니다.
//		System.out.println("2와 7의 배수를 찾습니다.");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요 => ");
//		int c = sc.nextInt();
//		
//		if (c%2 == 0 && c%7 ==0) {
//			System.out.println("2와 7의 배수입니다.");
//		}else if (c%2 == 0) {
//			System.out.println("2의 배수입니다.");
//		}else if (c%7 ==0) {
//			System.out.println("7의 배수입니다.");
//		}else {
//			System.out.println("2의 배수도 7의 배수도 아닙니다.");
//		}
//		
//		System.out.println("");
//		System.out.println("===================");
//		System.out.println("");	
//		
//		System.out.println("입력하신 수의 홀수 짝수를 구분해줍니다.");
//		Scanner sd = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요 => ");
//		int d = sd.nextInt();
//		
//		if(d == 0) {
//			System.out.println("0입니다.");
//		}else if (d%2 == 0) {
//			System.out.println("짝수입니다.");
//		}else {
//			System.out.println("홀수입니다.");
//		}
//		
//		System.out.println("");
//		System.out.println("===================");
//		System.out.println("");	
//		
//		System.out.println("3과 5의 배수를 찾습니다.");
//		Scanner se = new Scanner(System.in);
//		System.out.print("숫자를 입력해주십시오 => ");
//		int e = se.nextInt();
//		
//		
//		if (e%3 == 0 && e%5 == 0) {
//			System.out.println("3과 5의 배수입니다.");
//		}else if (e%3 == 0) {
//			System.out.println("3의 배수입니다.");
//		}else if (e%5 == 0) {
//			System.out.println("5의 배수입니다.");
//		}else {
//			System.out.println("3의 배수도 5의 배수도 아닙니다.");
//		}
//		
//		//계산기 프로그램
//		Scanner sf = new Scanner(System.in);
//		System.out.print("첫번째 숫자를 입력해 주세요 => ");
//		int numF = sf.nextInt();
//		Scanner sg = new Scanner(System.in);
//		System.out.print("두번째 숫자를 입력해 주세요 => ");
//		int numG = sg.nextInt();
//		
//		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
//		System.out.print("메뉴를 선택해 주세요 => ");
//		Scanner sh = new Scanner(System.in);
//		int h = sh.nextInt();
//		
//		if (h == 1) {
//			System.out.println("첫번째 숫자와 두번째 숫자를 더한 값입니다.");
//			System.out.println(numF + " + " + numG + " = " + (numF + numG));
//		}else if (h == 2) {
//			System.out.println("첫번째 숫자와 두번째 숫자를 뺀 값입니다.");
//			System.out.println(numF + " - " + numG + " = " + (numF - numG));
//		}else if (h == 3) {
//			System.out.println("첫번째 숫자와 두번째 숫자를 곱한 값입니다.");
//			System.out.println(numF + " * " + numG + " = " + (numF * numG));
//		}else if (h == 4) {
//			System.out.println("첫번째 숫자에서 두번째 숫자를 나눈 몫입니다.");
//			System.out.println(numF + " / " + numG + " = " + (numF / (double)numG));
//		}else if (h== 5) {
//			System.out.println("첫번째 숫자에서 두번째 숫자를 나눈 나머지입니다.");
//			System.out.println(numF + " % " + numG + " = " + (numF % numG));
//		}else {
//			System.out.println("메뉴를 잘못선택하셨습니다.");
//		}
//		
		//로그인 프로그램
		String id = "aa";
		String pw = "12345";
		
		Scanner si = new Scanner(System.in);
		System.out.print("아이디 입력 => ");
		String loginId = si.next();
		System.out.print("비밀번호 입력 => ");
		String loginPw = si.next();
		
		// 기본자료형의 대등 표시 ==
		// 참조자료형(문자) 대등 표시 == 자료.equals(비교대상)
		
		// 아이디가 틀렸습니다/비밀번호가 틀렸습니다./로그인 성공
		if (loginId.equals(id) && loginPw.equals(pw)){
			System.out.println("로그인 성공");
		}else if(loginId.equals(id) && !loginPw.equals(pw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}

}
