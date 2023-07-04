package ex02;

import java.util.*;

public class Sale {

	public static void run() {
		Scanner sc = new Scanner(System.in);
		List<SaleVO> list = new ArrayList<SaleVO>();
		SaleVO sale = new SaleVO(100, "모란", 1200, 5);
		//임시 번호
		list.add(sale);
		sale = new SaleVO(101, "장미", 1500, 60);
		list.add(sale);
		sale = new SaleVO(102, "달래", 1100, 20);
		list.add(sale);

		int cnt = 103;
		boolean roof = true;
		
		allroof: while (roof) {
			System.out.println("===========재고관리===========");
			System.out.println("1.상품입력 | 2.상품조회 | 3.상품목록 | 4.상품수량수정 | 5.상품삭제 | 0.종료");
			System.out.print("메뉴선택 > ");
			String menu1 = sc.nextLine();
			System.out.println("============================");
			boolean find = false;
			switch (menu1) {
			case "0":
				break allroof;
			case "1":
				sale =new SaleVO();
				sale.setCode(String.valueOf(cnt));
				System.out.println("상품 코드 > " + cnt++);
				System.out.print("이름 > ");
				sale.setName(sc.nextLine());
				System.out.print("상품 단가 > ");
				sale.setPrice(sc.nextInt());
				System.out.print("남은 상품 개수 > ");
				sale.setQnt(sc.nextInt());
				sc.nextLine();
				sale.setSum();
				list.add(sale);
				System.out.println("상품등록을 완료했습니다.");
				break;
			case "2":
				System.out.print("상품코드 입력 > ");
				String cd = sc.nextLine();
				sale = search(list, cd);
				if (sale.getCode()==null) {
					System.out.println("상품없음");
				}else {
					sale.print_port();
				}
				break;
			case "3":
				System.out.println("코드넘버\t이름\t단가\t판매량\t총판매금액");
				System.out.println("=========================================================");
				for(SaleVO l : list) {
					l.print_land();
				}
				System.out.println(list.size() + "개의 상품이 등록되었습니다.");
				break;
			case "4":
				System.out.print("상품코드 입력 > ");
				cd = sc.nextLine();
				sale = search(list, cd);
				if(sale.getCode() != null) {
					System.out.print("수정할 수량 > ");
					int cQnt = sc.nextInt();sc.nextLine();
					sale.setQnt(cQnt);
					sale.print_port();
				}else {
					System.out.println("상품없음");
				}
				break;
			case "5":
				System.out.print("상품코드 입력 > ");
				cd = sc.nextLine();
				sale = search(list, cd);
				if(sale.getCode() != null) {
					System.out.println("정말로 삭제하시겠습니까?");
					String ok = sc.nextLine();
					
					list.remove(sale);
					System.out.println("상품제거 완료");
				}else {
					System.out.println("상품없음");
				}
				break;
			default:
				System.out.println("다시 선택해주세요.");
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
	
	public static SaleVO search(List<SaleVO> list, String code) {
		SaleVO vo = new SaleVO();
		for (SaleVO s : list) {
			if (s.getCode().equals(code)) {
				vo = s;
				break;
			}
		}
		return vo;
	}

}