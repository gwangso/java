package ex10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EnrolsVO extends CoursesVO {
	private String scode;
	private String sname;
	private String ccode;
	private String cname;
	private int grade;
	private Date edate;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public Date getEdate() {
		return edate;
	}
	public void setEdate(Date edate) {
		this.edate = edate;
	}
	
	@Override
	public String toString() {
		return "수강신청 [학번=" + scode + ", 과목코드=" + ccode + ", 점수=" + grade + ", 신청일=" + edate + "]";
	}
	public void print_land() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.printf("%s\t%s\t%s\t%s\t%d\t%s\n",scode,sname,ccode,cname,grade,sdf.format(edate));
	}
	public void print_port() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("이름 : " + sname + "(" + scode +")");
		System.out.println("과목명 : " + cname+ "(" + ccode +")");
		System.out.println("성적 : " + grade);
		System.out.println("수강신청일 : " + sdf.format(edate));
	}
}