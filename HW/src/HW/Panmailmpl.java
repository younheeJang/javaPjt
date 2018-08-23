package HW;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import static java.lang.System.out;

public class Panmailmpl implements Panmai {
	HashMap<String, ProductVO> hmR = new HashMap<String, ProductVO>();
	HashMap<String, SaleVO> hmS = new HashMap<String, SaleVO>();
	Scanner sc = new Scanner(System.in);
	Iterator<String> keyIter = hmR.keySet().iterator();
	Iterator<SaleVO> valIter = hmS.values().iterator();
	Iterator<ProductVO> proIter = hmR.values().iterator();
	
	@Override
	public void insertQuantity() {

				
		out.println("수량등록......");
		
		out.println("코드?");
		String code = sc.nextLine();
		
		out.println("수량?");
		int quantity = sc.nextInt();
		out.println();

		hmR.get(code).setQuantity(quantity);
		out.println("수량등록 완료");

	}

	@Override
	public void insertProduct() {

		out.println("상품등록......");
		
		out.println("코드?");
		String code = sc.nextLine();
		out.println("상품명?");
		String pname = sc.nextLine();
		out.println("단가?");
		int price = sc.nextInt();
		out.println();
		hmR.put(code, new ProductVO(pname, price));

		out.println("상품등록 완료");

	}

	@Override
	public void listProduct() {

		while(keyIter.hasNext()==true) {

			String code =keyIter.next();
			ProductVO pro =  proIter.next();
			
			String pname = pro.getPname();
			int price = pro.getPrice();
			int quantity = pro.getQuantity();

			out.println("코드입력");
			code = sc.nextLine();
			
			out.println("상품 전체 리스트\n"
					+ "코드\t\t\t\t상품명\t\t\t\t단가\t\t\t\t수량\n"
					+ "----------------------------------------------------\n"); 
			out.println(code + pname + price + quantity );
		
		}		

		
		
		
	}

	@Override
	public void searchProduct() {

		String code;
		out.println("코드입력");
		code = sc.nextLine();

		out.println("상품명:" + hmR.get(code).getPname());

	}

	// =======================================================================

	
	
	@Override
	public void insertSale() {
		
	
		out.println("상품 수량 등록......");
		out.println("상품코드?");
		String code = sc.nextLine();
		out.println("고객명?");
		String sname = sc.nextLine();
		out.println("등록일?");
		String created = sc.nextLine();
		out.println("판매수량?");
		int quantity = sc.nextInt();
		out.println();
		out.println("상품 판매 입력 완료");
		
		
	}

	@Override
	public void searchSale() {
	
		out.println("상품코드검색......");
		
		String code = keyIter.next();
		SaleVO sale = valIter.next();
		int quantity = sale.getQuantity();
		
		ProductVO pro = proIter.next();
		String pname = pro.getPname();
		int price = pro.getPrice();
		
		out.println("코드?");
		code = sc.nextLine();
		out.println("코드\t\t\t\t상품명\t\t\t\t단가\t\t\t\t수량\n"); 
		out.println(code + pname + price + quantity );
		
		
		
		
	}

	@Override
	public void listSale() {

		String code = keyIter.next();
		SaleVO sale = valIter.next();
		int quantity = sale.getQuantity();
		String created = sale.getCreated();
		String sname = sale.getSname();
		
		
		ProductVO pro = proIter.next();
		String pname = pro.getPname();
		int price = pro.getPrice();
		
		out.println("코드?");
		code = sc.nextLine();
		out.println("코드\t\t\t\t금액\t\t\t\t상품명\t\t\t\t고객명\t\t\t\t판매일자\t\t\t\t단가\t\t\t\t수량\n"); 
		out.println(code + price*quantity +pname +sname +created + price + quantity );
		
		
	}

}
