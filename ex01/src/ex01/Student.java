package ex01;

public class Student {
	// 필드
	private String sno;
	private String name;
	private String address;
	private String dept = "컴정과";

	// 생성자 : 객체(Instance, Object)를 생성해준다.
	public Student() {

	}

	public Student(String sno, String name, String address) {
		this.sno = sno;
		this.name = name;
		this.address = address;
	}
	public Student(String sno, String name, String address, String dept) {
		this.sno = sno;
		this.name = name;
		this.address = address;
		this.dept = dept;
	}

	// 메소드 :
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "학생 [학번=" + sno + ", 이름=" + name + ", 주소=" + address + ", 학과=" + dept + "]";
	}

}
