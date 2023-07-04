package Day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Account {
	// 필드
	private String name;
	private String account;
	private int balance;
	private String joinDate;
	private static int num = 100;
	//static은 공유데이터. 객채들이 모두 공유해서 사용한다.

	// 생성자
	public Account() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
		joinDate = dtf.format(LocalDateTime.now());
	}

	public Account(String name, String account, int balance) {
		this();
		this.name = name;
		this.account = account;
		this.balance = balance;
	}

	// 메서드
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = (num++) + "-" + account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void print() {
		System.out.printf("%s\t%s\t%,d\t%s\n", name, account, balance, joinDate);
	}

	public boolean withdraw(int outMoney) {
		if (balance >= outMoney) {
			balance -= outMoney;
			return true;
		} else {
			return false;
		}
	}

	public void deposit(int inMoney) {
		balance += inMoney;
	}
	
	public boolean searchAccount(String account) {
		if (account.equals(this.account)) {
			return true;			
		}else {
			return false;
		}
	}
}
