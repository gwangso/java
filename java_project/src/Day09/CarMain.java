package Day09;

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.name = "그랜저";
		c.tire = "한국";
		c.color = "검정";
		c.speed = 1;
		
		c.run();
		System.out.printf("%s/%s/%s/%d\n",c.name,c.tire,c.color,c.speed);
		c.speedrun(45);
		
		
		String a = c.getColor();
		System.out.println(a);
		// String a = c.run(); 에러
		
		int b = c.getSpeed();
		// b = c.run(); 메서드는 값에 들어갈 수 없다.
		System.out.println(b);
		
	}

}
