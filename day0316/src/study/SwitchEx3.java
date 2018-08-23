package study;
import java.io.*;
public class SwitchEx3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		//버퍼 설정
		BufferedReader br = new BufferedReader(
				 new InputStreamReader(System.in));

		//사용자로부터 임의의 정수를 입력받아 입력받은 정수가 짝수인지 홀수인지를 판정하는
		//프로그램을 작성하시오.
		//단, 조건삼항연산자를 이용하여 처리하시고,
		//BufferedReader로 처지하시오
		
		// 매크로
		//final int DIVISION = 2;
		
		// 변수 설정
		
		int num;
		
		//int even;
		//int odd;
		
      
		/*처리과정
		 * 1. 사용자로부터 임의의 정수를 입력받는다.
		 * 2. 입력받은 정수가 짝수인지 홀수인지 판정한다.
		 *    2.1. 
		 *    2.2. 
		 * 
		 * 3. 끝내다.
		 * 
		 * 
		 */
		
		System.out.print("정수를 입력하세요.");
	    num = Integer.parseInt(br.readLine());
		
	    //remainder = num/DIVISION;
	    
	    String n = (num%2==0) ? "\"짝수\"" : "\"홀수\""  ;
	    
	    System.out.printf("\n입력된 수 :" +num);
	    System.out.printf("\n\n%s 입니다.", n);

	    
	}

}
