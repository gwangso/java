package Day10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Membership {
	private String name;
	private String id;
	private String pw;
	private String account;
	private int balance;
	private String date;

	public Membership() {
		
	}
	public Membership(String name, String id, String pw, String account, int balance, String date) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.account = account;
		this.balance = balance;
		this.date = date;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id =id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setDate(String date) {
		this.date = date;
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
	public String getAccount() {
		return account;
	}
	public int getBalance() {
		return balance;
	}
	public String getDate() {
		return date;
	}
	public void deposit(int money) {
		this.balance += money;
	}
	public void outgo(int money) {
		this.balance -= money;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%s\t%s\t%d\t\t%s\n",name,id,pw,account,balance,date);
	}
	
	public void nJoin() {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd. hh:mm:ss");
		System.out.print("이름을 입력해주세요 > ");
		this.name = sc.next();
		System.out.print("사용하실 아이디를 입력해주세요 > ");
		this.id = sc.next();
		System.out.print("사용하실 비밀번호를 입력해주세요 > ");
		this.pw = sc.next();
		System.out.print("사용하실 계좌번호를 입력해주세요 > ");
		this.account = sc.next();
		System.out.print("초기입금액을 입력해주세요 > ");
		this.balance = sc.nextInt();
		this.date = dtf.format(LocalDateTime.now());
	}	
}