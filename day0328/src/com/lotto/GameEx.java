package com.lotto;
import java.util.Random;
import java.util.Scanner;

/*
 * 
 *���� ���� ��
 *�ý����� �������� ���� �޴´�.
 *����ڴ� �迭�� �̿��Ͽ� �����Ѵ�.
 *
 */

public class GameEx {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		Random rnd = new Random();
		
		String[] ss = {"����","����","��"};
		
		int com, me; // ��ǻ�Ϳ� �����
		
		char ch;// ���࿩�ο� ����� ����
		
		System.out.println("���� ���� ��");
		System.out.println();
		
	   while(true) {
		   //��ǻ���� ��ȣ�� �������� ���Ѵ�
		   com = rnd.nextInt(3)+1;
		   //������� ��ȣ�� �Է��Ѵ�.
		   
		  do{
			  
			  System.out.print("1.���� 2.���� 3.��===>");
			 me=sc.nextInt();
		  }while(me<1||me>3);
		
		  System.out.println("��ǻ��:"+ss[com-1]+", �����:"+ss[me-1]+"\n");
		  
	  // ��ǻ�Ϳ� ���� ���и� ��
		  
		  if(com==me)
		  {System.out.println("��ǻ�Ϳ� ����ڰ� �����ϴ�");
			 //��ǻ�Ϳ� ����ڰ� ��� ��� 
		  }else if(com==3&&me==1||me>com) 
		  {System.out.println("����ڰ� �̰���ϴ�");	           
		  }else if(me==3&&com==1||com>me)
		  {System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			  //��ǻ�Ͱ� �̱� ���
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  System.out.print("����Ͻðڽ��ϱ�?[y/n]");
		  ch=sc.next().charAt(0);
		  if(ch!='Y'&&ch!='y')
			  break;
		  
		  
		  
	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
