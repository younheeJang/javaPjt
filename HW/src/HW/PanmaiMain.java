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

				out.println("���α׷� ����");

				return;

			}// swithch���� ��

		} // while���� ��.

	}

	public static void mainDisplay() {

		out.println("[���θ޴�]\n" + "--------------------------------\n" 
		+ "1. ��ǰ���\n" + "2. ��ǰ�Ǹ�\n" + "3. ����\n"
				+ "--------------------------------\n");
		out.println("����");

	}

	public static void proRegistration() {

		out.println("[��ǰ���ȭ��]\n" + "--------------------------------\n" 
		+ "1. ��ǰ���\n" + "2. �������\n" + "3. ��ǰ����Ʈ\n"
				+ "4. ��ǰ�ڵ�˻�\n" + "5. ����\n" + "--------------------------------\n");
		out.println("����");
	}

	public static void proSale() {

		out.println("[��ǰ�Ǹ�ȭ��]\n" + "--------------------------------\n"
		+ "1. ��ǰ�Ǹ�\n" + "2. �Ǹ���Ȳ����Ʈ\n" + "3. �Ǹ���Ȳ�˻�\n"
				+ "4. ����\n" + "--------------------------------\n");
		out.println("����");

	}

}
