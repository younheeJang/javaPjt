package study;

import java.io.BufferedReader; //�Է�
import java.io.IOException; // ��ǲ�ƿ�ǲ����
import java.io.InputStreamReader; //�Է��� ������ ����



public class Confirm4 {
static double re1 = 0; // ��������

static int re = 0; // ��������
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
			
			   System.out.print("������ ����:");
			   
				  char i = (char)System.in.read();
				
				  System.in.read();
				  System.in.read();
	        
		 //  int d = Integer.parseInt(re);
				  Confirm4 ee = new Confirm4(); // �ν��Ͻ� ����
				  
			  switch(i) {
			 
			  case '+': 
				 ee.re = a +c;
				  System.out.println("������� : " + re);
				  break;
				  
			  case '-':
					  re = a - c;
				  System.out.println("������� : " + re);
				  break;
				  
			  case '*':
				  re = a * c;
			  System.out.println("������� : " + re);
			  break;
			  
			  case '/':
           
				    System.out.println("��������� : " + DivideResult(a, c));
			  break;
			  
			  //  System.out.println("��������� : " + DivideResult(a, c));
			  //public static double DivideResult(int a, int c){
				 //return (double)a / c;
			  } 
		   
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
             // System.out.println("���α׷� ����");
        	  break;
         
        	  else {
        	  System.out.println("�߸��� ���ڸ� �Է��Ͽ����ϴ�.");
        	  System.out.println("���α׷��� �����մϴ�.");
          }
	    	 
	    	 } 	 
		 
	}
	public static double DivideResult(int a, int c){
		 return (double)a / c;
	 
		}
}



