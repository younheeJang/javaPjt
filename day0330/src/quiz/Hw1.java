package quiz;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		
		int i ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ųٷ� ����� ������ �Է��ϼ���>");
		i = sc.nextInt();
		
		do {
		System.out.print(i%10+" ");
		i = i/10;
		
		}while(i !=0);
		
	}

}
