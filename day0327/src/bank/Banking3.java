/*package bank;

import java.util.Scanner;

public class Banking3 {

	public static void main(String[] args) {
		
		Account2 ac = new Account2("홍길동");
		
				Scanner sc = new Scanner(System.in);
		String str ;
	
	
		System.out.println("메뉴를 선택하세요");
		
		do {
			System.out.println("------------------------------");
			System.out.println("1. 입금 2.출금  3.잔고  4.종료");
			System.out.println("========================");
	        System.out.println("메뉴를 선택하세요");	
			str = sc.nextLine();
			
			if( str!=null) {
			int switchInt = Integer.parseInt(str);
			}else {
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				
			}
			
			
			switch(switchInt)
			case 1:
				System.out.println("입금 금액");
				String strdeposit = sc.nextLine();
				int depositInt = Integer.parseInt(strdeposit);
				ac.deposit(depositInt);
				break;
			case 2:
			  System.out.println("출금 금액");
				break;
			case 3:
				
				
				break;
			case 4: 
				break;
		}while()

	}

}
*/