package solvingEx;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		/*
		 * ����ڷκ��� ������ �Է¹޾� ������ ���ϴ� ���α׷� ���� (Do While���)
		 * ��, 0�� �Է��ϸ� �����ų �� �ֵ��� ����
		 * 
		 */

		int a=0;
		int sum=0;
		
		do {
		
			System.out.println("���� �Է��ϼ���.\n");
		    
			a = s.nextInt();
		    
			sum +=a;
	
				 		}	
		
		   while(a!=0);
		
		System.out.printf("�Էµ� ������ ����: %d\n",sum);
		
			
	}

	
}
