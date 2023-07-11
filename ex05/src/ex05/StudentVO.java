package ex05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentVO {
	private String sno;
	private String sname;
	private String dept;
	private Date birth;
	int grade;
	
	public StudentVO() {
		
	}
		
	public StudentVO(String sno, String sname, String dept, Date birth, int grade) {
		this.sno = sno;
		this.sname = sname;
		this.dept = dept;
		this.birth = birth;
		this.grade = grade;
	}

	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "학생 [학번=" + sno + ", 이름=" + sname + ", 학위=" + dept + ", 생년월일=" + birth + ", 학년=" + grade
				+ "]";
	}
	
	public void printLand() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String date = sdf.format(birth);
		System.out.printf("%s\t%s\t%s\t%s\t%d\n",sno,sname,dept,date,grade);
	}
	

}