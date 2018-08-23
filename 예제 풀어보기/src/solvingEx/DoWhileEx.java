package solvingEx;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		/*
		 * 사용자로부터 정수를 입력받아 총합을 구하는 프로그램 구현 (Do While사용)
		 * 단, 0을 입력하면 종료시킬 수 있도록 수현
		 * 
		 */

		int a=0;
		int sum=0;
		
		do {
		
			System.out.println("수를 입력하세요.\n");
		    
			a = s.nextInt();
		    
			sum +=a;
	
				 		}	
		
		   while(a!=0);
		
		System.out.printf("입력된 수들의 총합: %d\n",sum);
		
			
	}

	
}
