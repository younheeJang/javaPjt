/*package bank;

import java.util.Scanner;

public class Banking3 {

	public static void main(String[] args) {
		
		Account2 ac = new Account2("ȫ�浿");
		
				Scanner sc = new Scanner(System.in);
		String str ;
	
	
		System.out.println("�޴��� �����ϼ���");
		
		do {
			System.out.println("------------------------------");
			System.out.println("1. �Ա� 2.���  3.�ܰ�  4.����");
			System.out.println("========================");
	        System.out.println("�޴��� �����ϼ���");	
			str = sc.nextLine();
			
			if( str!=null) {
			int switchInt = Integer.parseInt(str);
			}else {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.");
				
			}
			
			
			switch(switchInt)
			case 1:
				System.out.println("�Ա� �ݾ�");
				String strdeposit = sc.nextLine();
				int depositInt = Integer.parseInt(strdeposit);
				ac.deposit(depositInt);
				break;
			case 2:
			  System.out.println("��� �ݾ�");
				break;
			case 3:
				
				
				break;
			case 4: 
				break;
		}while()

	}

}
*/