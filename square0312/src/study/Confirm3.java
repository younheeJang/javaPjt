package study;

import java.io.BufferedReader; //입력
import java.io.IOException; // 인풋아웃풋예외
import java.io.InputStreamReader; //입력의 범위를 넓힘


public class Confirm3 {

	
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
			
			 System.out.println("덧셈결과 : " + PlusResult(a, c));
	         System.out.println("뺄셈결과 : " + MinusResult(a, c));
	         System.out.println("곱셈결과 : " + MultiplicationResult(a, c));
	         System.out.println("나눗셈결과 : " + DivideResult(a, c));
	         
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
              break;
          else {
        	  System.out.println("잘못된 문자를 입력하였습니다.");
        	  System.out.println("프로그램을 종료합니다.");
          }
	    	 
	    	 } 	 
		 
	}

		


	// static 키워드를 붙여준 메서드 PlusResult는 클래스의 객체를 생성하지 않고도
	// 그 이름만 가지고도 바로 호출할수 있다.

	// 덧셈결과를 return 해주는 PlusResult 메서드
	public static int PlusResult(int a, int c){
	 return a + c;
	}

	// 뺄셈결과를 return 해주는 MinusResult 메서드
	public static int MinusResult(int a, int c){
	 return a - c;
	}

	// 곱셈결과를 return 해주는 MultiplicationResult 메서드
	public static int MultiplicationResult(int a, int c){
		
	 return a * c;
	}

	// 나눗셈결과를 return 해주는 DivideResult 메서드
	// 나눗셈 결과는 실수형으로 나올수 있다.
	public static double DivideResult(int a, int c){
	 return (double)a / c;
 
	}
	  
}
		
	/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		 String str =  "" ;
		  System.out.println("사칙연산 프로그램");
		  
		  // 무한반복
		  while(true){
		   System.out.print("첫번째 수 입력 : ");
		   // 키보드로 부터 입력받은 값은 String 형이므로 int 형값을 사용해야 하기 때문에
		   String num1 = br.readLine() ;
		   // String 형을 int형 값으로 parsing(파싱) 해준다.
		   int a = Integer.parseInt(num1) ;
		   System.out.print("두번째 수 입력 : ");
		   // 키보드로 부터 입력받은 값은 String 형이므로 int 형값을 사용해야 하기 때문에
		   String num2 = br.readLine() ;
		   // String 형을 int형 값으로 parsing(파싱) 해준다.
		   int b = Integer.parseInt(num2) ;
		   
		   // 사칙연산 결과 출력
	         System.out.println("덧셈결과 : " + PlusResult(a, b));
	         System.out.println("뺄셈결과 : " + MinusResult(a, b));
	         System.out.println("곱셈결과 : " + MultiplicationResult(a, b));
	         System.out.println("나눗셈결과 : " + DivideResult(a, b));
		
	         System.out.println("계속 하시려면 y 를 종료하시려면 n 을 누르세여");
	         // 사용자가 선택하기 위한 값을 받기 위한 변수
	         System.out.print("입력하세여 : ");
	         // T
	         str = br.readLine() ;
	   
	         // 사용자가 소문자로 입력할수도 있고 대문자로 입력할수 있다는 가정하에
	         // 두가지 경우의 수를 두었다.
	         if(str.equals("y")||str.equals("Y"))
	          continue ;
	         else if(str.equals("n")|| str.equals("N"))
	          break ;
	         else{
	          System.out.println("지정된 키를 누르지 않았습니다.") ;
	          System.out.println("프로그램을 종료합니다.") ;
	          break ;
	         }
	  }
	  System.out.println("프로그램이 정상 종료 되었습니다.") ;
	 }
	 
	 // static 키워드를 붙여준 메서드는 클래스의 객체를 생성하지 않고도
	 // 그 이름만 가지고도 바로 호출할수 있다.
	 
	 // 덧셈결과를 return 해주는 PlusResult 메서드
	 public static int PlusResult(int a, int b){
	  return a + b;
	 }
	 
	 // 뺄셈결과를 return 해주는 MinusResult 메서드
	 public static int MinusResult(int a, int b){
	  return a - b;
	 }
	 
	 // 곱셈결과를 return 해주는 MultiplicationResult 메서드
	 public static int MultiplicationResult(int a, int b){
	  return a * b;
	 }
	 
	 // 나눗셈결과를 return 해주는 DivideResult 메서드
	 // 나눗셈 결과는 실수형으로 나올수 있다.
	 public static double DivideResult(int a, int b){
	  return (double)a / b;
		  }
*/



