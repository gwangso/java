package Day10;

import java.util.Scanner;

public class 연습장10_1 {

	private String name;
	private String id;
	private String pw;

	public 연습장10_1() {

	}

	public 연습장10_1(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw() {
		return pw;
	}

	public void print() {
		System.out.println(name + "\t" + id + "\t" + pw);
	}
	
	// 숫자만 받는 메서드
	public int numberCheck() {
		int result;
		Scanner sc =new Scanner(System.in);
		while (true) {
			if (sc.hasNextInt()) {
				result = sc.nextInt();sc.nextLine();
				break;
			} else {
				System.out.println("숫자만 입력");
				sc.nextLine();
			}
		}
		return result;
	}
	
	// 아이디 길이를 체크하는 메서드
	public String lengthCheck() {
		String result;
		Scanner sc = new Scanner(System.in);
		while (true) {
			result = sc.next();
			
			if (result.length() <= 8) {
				break;
			}else {
				System.out.print("8글자를 초과하셨습니다.\n다시입력해주세요 > ");
				sc.nextLine();
			}
		}
		return result;
	}
	
	
}
