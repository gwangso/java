package ex09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageVO extends UserVO {
	private int mid;
	private String sender;
	private String receiver;
	private Date sdate;
	private String message;
	private int sdel;
	private int rdel;

	public MessageVO() {
		
	}
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getSdel() {
		return sdel;
	}

	public void setSdel(int sdel) {
		this.sdel = sdel;
	}

	public int getRdel() {
		return rdel;
	}

	public void setRdel(int rdel) {
		this.rdel = rdel;
	}
	
	@Override
	public String toString() {
		return "MessageVO [mid=" + mid + ", sender=" + sender + ", receiver=" + receiver + ", sdate=" + sdate
				+ ", message=" + message + ", getUname()=" + getUname() + "]";
	}

	public void print() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.printf("%d\t%s\t%s\t%s\t%s\t%s",mid,sender,receiver,getUname(),sdf.format(sdate),message);
	}
}
