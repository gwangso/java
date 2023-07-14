package ex11;

public class CampVO {
	private String cno;
	private String cname;
	private String cjuso;
	private String ctel;
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCjuso() {
		return cjuso;
	}
	public void setCjuso(String cjuso) {
		this.cjuso = cjuso;
	}
	public String getCtel() {
		return ctel;
	}
	public void setCtel(String ctel) {
		this.ctel = ctel;
	}
	
	@Override
	public String toString() {
		return "CampVO [cno=" + cno + ", cname=" + cname + ", cjuso=" + cjuso + ", ctel=" + ctel + "]";
	}
	
	public void print_land() {
		System.out.printf("%s\t%-20"
				+ "s\t%s\t%s\n",cno,cname,cjuso,ctel);
	}
	public void print_port() {
		System.out.println("캠핑장 이름 : " + cname);
		System.out.println("캠핑장 주소 : " + cjuso);
		System.out.println("캠핑장 전화번호 : " + ctel);
	}
}