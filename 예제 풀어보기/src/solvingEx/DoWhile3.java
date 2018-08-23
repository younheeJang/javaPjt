package solvingEx;

import java.util.Scanner;

public class DoWhile3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		int a=0;
		int c = 0;
		int b=0;
		
		System.out.println("단을 입력하세요.");
		a = s.nextInt();	
		if(a>0&&a<10) {
				
		do {
			
		    	for(b=1; b<10; b++) {
		    	c=a*b;	
			System.out.printf("%d"+"*"+"%d"+"="+"%d\n", a, b, c);		
			
		    	}
		    	System.out.println();
		    	System.out.println("단을 입력하세요.");
				a = s.nextInt();	
		    	
		}		
		while(a<10);
		
		} else {
			
			
		}
		
			
	}

}
