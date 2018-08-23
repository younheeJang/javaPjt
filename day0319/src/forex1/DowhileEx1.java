package forex1;


/*do while문을 이용해 1~100까지 합을 구하시오
 * 
 */
public class DowhileEx1 {

	public static void main(String[] args) {
	//변수의 초기값 설정
		int sum = 0;
		int a =1;
		
		do {
			sum+=a;
					a++;	
					
		}
		
		while(a<=100);
			
		System.out.println(sum);
	
		
	}

}
