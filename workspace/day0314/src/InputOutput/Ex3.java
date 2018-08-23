package InputOutput;
import java.io.*;
public class Ex3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//버퍼 설정
				BufferedReader c = new BufferedReader(
						 new InputStreamReader(System.in));
				// 변수 설정
				int a, b, result =0;
				// 연산식을 키보드로 입력받는다.
				System.out.print("첫번째 수:");
			   a = Integer.parseInt(c.readLine());
			   System.out.print("두번째 수:");
			   b = Integer.parseInt(c.readLine());
			
			    result = a + b;    
		        System.out.println("두 수의 합은" +result+ "입니다. ");
			  
		        result = a - b;    
		        System.out.println("두 수의 차는" +result+ "입니다. ");
		       
		        result = a * b;    
		        System.out.println("두 수의 곱은" +result+ "입니다. ");
		        
		        result = a / b;    
		        System.out.println("두 수를 나누면" +result+ "입니다. ");
			    
	}

}
