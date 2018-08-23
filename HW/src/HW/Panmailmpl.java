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

				
		out.println("�������......");
		
		out.println("�ڵ�?");
		String code = sc.nextLine();
		
		out.println("����?");
		int quantity = sc.nextInt();
		out.println();

		hmR.get(code).setQuantity(quantity);
		out.println("������� �Ϸ�");

	}

	@Override
	public void insertProduct() {

		out.println("��ǰ���......");
		
		out.println("�ڵ�?");
		String code = sc.nextLine();
		out.println("��ǰ��?");
		String pname = sc.nextLine();
		out.println("�ܰ�?");
		int price = sc.nextInt();
		out.println();
		hmR.put(code, new ProductVO(pname, price));

		out.println("��ǰ��� �Ϸ�");

	}

	@Override
	public void listProduct() {

		while(keyIter.hasNext()==true) {

			String code =keyIter.next();
			ProductVO pro =  proIter.next();
			
			String pname = pro.getPname();
			int price = pro.getPrice();
			int quantity = pro.getQuantity();

			out.println("�ڵ��Է�");
			code = sc.nextLine();
			
			out.println("��ǰ ��ü ����Ʈ\n"
					+ "�ڵ�\t\t\t\t��ǰ��\t\t\t\t�ܰ�\t\t\t\t����\n"
					+ "----------------------------------------------------\n"); 
			out.println(code + pname + price + quantity );
		
		}		

		
		
		
	}

	@Override
	public void searchProduct() {

		String code;
		out.println("�ڵ��Է�");
		code = sc.nextLine();

		out.println("��ǰ��:" + hmR.get(code).getPname());

	}

	// =======================================================================

	
	
	@Override
	public void insertSale() {
		
	
		out.println("��ǰ ���� ���......");
		out.println("��ǰ�ڵ�?");
		String code = sc.nextLine();
		out.println("����?");
		String sname = sc.nextLine();
		out.println("�����?");
		String created = sc.nextLine();
		out.println("�Ǹż���?");
		int quantity = sc.nextInt();
		out.println();
		out.println("��ǰ �Ǹ� �Է� �Ϸ�");
		
		
	}

	@Override
	public void searchSale() {
	
		out.println("��ǰ�ڵ�˻�......");
		
		String code = keyIter.next();
		SaleVO sale = valIter.next();
		int quantity = sale.getQuantity();
		
		ProductVO pro = proIter.next();
		String pname = pro.getPname();
		int price = pro.getPrice();
		
		out.println("�ڵ�?");
		code = sc.nextLine();
		out.println("�ڵ�\t\t\t\t��ǰ��\t\t\t\t�ܰ�\t\t\t\t����\n"); 
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
		
		out.println("�ڵ�?");
		code = sc.nextLine();
		out.println("�ڵ�\t\t\t\t�ݾ�\t\t\t\t��ǰ��\t\t\t\t����\t\t\t\t�Ǹ�����\t\t\t\t�ܰ�\t\t\t\t����\n"); 
		out.println(code + price*quantity +pname +sname +created + price + quantity );
		
		
	}

}
