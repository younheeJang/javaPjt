package control;

import java.util.*;

public class Ex6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		char  i;
		int result = 0;
		
		
		System.out.println("첫번째 수:");
		num1 = sc.nextInt();
		System.out.println("연산자:");
		i = sc.next().charAt(0);
		System.out.println("두번째 수");
		num2 = sc.nextInt();
		
		if(i=='+') {
			result = num1 + num2;
		}
		else if(i=='-') {
			result = num1 - num2;
		}
		else if(i=='*') {
			result = num1 * num2;
		}
		else if(i=='/') {
			result = num1 / num2;
		}
		
		System.out.printf("%d와 %d의 연산값은 %d입니다.\n", num1, num2, result );
	}

}
