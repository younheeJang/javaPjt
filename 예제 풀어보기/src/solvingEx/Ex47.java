package solvingEx;

import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {
    
		boolean boo = true;
		int balance =0;
		int button = 0;
		
		Scanner sc = new Scanner(System.in);
		while(boo) {
			
			System.out.println("--------------------------------------------");
			System.out.println("1. 예금|2. 출금|3. 잔고|4. 종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			
			
			switch(button) {
			
			case 1: 
				System.out.print("예금액:");
				balance += sc.nextInt();
				System.out.println(balance);
				  break;
			case 2: 
				System.out.print("출금액:");
				balance -= sc.nextInt();
				System.out.println(balance);
				  break;
			case 3: 
				System.out.print("잔고:");
				balance = sc.nextInt();
				System.out.println(balance);
				  break;
			case 4: 
				boo=false;
				System.out.print("종료:");
				  break;
				
			}
		System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}

}
