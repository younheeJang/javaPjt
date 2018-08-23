package HW;

import static java.lang.System.out;
/*import java.util.HashMap;*/
import java.util.Scanner;

public class PanmaiMain {



	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
	/*	HashMap<String, ProductVO> hmR = new HashMap<String, ProductVO>();*/
		Panmailmpl lmpl = new Panmailmpl();
	
		while (true) {
			mainDisplay();
			
			int num = sc.nextInt();

			switch (num) {

			case 1:
				int condition1;
				
				do {
					proRegistration();
				
					condition1 = sc.nextInt();

					switch (condition1) {

					case 1:
						lmpl.insertProduct();
						break;
					case 2:
						lmpl.insertQuantity();
						break;
					case 3:
						lmpl.listProduct();
						break;
					case 4:
						lmpl.searchProduct();
						break;
					case 5:
						
						break;
               
					}

					
				} while (condition1 != 5);
				break;
			
			case 2:
				int condition2;
				do {
					proSale();

					condition2 = sc.nextInt();

					switch (condition2) {

					case 1:
					lmpl.insertSale();
						break;
					case 2:
						lmpl.listSale();
						break;
					case 3:
						lmpl.searchSale();
						break;
					case 4:
						
						break;
					}
					

				} while (condition2 != 4);
				break;
		
			case 3:

				out.println("프로그램 종료");

				return;

			}// swithch문의 끝

		} // while문의 끝.

	}

	public static void mainDisplay() {

		out.println("[메인메뉴]\n" + "--------------------------------\n" 
		+ "1. 상품등록\n" + "2. 상품판매\n" + "3. 종료\n"
				+ "--------------------------------\n");
		out.println("선택");

	}

	public static void proRegistration() {

		out.println("[상품등록화면]\n" + "--------------------------------\n" 
		+ "1. 상품등록\n" + "2. 수량등록\n" + "3. 상품리스트\n"
				+ "4. 상품코드검색\n" + "5. 복귀\n" + "--------------------------------\n");
		out.println("선택");
	}

	public static void proSale() {

		out.println("[상품판매화면]\n" + "--------------------------------\n"
		+ "1. 상품판매\n" + "2. 판매현황리스트\n" + "3. 판매현황검색\n"
				+ "4. 복귀\n" + "--------------------------------\n");
		out.println("선택");

	}

}
