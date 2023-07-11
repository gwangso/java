package ex03;

import java.util.Scanner;

public class StudentVO {
	private String sno; 
	private String name; 
	private String address;
	private String phone;
	
	public StudentVO() {
		
	}
	//생성자 Overloading
	public StudentVO(int sno, String name, String address, String phone) {
		this.sno = "2023" + String.format("%04d", sno);
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public String getSno() {
		return sno;
	}
	public void setSno(int cnt) {
		this.sno = "2023" +  String.format("%04d", cnt);
	}
	public void comeSno(String sno) {
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void print_land() {
		System.out.printf("%s\t%s\t%s\t%s\n",sno,name,address,phone);
	}
	public void print_port() {
		System.out.println("학번 : " + sno);
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("연락처 : " + phone);
	}
	@Override
	public String toString() {
		return "학생 [학번=" + sno + ", 이름=" + name + ", 주소=" + address + ", 연락처=" + phone + "]";
	}
	
	public void nJoin(int cnt) {
		Scanner sc = new Scanner(System.in);
		sno = "2023" + String.format("%04d", cnt);
		System.out.println("학번 > " + sno);
		System.out.print("이름 > ");
		name = sc.nextLine();
		System.out.print("주소 > ");
		address = sc.nextLine();
		System.out.print("연락처 > ");
		phone = sc.nextLine();
	}
	
}
