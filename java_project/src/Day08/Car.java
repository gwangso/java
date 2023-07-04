package Day08;

public class Car {
	// 필드(인스턴스 변수) : 객체가 고유하게 가지고 있는 데이터
	String name;
	String tire;
	String color;
	int speed;
	
	// 생성자 : 객체를 생성할 때 사용하는 것
	
	// 메서드 : 객체의 기능을 표현하는 것
	// 모든 실행 문구들은 메서드 안에서만 실행할 수 있다.
	public void run() {
		speed = speed+2;
	}
	
	// 메서드 만드는 법
	// 	접근제한자 리턴타입 메서드이름(매개변수) {
	// 		실행문구
	//	}
	// 접근제한자(=접근제어자) : public
	// 리턴타입 - void : 다시 돌려줄 것이 없는 경우
	// 리턴타입 - String/int/double/char : 다시 돌려줄 것이 문자열/정수/실수/문자일 경우
	// 매게변수(=인자)
	
	public String getColor() {
		return color;
	}
	public void speedRun(int speed) { //매게변수 a를 삽입. 
		this.speed += speed; //this. => '나 자신의'
		//this.speed 나 자신의 스피드 => 필드의 스피드
	}
	
	// 리턴타입이 int인 getSpeed메서드 만드시오.
	// 실행문구는 speed리턴
	
	public int getSpeed() {
		return speed;
	}
	
	
	
}
