package ex06;

import java.util.*;

public class SaleVO extends ProductVO{
	private int scode;
	private int pcdoe;
	private int qnt;
	private int sprice;
	private Date sdate;
	
	public int getScode() {
		return scode;
	}
	public void setScode(int scode) {
		this.scode = scode;
	}
	public int getPcdoe() {
		return pcdoe;
	}
	public void setPcdoe(int pcdoe) {
		this.pcdoe = pcdoe;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	public int getSprice() {
		return sprice;
	}
	public void setSprice(int sprice) {
		this.sprice = sprice;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	@Override
	public String toString() {
		return "판매정보 [판매코드=" + scode + ", 상품코드=" + pcdoe + ", 판매수량=" + qnt + ", 판매가격=" + sprice + ", 판매일="
				+ sdate + "]";
	}
}
