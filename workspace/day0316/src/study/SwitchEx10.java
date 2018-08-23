package study;

import java.io.*;

public class SwitchEx10 {

	public static void main(String[] args)  throws IOException {
	
		BufferedReader br = new BufferedReader(
				 new InputStreamReader(System.in));
		
		 /* 사용자로부터 임의의 알파벳 한 문자를 입력받아
		 * 이를 판별하여 알파벳이 모음일 경우만 결과를 출력하시오.
		 * 단, 대소문자를 모두 적용할 수 있도록 작성
		 * 또한 알파벳 이외의 수가 들어오면 오류로 처리한다.
		 * 
		 */
		
   

       System.out.print("한 글자의 알파벳을 입력하세요.");
     
       char asd  =(char)System.in.read();

       
	
		if ((asd>='a'&&asd<='z')||((asdf>='A'&&ASD<='Z'>)) {
			
			   if(asd == 'a'||asd == 'e'||asd == 'i'||asd == 'o'||asd == 'u') {
				   System.out.println(모음이 맞습니다.);
			   } else if(asd == 'A'||asd == 'E'||asd == 'I'||asd == 'O'||asd == 'U' ) {
				   System.out.println(모음이 맞습니다.);
			   }else {
				   System.out.println('모음을 입력하세요.'');
				  
				   return;
			   }
		}else {
			 System.out.println("알파벳을 입력하세요.'');
		}
		
	}

}
