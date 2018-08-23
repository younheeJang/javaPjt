package bank;

import java.util.Scanner;

public class Banking1 {

	public static void main(String[] args) {

		Account1 ac = new Account1();
		//불러올 클래스의 객체를 생성해 준다.
		
		Scanner sc = new Scanner(System.in);
		
		//스트링으로 메뉴를 입력 받는다.
		String str ;
	
	
		
		
		System.out.println("메뉴를 선택하세요.");
		do {
		System.out.println("=========================");
		System.out.println("1. 입금 2. 출금 3. 잔고 4. 종료 ");
		System.out.println("=========================");
        System.out.print("메뉴를 선택하세요");
        str = sc.nextLine();
        
	    int d =0 ;
	    
	    if(str !=null) {
	    	d =Integer.parseInt(str);
	    	//스트링 변수에 수를 문자열로 입력을 받았을 때는 조건식을 지난 후
	    	//뒤이어 올 스위치문을 위해서 스트링 변수를 인트형으로 변환을 해 주고,
	    }else {
	     System.out.println("메뉴를 고르지 않았습니다.");
	System.exit(4);    	
	    }
	    
	    switch(d) {
	    
	    case 1: 
	    	//입금
	    System.out.println("\n ===================");
	    	System.out.println("입금하실 금액을 입력하세요.");
	    	//입금할 금액을 입력 받을 스트링 변수를 선언해 준다.
	    	String strdepositIn = sc.nextLine();
	    	long depositLong = Long.parseLong(strdepositIn);
	    	ac.deposit(depositLong);
	    	break;
	    case 2:
	    	//출금
	    	 System.out.println("\n ===================");
		    	System.out.println("출금하실 금액을 입력하세요.");
		    	String strwithdraw = sc.nextLine();
		    	long withdrawLong = Long.parseLong(strwithdraw);
	           ac.withdraw(withdrawLong);
		    	break;
	    case 3:
	       //잔고
	    	
	    	System.out.println(ac.getBalance());
	    	ac.getBalance();
	    	break;
	    case 4: break;
	    
	    
	    
	    }
		
		
		}while(! str.equals(4));
		
		
		
	
	}

}
