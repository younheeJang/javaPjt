package study;
import java.io.*;
public class asdf {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(
				 new InputStreamReader(System.in));
		
		System.out.print("알파벳 한 글자를 입력하세요.");
	    char asd = (char)System.in.read();
	    
       if((asd>='a'&&asd<='z')||(asd>='A'&&asd<='Z')) {
		
       if(asd == 'a'||asd == 'e'||asd == 'i'||asd == 'o'||asd == 'u') {
    	System.out.println("모음이 맞습니다.");   
       }else if (asd == 'A'||asd == 'E'||asd == 'I'||asd == 'O'||asd == 'U'){
    	   System.out.println("모음이 맞습니다.");
       }else
    	   System.out.println("알파벳 모음을 입력하세요.");
    	   return;
    	   
    	   
       }else {
    	   System.out.println("알파벳을 입력하세요.");

       }
	
		
	}

}
