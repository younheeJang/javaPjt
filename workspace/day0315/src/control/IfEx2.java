package control;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int i;
		
		
		System.out.print("수를 입력:");
		i = sc.nextInt();
		
		String s = (i%2==0)? "짝수" : "홀수";
				
		System.out.printf("당신이 입력한 수:"+"%d는 %s입니다. %n", i, s);
		
		
		
		
		/* a ;
		char b ;
		
		//if(조건식) ? A:B
		//if(i % 2 == 0) ? System.out.println("짝수"); : System.out.println("짝수");
		 int num = (i > 0) ? 'A':'B';
				
				//System.out.println("양수"); : System.out.println("음수");
		*/
	}

}
