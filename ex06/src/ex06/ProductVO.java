package ex06;

public class ProductVO {
	private int pcode;
	private String pname;
	private int pprice;
	
	public ProductVO() {
		
	}

	public ProductVO(int pcode, String pname, int pprice) {
		this.pcode = pcode;
		this.pname = pname;
		this.pprice = pprice;
	}

	public int getPcode() {
		return pcode;
	}

	public void setPcode(int pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	@Override
	public String toString() {
		return "상품 [상품코드=" + pcode + ", 상품이름=" + pname + ", 상품가격=" + pprice + "]";
	}
	
	public void print_land() {
		System.out.printf("%d\t%s\t%d\n",pcode,pname,pprice);
	}
	public void print_port() {
		System.out.println("상품이름 : " + pname);
		System.out.printf("상품가격 : %,d\n", pprice);
	}
}
