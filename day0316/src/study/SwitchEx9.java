package study;
import java.io.*;
public class SwitchEx9 {

	public static void main(String[] args) throws IOException{
	/*사용자로부터 임의의 정수 세 개를 입력받아
	 * 작은수에서부터 큰 수 순으로 정렬하시오.
	 * 단, BufferedReader와 if문을 가지고 작성
	 * 16, 8, 21입력받을시
	 * 8, 16, 21순으로 나와야 함
	 */
		BufferedReader a = new BufferedReader(
				 new InputStreamReader(System.in));
		
      int b, c, d, temp;
      
      System.out.print("첫번째 수를 입력하세요.");
	   b = Integer.parseInt(a.readLine());
	    System.out.print("두번째 수를 입력하세요.");
	   c = Integer.parseInt(a.readLine());
	    System.out.print("세번째 수를 입력하세요.");
	   d = Integer.parseInt(a.readLine());
		
	   if(b>c) {
		  /* temp = b;
		   b = c;
		   b = temp;*/
		  b=b^c;
		  c=c^b;
		  b=b^c;
	   } if(b>d) {
		  /* temp = b;
		   b = d;
		   d = temp;*/
		  b=b^d;
		  d=d^b;
		  b=b^d;
		   
	   } if(c>d) {
		  /* temp = c;
		   c = d;
		   d = temp;*/
		   c=c^d;
		   d=d^c;
		   c=c^d;
	   }
		
	   System.out.println("정렬 결과 : "+ b + "=>"+ c +"=>"+d);
	}

}
