package study;
import java.io.*;
public class SwitchEx8 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		/*사용자로부터 임의의 정수를 입력받아 입력받은 정수가 2의 배수인지 3의 배수인지,
		 * 2와 3의 배수인지, 2와 3의 배수가 아닌지를 판별하는 프로그램을 작성하시오.
		 * 단, BufferedReader와 if문을 가지고 작성
		 */
		
		BufferedReader a = new BufferedReader(
				 new InputStreamReader(System.in));
		
        
		String n;
		
		System.out.print("정수를 입력하세요.");
	    int num = Integer.parseInt(a.readLine());
		
	
	    if(num%2==0&&!(num%6==0)) {
	    	// n = "2의 배수";
	    	System.out.println("2의 배수입니다.");
	    } else if (num%3==0&&!(num%6==0)){
	    	// n="3의 배수";
	    	System.out.println("3의 배수입니다.");
	    } else if (num%6==0) {
	    	// n="2와 3의 배수";			
	    	System.out.println("2와 3의 배수입니다.");
	    } else if (!(num%6==0)) {
	      System.out.println("2와 3의 배수가 아닙니다.");
	    	// n="2와 3의 배수가 아니다.";
	    }
	 
	}

	
}
