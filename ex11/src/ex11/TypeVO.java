package ex11;

public class TypeVO {
	private int tno;
	private String tname;
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	@Override
	public String toString() {
		return "TypeVO [tno=" + tno + ", tname=" + tname + "]";
	}
	
	public void print_land() {
		System.out.printf("%d\t%s\n",tno,tname);
	}
	public void print_port() {
		System.out.println("유형이름 : " + tname);
	}
}
