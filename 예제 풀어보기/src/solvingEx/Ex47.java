package solvingEx;

import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {
    
		boolean boo = true;
		int balance =0;
		int button = 0;
		
		Scanner sc = new Scanner(System.in);
		while(boo) {
			
			System.out.println("--------------------------------------------");
			System.out.println("1. ����|2. ���|3. �ܰ�|4. ����");
			System.out.println("--------------------------------------------");
			System.out.print("����>");
			
			
			switch(button) {
			
			case 1: 
				System.out.print("���ݾ�:");
				balance += sc.nextInt();
				System.out.println(balance);
				  break;
			case 2: 
				System.out.print("��ݾ�:");
				balance -= sc.nextInt();
				System.out.println(balance);
				  break;
			case 3: 
				System.out.print("�ܰ�:");
				balance = sc.nextInt();
				System.out.println(balance);
				  break;
			case 4: 
				boo=false;
				System.out.print("����:");
				  break;
				
			}
		System.out.println();
		}
		
		System.out.println("���α׷� ����");
	}

}
