package Day10;

public class Fruit {
	String name;
	String color;
	boolean isSeed;
	
	public Fruit() {
		System.out.print("<첫번째 생성자>\t");
	}
	
	public Fruit(String name) {
		System.out.print("<두번째 생성자>\t");
		this.name = name;
	}
	
	public Fruit(String name, String color) {
		System.out.print("<세번째 생성자>\t");
		this.name = name;
		this.color = color;
	}
	
	public Fruit(String name, String color, boolean isSeed) {
		System.out.print("<네번째 생성자>\t");
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}
	public void print() {
		System.out.printf("%s\t%s\t%b\n",name,color,isSeed);
	}
	
	
}
