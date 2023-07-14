package ex10;

public class StudentsVO {
	private String scode;
	private String sname;
	private String sdept;
	
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}

	@Override
	public String toString() {
		return "학생정보 [학번=" + scode + ", 이름=" + sname + ", 학과=" + sdept + "]";
	}
	public void print_land() {
		System.out.printf("%s\t%s\t%s\n",scode,sname,sdept);
	}
	public void print_port() {
		System.out.println("이름 : " + sname);
		System.out.println("학과 : " + sdept);
	}
	
	
}
