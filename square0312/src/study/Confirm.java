/*package study;
import java.util.Scanner;
import java.io.IOException; // ��ǲ�ƿ�ǲ����
import java.io.InputStreamReader; //�Է��� ������ ����

public class Confirm {
//static String s ;
	public static void main(String[] args)  throws IOException {
		 ���� ��Ī : Confirm.java
		 * ��� : 0���� 100 ������ �� �� ���� �Է¹޾Ƽ� ��Ģ������ ���ִ� ���α׷�
		 * �޼ҵ� : main
		 * ���:���
		 * �Է�:����
		 * �ۼ��� : �� �� ��
		 * �ۼ� ���� : 2018/03/16
		 *  
		 

		//Scanner s = new scanner(System.in);
		   Scanner sc = new Scanner (System.in);
		
		   
		int num; 
		int num2; 
		char i = 0;
	    int result = 0;
		
		
		while(true) {
			
		System.out.println("\n0���� 100���̿� �ִ� �ϳ��� ������ �Է��ϼ���.");
		
		num = sc.nextInt();
				
		//(num>=0&&num<=100)
	
		if(num>=0&&num<=100) { 
			System.out.println("0���� 100������ ���� �½��ϴ�.");
		}  else {
			System.out.println("\n���ǿ� �´� ���� �Է����� �ʾҽ��ϴ�.\n");
			System.out.println("���α׷��� �����մϴ�.");
			return;
		}
		
		System.out.println("\n0���� 100���̿� �ִ� �ϳ��� ������ �ϳ� �� �Է��� ������.");
		
		num2 = sc.nextInt();
		
		if(num2>=0&&num2<=100) { 
			System.out.println("\n0���� 100������ ���� �½��ϴ�.");
		}  else {
			System.out.println("\n���ǿ� �´� ���� �Է����� �ʾҽ��ϴ�.\n");
			System.out.println("���α׷��� �����մϴ�.");
			return;
		}
	
		System.out.println("\n�� ���� ���� �Է¹޾ҽ��ϴ�.");
		System.out.println("\n��Ģ������ �����մϴ�...");
		System.out.println("\n���ϴ� �����ڸ� �Է��ϼ���.");
	    i = sc.next().charAt(0);
		
       if(i=='+') {
    	   result = num + num2;  
    	   System.out.printf("\n%d�� %d�� ���� ����� %d�Դϴ�.", num, num2, result );  	  
       }				
       else if(i=='-') {
			result = num - num2;
		 System.out.printf("\n%d�� %d�� ���� ����� %d�Դϴ�.", num, num2, result );
        }
		else if(i=='*') {
			result = num * num2;
		 System.out.printf("\n%d�� %d�� ���� ����� %d�Դϴ�.", num, num2, result );
		}
		else if(i=='/') {
			result = num / num2;
		 System.out.printf("\n%d�� %d�� ������ ����� %d�Դϴ�.",  num, num2, result );
		 
		}
         System.out.println("��� �Ϸ��� y, �׸� �ϰ� ������ n�� ��������!");
        char s = sc.nextLine().charAt(0); 
         
         switch (s=='y'||s=='Y'||s=='n'||s=='N') {
		
         
         }
         if(s.equals("y")||(s.equals("Y")))
        	 continue;
          if(s.equals("n")||(s.equals("N")))
        		 break;
		
         else { 
        	 System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
        	 System.out.println("���α׷��� �����մϴ�.");
         break;
          } 
 
		 }
		  

		
	}

}

*/