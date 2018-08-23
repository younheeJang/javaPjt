package solvingEx;

import java.util.Scanner;

public class DoWhile06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean a = true;
		
		
		
		
		do {
			
			System.out.print("1: 짜장\t"+"2: 짬뽕\t"+"3.: 우동\t"+"4: 탕수육");
			System.out.println();
			System.out.print("메뉴를 선택하세요. : ");
			System.out.println();
			int v = s.nextInt();
			
			switch(v) {
			
			case 1 :
				System.out.println("짜장을 선택");
				break;
			case 2 :
				System.out.println("짬뽕을 선택");
				break;
			case 3 :
				System.out.println("우동을 선택");
				break;
			case 4 :
				System.out.println("탕수육을 선택");
				break;
			}
		
		
			
			
		}
		while(a);
		
		
		
	}

}
