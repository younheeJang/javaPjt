package control;

import java.util.*;

public class aaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
        int com, exc, sum = 0;
		
		int avg = 0;
		
		System.out.print("��ǻ�Ͱ��� ����:");
		com = sc.nextInt();
		System.out.print("�������� ����:");
		exc = sc.nextInt();
		

		sum = com + exc;
		avg = sum / 2;
		
		
		System.out.printf("����� ��ǻ�� ������ %d�̰�,\n"+"���� ������ %d�̸�,\n���� ������ �հ�� %d�̸�,\n"
				+"��� ������ %d�Դϴ�.", com, exc, sum, avg);
				
		if(avg>=60)  {
			
			if(com >= 40 && exc >= 40) {
				 System.out.println("�̹� �ڰ��� ���迡 �հ��ϼ̽��ϴ�.");
				   System.out.println("�ڰ��� ����� ���ϵ帳�ϴ�.");
			}
			else {
				System.out.println("�̹� �ڰ��� ���迡 ���հ��ϼ̽��ϴ�.");
			    System.out.println("���� ��ȸ�� �ٽ� �����Ͻñ� �ٶ��ϴ�.");
			}
		}
		else {
			System.out.println("�̹� �ڰ��� ���迡 ���հ��ϼ̽��ϴ�.");
		    System.out.println("���� ��ȸ�� �ٽ� �����Ͻñ� �ٶ��ϴ�.");
		 
		    
		}
		
	}
}
