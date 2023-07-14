package ex11;

public class FacilVO {
	private int fno;
	private String fname;
	
	public int getFno() {
		return fno;
	}
	public void setFno(int fno) {
		this.fno = fno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	@Override
	public String toString() {
		return "FacilVO [fno=" + fno + ", fname=" + fname + "]";
	}
	public void print_land() {
		System.out.printf("%d\t%s\n",fno,fname);
	}
	public void print_port() {
		System.out.println("시설이름 : " + fname);
	}
}
