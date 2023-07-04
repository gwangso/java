package Day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Member {
	private Long id; //long과 같은 기능인데, 기본 세팅 시 null이 세팅된다.
	private String email;
	private String pw;
	private String name;
	private String joinDate;
	
//	String a = "";
//	String b = null;
	// 이 두개는 엄밀히 다른거
	// a는 참조하고 있는데 값이 없는것.
	// b는 참조자체가 아직 없는 것.
	
//	int a = 0;
//	int a;
	// 이 두개는 같은것
// 	private Integer num; 으로 세팅 => 기본값 null, int와 같은 역할
//	private int num; => 기본값 0
// 	private Boolean fine; 로 세팅 => 기본값 null, boolean과 같은 역할
//	private boolean fine; => 기본값 false
	
	public Member() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		joinDate = dtf.format(LocalDateTime.now());
	}
	public Member(Long id, String email) {
		this();
		this.id = id;
		this.email = email;
	}
	public Member(Long id, String email, String pw, String name) {
		this(id, email); // this();는 생성자를 받는것
		this.pw = pw;
		this.name = name;
	}
	public Long getId() {
//		this(); //this(); 생성자는 메서드에서 사용할 수 없다.
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw =pw;
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name = name;
	}
	public void print() {
		System.out.printf("%d\t%s\t%s\t%s\t%s\n",id,email,pw,name,joinDate);
	}
}
