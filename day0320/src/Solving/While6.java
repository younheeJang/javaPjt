package Solving;

import java.util.Scanner;

public class While6 {

	public static void main(String[] args) {
	
/*
 * �� ���� ������ �Է� �޾� ���� ������ ū �������� ���� ���Ͻÿ�.
 */

		Scanner s = new Scanner(System.in);
		int sum = 0;
		
		int a = 0;
				int  b =0;
				
				
	System.out.println("ù ��° ��");
	a = s.nextInt();
	System.out.println("�� ��° ��");
	b = s.nextInt();
		
		if(a>b) {
			a= a^ b;
			b=b^a;
			a =a^ b;
			
		}
		
		
		while(a <=b) {
			sum += a;
		   a++;
		} 
		System.out.println(sum);
	
	}
	
}
