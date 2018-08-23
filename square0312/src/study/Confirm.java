/*package study;
import java.util.Scanner;
import java.io.IOException; // 인풋아웃풋예외
import java.io.InputStreamReader; //입력의 범위를 넓힘

public class Confirm {
//static String s ;
	public static void main(String[] args)  throws IOException {
		 파일 명칭 : Confirm.java
		 * 기능 : 0부터 100 사이의 수 두 개를 입력받아서 사칙연산을 해주는 프로그램
		 * 메소드 : main
		 * 출력:결과
		 * 입력:정수
		 * 작성자 : 장 윤 희
		 * 작성 일자 : 2018/03/16
		 *  
		 

		//Scanner s = new scanner(System.in);
		   Scanner sc = new Scanner (System.in);
		
		   
		int num; 
		int num2; 
		char i = 0;
	    int result = 0;
		
		
		while(true) {
			
		System.out.println("\n0부터 100사이에 있는 하나의 정수를 입력하세요.");
		
		num = sc.nextInt();
				
		//(num>=0&&num<=100)
	
		if(num>=0&&num<=100) { 
			System.out.println("0부터 100사이의 수가 맞습니다.");
		}  else {
			System.out.println("\n조건에 맞는 수를 입력하지 않았습니다.\n");
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		System.out.println("\n0부터 100사이에 있는 하나의 정수를 하나 더 입력해 보세요.");
		
		num2 = sc.nextInt();
		
		if(num2>=0&&num2<=100) { 
			System.out.println("\n0부터 100사이의 수가 맞습니다.");
		}  else {
			System.out.println("\n조건에 맞는 수를 입력하지 않았습니다.\n");
			System.out.println("프로그램을 종료합니다.");
			return;
		}
	
		System.out.println("\n두 개의 수를 입력받았습니다.");
		System.out.println("\n사칙연산을 시작합니다...");
		System.out.println("\n원하는 연산자를 입력하세요.");
	    i = sc.next().charAt(0);
		
       if(i=='+') {
    	   result = num + num2;  
    	   System.out.printf("\n%d와 %d의 덧셈 결과는 %d입니다.", num, num2, result );  	  
       }				
       else if(i=='-') {
			result = num - num2;
		 System.out.printf("\n%d와 %d의 뺄셈 결과는 %d입니다.", num, num2, result );
        }
		else if(i=='*') {
			result = num * num2;
		 System.out.printf("\n%d와 %d의 곱셈 결과는 %d입니다.", num, num2, result );
		}
		else if(i=='/') {
			result = num / num2;
		 System.out.printf("\n%d와 %d의 나눗셈 결과는 %d입니다.",  num, num2, result );
		 
		}
         System.out.println("계속 하려면 y, 그만 하고 싶으면 n을 누르세요!");
        char s = sc.nextLine().charAt(0); 
         
         switch (s=='y'||s=='Y'||s=='n'||s=='N') {
		
         
         }
         if(s.equals("y")||(s.equals("Y")))
        	 continue;
          if(s.equals("n")||(s.equals("N")))
        		 break;
		
         else { 
        	 System.out.println("잘못된 문자를 입력하였습니다.");
        	 System.out.println("프로그램을 종료합니다.");
         break;
          } 
 
		 }
		  

		
	}

}

*/