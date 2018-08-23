package Solving;

import java.util.Scanner;

public class While6 {

	public static void main(String[] args) {
	
/*
 * 두 개의 정수를 입력 받아 작은 수부터 큰 수까지의 합을 구하시오.
 */

		Scanner s = new Scanner(System.in);
		int sum = 0;
		
		int a = 0;
				int  b =0;
				
				
	System.out.println("첫 번째 수");
	a = s.nextInt();
	System.out.println("두 번째 수");
	b = s.nextInt();
		
		if(a>b) {
			a= a^ b;
			b=b^a;
			a =a^ b;
			
		}
		
		
		while(a <=b) {
			sum += a;
		   a++;
		} 
		System.out.println(sum);
	
	}
	
}
