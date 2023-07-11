package ex02;

public class SaleVO {
	private String code;
	private String name;
	private int price;
	private int qnt;
	private int sum;
	
	public SaleVO() {
		
	}

	public SaleVO(int code, String name, int price, int qnt) {
		this.code = String.valueOf(code);
		this.name = name;
		this.price = price;
		this.qnt = qnt;
		sum = qnt*price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = String.valueOf(code);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}

	public int getSum() {
		return sum;
	}

	public void setSum() {
		sum = qnt*price;
	}
	
	@Override
	public String toString() {
		return "SaleVO [code=" + code + ", name=" + name + ", price=" + price + ", qnt=" + qnt + ", sum=" + sum + "]";
	}

	public void print_land() {
		System.out.printf("%s\t%s\t%,d\t%d\t%,d\n",code,name,price,qnt,sum);
	}
	public void print_port() {
		System.out.println("상품 코드 : " +code);
		System.out.println("상품 이름 : " +name);
		System.out.println("상품 가격 : " +price);
		System.out.println("상품 수량 : " +qnt);
		System.out.println("상품 총액 : " +sum);
	}
	
}
