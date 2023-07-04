package Day10;

public class Animal {
	private String name;
	private String sound;
	private int leg;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSound(String sound) {
		this.sound = sound;
		
	}public void setleg(int leg) {
		this.leg = leg;
	}
	public String getName() {
		return name;
	}
	public String getSound() {
		return sound;
	}
	public int getLeg() {
		return leg;
	}
	public void print() {
		System.out.printf("%s\t%s\t%d\n",name,sound,leg);
	}
}
