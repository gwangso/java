package ex11;

public class CampTypeVO extends TypeVO{
	private String cno;
	private int tno;
	
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public int getFno() {
		return tno;
	}
	public void setFno(int tno) {
		this.tno = tno;
	}
	
	
	@Override
	public String toString() {
		return "CampFacilVO [cno=" + cno + ", fno=" + tno + ", getTname()=" + getTname() + "]";
	}
	public void print_land() {
		System.out.printf("%s\t%d\t%s\n",cno,tno,getTname());
	}
	public void print_port() {
		System.out.println("시설물이름 : " + getTname());
	}
}
