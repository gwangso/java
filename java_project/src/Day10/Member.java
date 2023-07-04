package Day10;

public class Member {
	private String email;
	private String pw;
	private String name;
	private String joinDate;
	
	//생성자
	
	public Member() {
	}
	public Member(String email, String pw, String name, String joinDate) {
		this.email = email;
		this.pw = pw;
		this.name = name;
		this.joinDate = joinDate;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getEmail() {
		return email;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void print() {
		System.out.printf("%s\t%s\t%s\t%s\n", email, pw, name, joinDate);
	}
}
