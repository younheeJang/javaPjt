package study;

import java.util.Scanner;

/*
 *char : 2byte [unicode���]
 *ex : char ch='\u0041'; ch =65, ch='A';
 *ch a=97
 * 
 * �ƽ�Ű �ڵ� - 1byte ���ڸ� ǥ�� 0 ~ 255
 * �����ڵ� - 2byte ���ڸ� ǥ�� 0 ~ 65535
 * 
 * �ѱ��̳� ���ڴ� 2byte���� ǥ��
 * 
 * 
 */

public class CharEx {

	static int aa; // Ŭ���� ���� = ���� ����
	
	int bb;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // ���� ���� ����

		int ch1;
		
		 // ���� ���� ���� ���� �׸��� �ʱ�ȭ
		  Scanner scanner = new Scanner (System.in);
	
		  
		System.out.println("���α׷� �ڵ忡�� 10���� 65�� �ش��ϴ� �����ڵ� ���ڸ� �˰� �ʹٸ�?\n");
		
		System.out.println("�ش� ���� �Է��� ������!\n");
		
		ch1 = 65;
		
        ch1 = scanner.nextInt();


    //    System.out.println("A");
		
        CharEx ee = new CharEx(); // �ν��Ͻ� ����
        
      //  System.out.println(ee.bb);

		//ee. ee�� Ŭ������ �ǹ� ee.Ŭ������ �ִ� ������ ������ ���ڴٴ� �ǹ�
        ee.aa();
        
        final int cccc =30;
        
	}

	 void aa () {  // ������ ���� �ȿ��� ����� ���� �ִ� ���� �̸��� ����
	
	 int aa;
	 
	 System.out.println("y"); // �����ݷ��� ������ ��ħǥ
	 
	 byte a_min = Byte.MAX_VALUE;
	 }
}
