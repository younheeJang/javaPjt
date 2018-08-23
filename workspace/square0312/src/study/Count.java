package study;
import java.util.*;
public class Count {
	public static void main(String[] args) {
    	// 매크로
		final int DIVISION = 2;
		// 변수 선언
		int number;
		int remainder;
		int evenCount = 0;
		int oddCount = 0;
		// 참조 변수 선언, 생성 그리고 초기화
		 Scanner sc = new Scanner (System.in);
		  //1.1. 수를 입력받는다.
			      number = sc.nextInt();
	  // 1. 파일의 끝이 아닌 동안 반복한다.
	     while(number>0) {     
	     // 1.2. 짝수 여부와 홀수 여부를 판별한다.
	     remainder = number%DIVISION;
	     // 1.3. 짝수이면 짝수 개수를 센다.
	     if(remainder == 0) {
	        evenCount++;
	      }
	     // 1.4. 홀수이면 홀수 개수를 센다.
	     else {
	         oddCount++;
	     }
	  //1.1. 수를 입력받는다.
	     number = sc.nextInt();
	     }
	     
	  // 2. 짝수 개수와 홀수 개수를 출력한다.
	     System.out.printf("%d %d\n", evenCount, oddCount);
	     
	     // 3. 끝내다.
		 sc.close();
	}
}
