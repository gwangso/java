package Day09;

public class Car {
	// 필드
	String name;
	String tire;
	String color = "검정"; // default값이 검정
	//but private가 아니라 언제든 변할 수 있다.
	int speed;
	// 변수처럼 생겼지만 클레스에 있는건 변수가 아니라 필드라고 한다.
	// 생성자
	
	// 메서드
	/* 	접근제한자 리턴타입 메소드명(매게변수 선언){ 
			실행문구
		}
	*/
	
	public void run() {
		speed += 2;
	}
	// void : 리턴 없다.
	
	public void speedrun(int speed) { // 매게변수
		this.speed += speed; //실행문구
		//this. => 클래스 자신의 
	}
	
	public String getColor() {
		return this.color;
	}
	// void가 아닐 경우 return이 필요. 리턴이 없으면 에러발생
	// String이니까 문자열이 리턴값으로 들어가야 한다.
	
	public int getSpeed() {
		return speed;
	}
}
