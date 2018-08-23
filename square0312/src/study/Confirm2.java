package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Confirm2 {

	public static void main(String[] args) throws IOException  {
		/* 파일 명칭 : Confirm.java
		 * 기능 : 0부터 100 사이의 수 두 개를 입력받아서 사칙연산을 해주는 프로그램
		 * 메소드 : main
		 * 출력:결과
		 * 입력:정수
		 * 작성자 : 장 윤 희
		 * 작성 일자 : 2018/03/16
		 *  
		 */

		//Scanner s = new scanner(System.in);
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



}

