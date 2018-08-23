package Inputoutput;

import java.util.*; // 스캐너 이용시 반드시 기입

public class OperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//스캐너 인스턴스 생성
		
		int a, b; // 두 개의 수를 입력 받을 변수 지정
		 
		int c, d, e, f, g ; // 각각 연산자를 누적합계를 저장할 변수 
		
		
	System.out.print("첫 번째 수 입력 :");
	a = sc.nextInt();
	System.out.print("두 번째 수 입력 :");	
	b = sc.nextInt();
	//두 개의 수를 스캐너로 입력 받는다.
	
	c = a + b;
	d = a - b;
	e = a * b;
	f = a / b;
	g = a % b;
	
	//프린트에프로 형식 맞춰줌
	System.out.printf("%4d+%4d=%4d\n", a, b, c);
	System.out.printf("%4d-%4d=%4d\n", a, b, d);
	System.out.printf("%4d*%4d=%4d\n", a, b, e);
	System.out.printf("%4d/%4d=%4d\n", a, b, f);
	System.out.printf("%4d %% %4d=%4d\n", a, b, g);
   //%% 하나는 서식문자 하나는 연산자
	//%4d에서 4는 자리수
	}
	
	
}
	
