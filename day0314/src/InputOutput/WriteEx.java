package InputOutput;

/* 자바의 표준 입출력
 * 
 *  import java.io.*;  *찍으면 인아웃풋 따로 지정 안해도 다 사용가능
 *  메소드 뒤에 throws IOException 반드시 기재해야 함 (메소드에게 일임한다는 뜻)
 * System Class 와 기본 입출력
 * -in, out, err(PrintStream)
 * 
 *
 * print()
 * println()
 * write() -화면 출력시 버퍼에 담음 (System.out.flush() 메소드를 호출
 * 단, byte 배열 사용시에는 autoflush가 됨
 * 
 *  
 * 
 */

import java.io.*; 

public class WriteEx {

	public static void main(String[] args) throws IOException // 계산할 수 없는 것들에 대한 예외처리 
	// TODO Auto-generated method stub
	{/* System.out.write(65);
	//write 메소드를 이용하여 버퍼에 입력한 상태
	
      System.out.flush(); //버퍼에 있는 내용을 출력해라  그러고 나서 안이 빈다. 
      
     //byte배열에서는 메소드가 필요 업삳.
      byte[] by = {'J','A','V','A'};
     
      System.out.write(by, 0, 4); //4 문자의 개수, 문자 하나를 입력받을 때는 아스키 코드를 사용한다.

      // byte배열 사용시에는 autoflash기능이 내장되어 있다. 실행할 때 가능해지고 실행 후 안이 비게 된다.
*/
   
		System.out.write(71);
		// 문자 출력
		
		System.out.flush();
		// 출력 후 0
		
		byte[] te = {'I','U'};
		//바이트 배열 명칭 
		//바이트 배열 메소트 불필요
		
		
		System.out.write(te, 0, 2);
		// 문자 출력
		// 바이트 명칭, 0, 문자 개수 
		
		
	}

}
