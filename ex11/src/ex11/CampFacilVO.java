package ex11;

public class CampFacilVO extends FacilVO{
	private String cno;
	private int fno;
	
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	
	
	@Override
	public String toString() {
		return "CampFacilVO [cno=" + cno + ", fno=" + fno + ", getFname()=" + getFname() + "]";
	}
	public void print_land() {
		System.out.printf("%s\t%d\t%s\n",cno,fno,getFname());
	}
	public void print_port() {
		System.out.println("시설물이름 : " + getFname());
	}
}
