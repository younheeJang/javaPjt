package InputOutput;
import java.io.*;

public class Ex {

/*
 * 문제 두 개의 정수를 입력받아 사칙연산을 구하는 프로그램을 작성하시오.
 * 누적 변수 : result
 * 
 * 
 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//버퍼 설정
				BufferedReader br = new BufferedReader(
						 new InputStreamReader(System.in));
	
	   //두 개의 정수를 입력받아 사칙연산을 구하는 프로그램을 작성하시오.
				
				// 변수 설정
				int sum, sub, divide, times, num1, num2, num= 0, num4 = 0, num5=0, num6=0, num7=0, num8=0;
				
				System.out.print("첫번째 수:");
			    num1 = Integer.parseInt(br.readLine());
			    System.out.print("두번째 수:");
			    num2 = Integer.parseInt(br.readLine());
			    
			    sum = num1 + num2;
			    System.out.println("두 수의 합은 "+sum+"입니다.");
			    
			    System.out.print("첫번째 수:");
			    num7 = Integer.parseInt(br.readLine());
			    System.out.print("두번째 수:");
			    num8 = Integer.parseInt(br.readLine());
			    
			    sub = num7 - num8;
			    System.out.println("두 수를 뺀 값은 "+sub+"입니다.");
			    
			    System.out.print("첫번째 수:");
			    num = Integer.parseInt(br.readLine());
			    System.out.print("두번째 수:");
			    num4 = Integer.parseInt(br.readLine());
			    
			    divide = num/num4;
			    System.out.println("두 수를 나눈 값은 "+divide+"입니다.");
			    
			    System.out.print("첫번째 수:");
			    num5 = Integer.parseInt(br.readLine());
			    System.out.print("두번째 수:");
			    num6 = Integer.parseInt(br.readLine());
			    
			    times = num5*num6;
			    System.out.println("두 수를 곱한 값은 "+times+"입니다.");
			    
			    		
		
	}

}
