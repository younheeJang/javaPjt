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
		
		
		System.out.println("ù��° ��:");
		num1 = sc.nextInt();
		System.out.println("������:");
		i = sc.next().charAt(0);
		System.out.println("�ι�° ��");
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
		
		System.out.printf("%d�� %d�� ���갪�� %d�Դϴ�.\n", num1, num2, result );
	}

}
