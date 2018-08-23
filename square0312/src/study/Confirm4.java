package study;

import java.io.BufferedReader; //입력
import java.io.IOException; // 인풋아웃풋예외
import java.io.InputStreamReader; //입력의 범위를 넓힘



public class Confirm4 {
static double re1 = 0; // 전역변수

static int re = 0; // 전역변수
	//클래스 생성 다음 인풋 아웃풋의 예외를 없애주기 위해 throws IOException 설정해 줌
	public static void main(String[] args) throws IOException  {
   
    
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
	     String s = " " ;
		
		
	     
         

		 System.out.println("사칙연산 프로그램입니다.");
		 
		 while(true) {
			
			 //정해진 횟수없이 반복되는 와일문에서 트루일 동안 반복
			 //입력을 받는다. 그리고 문자열로 입력받은 수를 인트로 변환시킨다.
			 System.out.println("첫번째 수를 입력해 주세요!");
			 String num1 = b.readLine();
			 int a = Integer.parseInt(num1);
			 System.out.println("두번째 수를 입력해 주세요!");
			 String num2 = b.readLine();
			 int c = Integer.parseInt(num2);
		 
			 //입력받은 인트형 수를 사칙연산한다.
			
			   System.out.print("수행할 연산:");
			   
				  char i = (char)System.in.read();
				
				  System.in.read();
				  System.in.read();
	        
		 //  int d = Integer.parseInt(re);
				  Confirm4 ee = new Confirm4(); // 인스턴스 변수
				  
			  switch(i) {
			 
			  case '+': 
				 ee.re = a +c;
				  System.out.println("덧셈결과 : " + re);
				  break;
				  
			  case '-':
					  re = a - c;
				  System.out.println("뺄셈결과 : " + re);
				  break;
				  
			  case '*':
				  re = a * c;
			  System.out.println("곱셈결과 : " + re);
			  break;
			  
			  case '/':
           
				    System.out.println("나눗셈결과 : " + DivideResult(a, c));
			  break;
			  
			  //  System.out.println("나눗셈결과 : " + DivideResult(a, c));
			  //public static double DivideResult(int a, int c){
				 //return (double)a / c;
			  } 
		   
	      System.out.println("계속 하려면 y, 그만 하고 싶으면 n를 누르세요! ");
	    	s = b.readLine();
	    	 /* 
	    	    if(s.equals("y")||s.equals("Y"))
	 	          continue ;
	 	         else if(s.equals("n")|| s.equals("N"))
	 	          break ;*/
	      if(s.equals("y")||s.equals("Y")) 
              continue;
          else if (s.equals("n")||s.equals("Y"))
             // System.out.println("프로그램 종료");
        	  break;
         
        	  else {
        	  System.out.println("잘못된 문자를 입력하였습니다.");
        	  System.out.println("프로그램을 종료합니다.");
          }
	    	 
	    	 } 	 
		 
	}
	public static double DivideResult(int a, int c){
		 return (double)a / c;
	 
		}
}



