package study;

import java.io.BufferedReader; //�Է�
import java.io.IOException; // ��ǲ�ƿ�ǲ����
import java.io.InputStreamReader; //�Է��� ������ ����


public class Confirm3 {

	
	//Ŭ���� ���� ���� ��ǲ �ƿ�ǲ�� ���ܸ� �����ֱ� ���� throws IOException ������ ��
	public static void main(String[] args) throws IOException  {
   
    
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
	     String s = " " ;
		
		 System.out.println("��Ģ���� ���α׷��Դϴ�.");
		 
		 while(true) {
			
			 //������ Ƚ������ �ݺ��Ǵ� ���Ϲ����� Ʈ���� ���� �ݺ�
			 //�Է��� �޴´�. �׸��� ���ڿ��� �Է¹��� ���� ��Ʈ�� ��ȯ��Ų��.
			 System.out.println("ù��° ���� �Է��� �ּ���!");
			 String num1 = b.readLine();
			 int a = Integer.parseInt(num1);
			 System.out.println("�ι�° ���� �Է��� �ּ���!");
			 String num2 = b.readLine();
			 int c = Integer.parseInt(num2);
		 
			 //�Է¹��� ��Ʈ�� ���� ��Ģ�����Ѵ�.
			
			 System.out.println("������� : " + PlusResult(a, c));
	         System.out.println("������� : " + MinusResult(a, c));
	         System.out.println("������� : " + MultiplicationResult(a, c));
	         System.out.println("��������� : " + DivideResult(a, c));
	         
	      System.out.println("��� �Ϸ��� y, �׸� �ϰ� ������ n�� ��������! ");
	    	s = b.readLine();
	    	 /* 
	    	    if(s.equals("y")||s.equals("Y"))
	 	          continue ;
	 	         else if(s.equals("n")|| s.equals("N"))
	 	          break ;*/
	      if(s.equals("y")||s.equals("Y")) 
              continue;
          else if (s.equals("n")||s.equals("Y"))
              break;
          else {
        	  System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
        	  System.out.println("���α׷��� �����մϴ�.");
          }
	    	 
	    	 } 	 
		 
	}

		


	// static Ű���带 �ٿ��� �޼��� PlusResult�� Ŭ������ ��ü�� �������� �ʰ�
	// �� �̸��� ������ �ٷ� ȣ���Ҽ� �ִ�.

	// ��������� return ���ִ� PlusResult �޼���
	public static int PlusResult(int a, int c){
	 return a + c;
	}

	// ��������� return ���ִ� MinusResult �޼���
	public static int MinusResult(int a, int c){
	 return a - c;
	}

	// ��������� return ���ִ� MultiplicationResult �޼���
	public static int MultiplicationResult(int a, int c){
		
	 return a * c;
	}

	// ����������� return ���ִ� DivideResult �޼���
	// ������ ����� �Ǽ������� ���ü� �ִ�.
	public static double DivideResult(int a, int c){
	 return (double)a / c;
 
	}
	  
}
		
	/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		 String str =  "" ;
		  System.out.println("��Ģ���� ���α׷�");
		  
		  // ���ѹݺ�
		  while(true){
		   System.out.print("ù��° �� �Է� : ");
		   // Ű����� ���� �Է¹��� ���� String ���̹Ƿ� int ������ ����ؾ� �ϱ� ������
		   String num1 = br.readLine() ;
		   // String ���� int�� ������ parsing(�Ľ�) ���ش�.
		   int a = Integer.parseInt(num1) ;
		   System.out.print("�ι�° �� �Է� : ");
		   // Ű����� ���� �Է¹��� ���� String ���̹Ƿ� int ������ ����ؾ� �ϱ� ������
		   String num2 = br.readLine() ;
		   // String ���� int�� ������ parsing(�Ľ�) ���ش�.
		   int b = Integer.parseInt(num2) ;
		   
		   // ��Ģ���� ��� ���
	         System.out.println("������� : " + PlusResult(a, b));
	         System.out.println("������� : " + MinusResult(a, b));
	         System.out.println("������� : " + MultiplicationResult(a, b));
	         System.out.println("��������� : " + DivideResult(a, b));
		
	         System.out.println("��� �Ͻ÷��� y �� �����Ͻ÷��� n �� ��������");
	         // ����ڰ� �����ϱ� ���� ���� �ޱ� ���� ����
	         System.out.print("�Է��ϼ��� : ");
	         // T
	         str = br.readLine() ;
	   
	         // ����ڰ� �ҹ��ڷ� �Է��Ҽ��� �ְ� �빮�ڷ� �Է��Ҽ� �ִٴ� �����Ͽ�
	         // �ΰ��� ����� ���� �ξ���.
	         if(str.equals("y")||str.equals("Y"))
	          continue ;
	         else if(str.equals("n")|| str.equals("N"))
	          break ;
	         else{
	          System.out.println("������ Ű�� ������ �ʾҽ��ϴ�.") ;
	          System.out.println("���α׷��� �����մϴ�.") ;
	          break ;
	         }
	  }
	  System.out.println("���α׷��� ���� ���� �Ǿ����ϴ�.") ;
	 }
	 
	 // static Ű���带 �ٿ��� �޼���� Ŭ������ ��ü�� �������� �ʰ�
	 // �� �̸��� ������ �ٷ� ȣ���Ҽ� �ִ�.
	 
	 // ��������� return ���ִ� PlusResult �޼���
	 public static int PlusResult(int a, int b){
	  return a + b;
	 }
	 
	 // ��������� return ���ִ� MinusResult �޼���
	 public static int MinusResult(int a, int b){
	  return a - b;
	 }
	 
	 // ��������� return ���ִ� MultiplicationResult �޼���
	 public static int MultiplicationResult(int a, int b){
	  return a * b;
	 }
	 
	 // ����������� return ���ִ� DivideResult �޼���
	 // ������ ����� �Ǽ������� ���ü� �ִ�.
	 public static double DivideResult(int a, int b){
	  return (double)a / b;
		  }
*/



