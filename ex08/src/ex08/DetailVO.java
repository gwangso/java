package ex08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailVO {
	private int dno;
	private int ano;
	private int amount;
	private String dtype;
	private Date ddate;
	
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDtype() {
		return dtype;
	}
	public void setDtype(String dtype) {
		this.dtype = dtype;
	}
	public Date getDdate() {
		return ddate;
	}
	public void setDdate(Date ddate) {
		this.ddate = ddate;
	}
	
	@Override
	public String toString() {
		return "거래내역 [거래번호=" + dno + ", 계좌번호=" + ano + ", 금액=" + amount + ", 거래종류=" + dtype + ", 거래일=" + ddate
				+ "]";
	}
	
	public void print_land() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.printf("%d\t%d\t%,d원\t\t%s\t%s\n",dno,ano,amount,dtype,sdf.format(ddate));
	}
}
