package study;

import java.util.Scanner;

/*
 *char : 2byte [unicode사용]
 *ex : char ch='\u0041'; ch =65, ch='A';
 *ch a=97
 * 
 * 아스키 코드 - 1byte 문자를 표현 0 ~ 255
 * 유니코드 - 2byte 문자를 표현 0 ~ 65535
 * 
 * 한글이나 한자는 2byte까지 표현
 * 
 * 
 */

public class CharEx {

	static int aa; // 클래스 변수 = 전역 변수
	
	int bb;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // 지역 변수 선언문

		int ch1;
		
		 // 참조 변수 선언 생성 그리고 초기화
		  Scanner scanner = new Scanner (System.in);
	
		  
		System.out.println("프로그램 코드에서 10진수 65에 해당하는 유니코드 문자를 알고 싶다면?\n");
		
		System.out.println("해당 수를 입력해 보세요!\n");
		
		ch1 = 65;
		
        ch1 = scanner.nextInt();


    //    System.out.println("A");
		
        CharEx ee = new CharEx(); // 인스턴스 변수
        
      //  System.out.println(ee.bb);

		//ee. ee는 클래스를 의미 ee.클래스에 있는 변수를 가져다 쓰겠다는 의미
        ee.aa();
        
        final int cccc =30;
        
	}

	 void aa () {  // 각각의 영역 안에서 기능할 수도 있는 같은 이름의 변수
	
	 int aa;
	 
	 System.out.println("y"); // 세미콜론은 문장의 마침표
	 
	 byte a_min = Byte.MAX_VALUE;
	 }
}
