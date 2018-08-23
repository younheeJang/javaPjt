package study;

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

public class CharEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte var1 = 125; //127까지기 때문에 출력값은 거꾸로 감
		int var2 = 125;
		for(int i = 0; i<5; i++) {
			 var1++;
			 var2++;
		     System.out.println("var1:"+var1+"\t"+"var2:"+var2);
		     
		    
		}
		
	}

}
