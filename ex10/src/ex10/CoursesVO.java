package ex10;

public class CoursesVO {
	private String ccode;
	private String cname;
	
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	@Override
	public String toString() {
		return "과목정보 [과목코드=" + ccode + ", 과목명=" + cname + "]";
	}
	public void print_land() {
		System.out.printf("%s\t%s\n",ccode,cname);
	}
	public void print_port() {
		System.out.println("이름 : " + cname);
	}
	
}
