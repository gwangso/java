package ex09;

import java.text.DecimalFormat;

public class UserVO {
	//필드
	private String id;
	private String uname;
	private int point;
	private String phone;
	//메서드
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "사용자 [id=" + id + "\t이름=" + uname + "\t포인트=" + point + "\t\t연락처=" + phone + "]";
	}
	public void print_land() {
		System.out.printf("%-15s\t%s\t\t%d\t%s\n",id,uname,point,phone);
	}
	
	public void print_port() {
		DecimalFormat df = new DecimalFormat("#,###점");
		System.out.println("사용자 이름 : " + uname);
		System.out.println("사용자 전화 : " + phone);
		System.out.println("사용자 포인트 : " + df.format(point));
	}
	
}
