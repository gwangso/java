package Day10;

public class Student {
	private String no; //학번
	private String name; //이름
	private String dept; //학과
	private int year; //학년
	
	public Student() {
		
	}
	public Student(String no, String name, String dept, int year) {
		
	}
	
	public String getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getYear() {
		return year;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void print() {
		System.out.printf("%s\t%s\t%s\t%d\n", no, name, dept, year);
	}
}
