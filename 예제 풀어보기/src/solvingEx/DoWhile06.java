package solvingEx;

import java.util.Scanner;

public class DoWhile06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean a = true;
		
		
		
		
		do {
			
			System.out.print("1: ¥��\t"+"2: «��\t"+"3.: �쵿\t"+"4: ������");
			System.out.println();
			System.out.print("�޴��� �����ϼ���. : ");
			System.out.println();
			int v = s.nextInt();
			
			switch(v) {
			
			case 1 :
				System.out.println("¥���� ����");
				break;
			case 2 :
				System.out.println("«���� ����");
				break;
			case 3 :
				System.out.println("�쵿�� ����");
				break;
			case 4 :
				System.out.println("�������� ����");
				break;
			}
		
		
			
			
		}
		while(a);
		
		
		
	}

}
