package ex08;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class AccountVO {
	private int ano;
	private String aname;
	private int balance;
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "계좌 [번호=" + ano + ", 예금주=" + aname + ", 잔액=" + balance + "]";
	}
	
	public void print_port() {
		DecimalFormat df = new DecimalFormat("#,###원");
		System.out.println("계좌주명 > "+ aname);
		System.out.println("잔액 > " + df.format(balance));
	}
	public void print_land() {
		System.out.printf("%d\t%s\t%,d원\n",ano,aname,balance);
	}
}
