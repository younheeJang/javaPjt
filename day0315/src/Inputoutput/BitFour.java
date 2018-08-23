package Inputoutput;

import java.util.*; //스캐너 사용시 항상 추가

public class BitFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
		int var;
		int offset; // 8>>3
		int temp, result;
		System.out.print("입력받은 수 :");
       var = sc.nextInt();
       
       System.out.print("이동할 수 :");
       offset = sc.nextInt();
     
       result = var >> offset;
       temp = var << offset;
       System.out.printf("%d >> %d = %d\n", var, offset, result );
       System.out.printf("%d >> %d = %d\n", offset, var, temp );
       
		
		
	}

}
