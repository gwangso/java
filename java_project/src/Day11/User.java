package Day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
	private String name;
	private String id;
	private String pw;
	private String joinDate;
	
	public User() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		this.joinDate = dtf.format(LocalDateTime.now());
	}
	public User(String name, String id, String pw) {
		this();
		this.name = name;
		this.id = id;
		this.pw = pw;
		 // 여기에도 꼭!!! 필드에 값 대입시켜줘야 한다.
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name; 
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%s\n",name, id, pw,joinDate);
	}
	
}
