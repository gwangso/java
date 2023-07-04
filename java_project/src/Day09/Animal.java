package Day09;

public class Animal {
	String gang; // 같은 페키지 내에서 사용 가능 
	//Day08.연습장08_5, Day08.연습장08_6에 가서 확인해보자
	public String mang; // 같은 프로젝트 내에서 사용 가능
	private String name; // 이 클래스에서만 접근 가능
	private String sound; // 이 클래스에서만 접근 가능
	private int leg;
	// private는 다른 클레스에서 함부로 접근해서 변환시키지 못하게 하려 사용한다.
	// public은 같은 프로젝트 내에서는 전부 가능
	// default는 같은 페키지에서만 가능
	
	// 메서드(get/set)
	public void setName(String name) { 
		// 어떤 값을 집어넣고 끝낼 것이라 리턴 필요 X.
		// 집어넣고 싶은 값을 매게변수로 줘야함
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getSound() {
		return sound;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getLeg() {
		return leg;
	}
	public void print() {
		System.out.printf("%s\t%s\t%d개\n",this.name,sound,leg);
	}
	
	public void print1() {
		System.out.printf("이름 : %s\t울음 : %s\t다리 : %d개\n",this.name,sound,leg);
	}
	
}
