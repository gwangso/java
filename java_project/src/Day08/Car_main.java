package Day08;

public class Car_main {

	public static void main(String[] args) {
		// 클레스는 틀.
		// 객체 : 클레스의 틀대로 찍어낸 것
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		// 앞이 대문자로 시작하면 대체로 클레스
		// c1, c2가 객체(변수) 혹은 참조변수라고 한다.
		// 객체는 각각 고유한 값을 갖으므로 서로 상관 없다.

		// c1에는 Car클레스의 형식이 들어가 있다
		// c1에는 name, tire, color, speed의 틀이 있다.
		// c1안에 없는 필드는 사용할 수 없다.
		// c1.english 같은 거 불가능(왜냐 Car클레스에 필드에서 지정되지 않음)
		
		c1.name = "그렌져"; //c1에 있는 name 필드에 "그렌져"를 저장
		c1.tire = "한국";
		c1.color = "검정";
		c1.speed = 5;

		c1.run(); // c1에 있는 run메소드 호출(실행)
		
		System.out.println(c1.name + "\t" + c1.tire + "\t" + c1.color + "\t" + c1.speed);

		c2.name = "제네시스";
		c2.tire = "넥센";
		c2.color = "빨강";
		c2.speed = 10;

		c2.run();
		
		System.out.println(c2.name + "\t" + c2.tire + "\t" + c2.color + "\t" + c2.speed);

		// c3객체 만들고, 쏘나타, 금호타이어, 노랑색, 속도 8 출력
		c3.name = "쏘나타";
		c3.tire = "금호";
		c3.color = "노랑";
		c3.speed = 8;
		
		c3.run(); 
		
		System.out.println(c3.name + "\t" + c3.tire + "\t" + c3.color + "\t" + c3.speed);
		
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		System.out.println(c3.getColor());
//		System.out.println(c1.run()); //에러발생. run 메서드의 리턴타입이 void(리턴없음)라 리턴 불가능
		
		c1.speedRun(9);
//		c2.speedRun("안녕"); // 불가능. speedRun은 int(정수)를 받는다.

		System.out.println(c1.name + "\t" + c1.tire + "\t" + c1.color + "\t" + c1.speed);
		
		// c1, c2, c3의 getSpeed메서드 호출 후 값 출력
		System.out.println(c1.getSpeed());
		System.out.println(c2.getSpeed());
		System.out.println(c3.getSpeed());
		
		
	}
}
