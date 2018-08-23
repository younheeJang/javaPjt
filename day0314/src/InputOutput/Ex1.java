package InputOutput;
import java.io.*;
//두 수를 입력받아 사칙연산을 행하고 이 때 연산자까지 입력을 받아 축력할 수 있도록 하시오.

public class Ex1 {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		//버퍼 설정
		BufferedReader c = new BufferedReader(
				 new InputStreamReader(System.in));

//두 개의 정수를 입력받아 사칙연산을 구하는 프로그램을 작성하시오.
		
		// 변수 설정
		int a, b, re =0;
		
		// 연산식을 키보드로 입력받는다.
		System.out.print("첫번째 수:");
	   a = Integer.parseInt(c.readLine());
	 
	   System.out.print("수행할 연산:");
	   
	  char i = (char)System.in.read();
	
	  System.in.read();
	  System.in.read();
	   System.out.print("두번째 수:");
	   b = Integer.parseInt(c.readLine());
	
		
        re = a + b;    
        System.out.printf("%d %c %d = %d입니다.", a, i, b, re);
	  
        
        
       
	}

}
