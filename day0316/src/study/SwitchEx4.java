package study;

import java.io.*;
public class SwitchEx4 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//버퍼 설정
		BufferedReader br = new BufferedReader(
				 new InputStreamReader(System.in));
       //변수 설정
		int num;
		
		
		
		System.out.print("정수를 입력하세요.");
	    num = Integer.parseInt(br.readLine());
	    
	    String n = (num<0) ? "\"음수\"" : ((num==0) ?"\"0\"" : "\"양수\"")  ;
	    
	    System.out.printf("\n입력된 수 :" +num);
	    System.out.printf("\n\n%s 입니다.", n);
		
	}

}
