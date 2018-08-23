package bank;

import java. io.*;

public class Banking {

	public static void main(String[] args) throws IOException {
		
		Account na = new Account("홍길동");
		//홍길동이 생성자 함수로 가서 스트링 대입으로 들어감
		/*public Account(String name) {
			// TODO Auto-generated constructor stub
		this.name= name; //클래스로 올라가서 값을 가져옴 this
		} <-요기*/
		BufferedReader br = new 	BufferedReader(new InputStreamReader(System.in));
		
		String strWork;
		do {
			
			System.out.println("\n 메뉴를 선택하세요");
			System.out.println("==========================");
			System.out.println("입                      금 ==========>  1");
			System.out.println("출                      금 ==========>  2");
			System.out.println("잔     액     조     회 ==========>  3");
			System.out.println("종                      금 ==========>  0");
			System.out.println("==========================");
			
			
			System.out.print("메뉴를 선택하세요.");
			strWork = br.readLine();
			
			int switchInt = 0;
			if(strWork != null) {//아무 메뉴도 선택하지 않은 상태
				switchInt = Integer.parseInt(strWork);
			}else {
				System.out.println("메뉴를 고르지 않았습니다");
				System.exit(0);
			}
			
			switch(switchInt) {
			
			case 0: break;
			
			case 1: 
				//금액 앱력
				System.out.println("\n ===================");
				System.out.println("입금하실 금액입력 :");
				String strdepositIn = br.readLine();//스트링으로 입력 받음
				long depositLong = Long.parseLong(strdepositIn);//롱으로 변환해 줌
				na
				.deposit(depositLong);
				break;
				
			case 2: 
				//출금 금액
				System.out.println("\n ===================");
				System.out.println("출금하실 금액입력 :");
				String strwithdrawIn = br.readLine();//스트링으로 입력 받음
				long withdrawLong = Long.parseLong(strwithdrawIn);//롱으로 변환해 줌
				na.withdraw(withdrawLong);
				break;
				
			case 3: 
				//잔고 확인
           System.out.println(na.getName()+"님의 잔액은"+na.getBalance()+"입니다.");
			break;
			
			default :
				System.out.println("0~3사이의 숫자입력\n");
				
				
			}

		}while(! strWork.equals("0"));//문자열을 비교할 때는 이퀄스를 쓴다. 숫자는 ==을 씀
		//종료 0 을 누르지 않는 한 계속 된다. 와일문의 조건을 줌
		
		
	}

}
