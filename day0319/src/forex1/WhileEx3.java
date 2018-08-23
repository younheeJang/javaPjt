package forex1;
import java.io.*;
public class WhileEx3 {

	public static void main(String[] args)throws IOException {
		//사용자로부터 임의의 알파벳을 입력받은 후 입력받은 알파벳이 소문자면 대문자로
		//대문자면 소문자로 변환하는 프로그램을 완성하시오
		//입력은 System.in.read()메소드 사용
		//버퍼 설정
				BufferedReader br = new BufferedReader(
						 new InputStreamReader(System.in));

			/*	
				System.out.println("알파벳 한 문자를 입력하세요");
                char s ;

				
				char n =(char) System.in.read();
        	    //int n; //범위를 정하기 위한 변수
    
        	    
        	    //대문자를 입력받았을 경우 소문자로 변환
        	    //소문자를 입력받았을 경우 대문자로 변환
        	    
        	    //입력받은 문자가 대문자라면??
        	    //아스키 코드 대문자 
        	    if(n>=65&&n<=90) {
        	    	//이 범위에 있으면 대분자
        	    	
        	    	
        	    	//소문자 변환
        	    	//A(65) -> a(97) : 65+32
        	    	//B(66) -> b(98) : 66+32
        	    	//C(67) -> c(99) : 67+32
        	    	
        	    	n += 32;
        	     	s = (char)(n);
        	     	System.out.println(s);

        	    
        	    }else if(n>=97&&n<=122) {
        	    	//입력값이 소문자라면
        	    	//대문자로 변환
        	    	
        	    	
        	    	n-=32;
        	    	s=(char)(n);
        	    	System.out.println(s);
        	    } else {
        	    	System.out.println("입력오류!");
        	    }
        	    
	*/
				
				
				System.out.println("알파벳 한 문자를 입력하세요");
				char c =(char) System.in.read();

	
	if( c>='A'&& c<='Z') {
		
		c += 32;
		System.out.println(c);
		
	}else if(c>='a'&&c<='z') {
		c -=32;
		System.out.println(c);
		
		
	}
	
	}

}
