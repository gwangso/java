package Day09;

public class Fruit {
	// 필드(인스턴스 변수)
	String name;
	String color;
	boolean isSeed;

	// 생성자 - 객체를 생성할 때 사용하는 것
	// 기본생성자
	public Fruit() {
	
	}
	// 생성자를 생략하면 자동으로 기본생성자가 설정된다.
	// 기본생성자는 다른 생성자가 하나라도 있으면 자동으로 생성되지 않는다.
	// 특징	1. 클래스 이름과 무조건 동일
	//		2. 리턴타입이 없다.
	// 		3. 생성자는 이름이 동일해도 여러개가 가능하다
	// => 오버로딩 : 매개변수를 다르게 해서 동일한 이름을 가질 수 있게 하는것.
	// 생성자는 객체에 값을 세팅하려고 사용할 때 특히 좋다.
	public Fruit(String name) {
		this.name = name;

	}
	
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public Fruit(String name, String color, boolean isSeed) {
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}
	
	// 메서드
	public void print() {
		System.out.printf("%s\t%s\t%b\n",name,color,isSeed);
	}

}
