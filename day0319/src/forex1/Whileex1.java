package forex1;


/*while문을 이용하여 1~100까지의 합을 구하시오.
 * 
 * 
 */
public class Whileex1 {

	public static void main(String[] args) {
		// 변수선언 와일문에서는 바깥에 변수선언을 하면서 초기화를 해줌 초기식임.
	
		
		int i =1;	
		while(i<=9) {
             
		    
		      System.out.println("***"+i+"단"+"***");
		      //증감식임 
		      int j =1;
		      while(j<=9) { 
		    	  System.out.printf("%dx%d=%d\n", i, j, (i*j));       	
		    	 j++;
		    	 	
		     }
		    i++;
		}

			   	
		
	}

}
