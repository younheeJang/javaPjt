package Inputoutput;

import java.util.*; //��ĳ�� ���� �׻� �߰�

public class BitFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
		int var;
		int offset; // 8>>3
		int temp, result;
		System.out.print("�Է¹��� �� :");
       var = sc.nextInt();
       
       System.out.print("�̵��� �� :");
       offset = sc.nextInt();
     
       result = var >> offset;
       temp = var << offset;
       System.out.printf("%d >> %d = %d\n", var, offset, result );
       System.out.printf("%d >> %d = %d\n", offset, var, temp );
       
		
		
	}

}
