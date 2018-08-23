package InputOutput;

import java.io.*;

public class InputEx3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		//숫자하나 입력받기
		//int x = System.in.read() - 48;
		//int x = System.in.read() - '0';
		
		
		//입력받을 때 인식할 수 있는 숫자는 0-9까지라서 10이상의 수를 입력받으면 에러남
		//하나 처리할 때. 두 개 이상 처리 못할 때 사용
		
		//변수 설정
		int num1;
		int num2;
		
		
		//입출력
		System.out.print("첫번째 수:");
		
		num1 = System.in.read()-48;
		System.in.read();
		System.in.read();
		//System.in.skip(0);
		System.out.print("두번째 수:");
		num2 =  System.in.read() - '0';
		
		int c = num1 + num2;
		System.out.println("두 수의 합계 :"+c);
		
		
	}

}
