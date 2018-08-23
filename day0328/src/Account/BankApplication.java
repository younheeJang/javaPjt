package Account;

import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
// ===================================================================
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록| 3.예금|4.출금|5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}
//==============================================================
	// 계좌생성하기
	private static void createAccount() {
		System.out.println("----------------------");
		System.out.println("계좌 생성");
		System.out.println("----------------------");

		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("계좌주:");
		String owner = scanner.next();

		System.out.print("초기 입금액");
		int balance = scanner.nextInt();
	Account newAccount = new Account(ano, owner, balance);
		for(int i=0; i<accountArray.length; i++) {
			//accounArray배열이 비어있다면
			if(accountArray[i]==null){
				accountArray[i]=newAccount;// 새로운 newAccount를 추가한다는 뜻
				System.out.println("결과:계좌가 생성되었습니다.");
			break;
			}
			
		}
		
	}
//================================================================
	// 계좌목록보기
	private static void accountList() {
		System.out.println("----------------------");
		System.out.println("계좌 목록");
		System.out.println("----------------------");

		for(int i=0; i<accountArray.length; i++) {
			
			Account account = accountArray[i];
			
			if(account!=null) {
				//계좌가 존재한다면
				System.out.print("계좌 번호 :"+account.getAno());
				System.out.println("     ");
				System.out.print("이름 :"+account.getOwner());
				System.out.println("     ");
			System.out.print("입금액:"+account.getBalance());
			System.out.println("     ");
			}
		}
		
	}
//==================================================================
	// 예금하기
	private static void deposit() {
		System.out.println("----------------------");
		System.out.println("입금");
		System.out.println("----------------------");
System.out.println("계좌번호:");
	String ano =scanner.next();
	System.out.println("예금액:");
	int money = scanner.nextInt();
	Account account = findAccount( ano);
	if(account==null) {
		System.out.println("계좌가 없습니다.");
		return;
	}
	account.setBalance(account.getBalance()+money);
	System.out.println("결과: 예금이 성공적으로 완료되었습니다.");
	
	}
//================================================================================
	// 출금하기
	private static void withdraw() {
		System.out.println("----------------------");
		System.out.println("출금");
		System.out.println("----------------------");
		System.out.println("계좌번호:");
		String ano =scanner.next();
		System.out.println("출금액:");
		int money = scanner.nextInt();
		Account account = findAccount( ano);
		if(account==null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance()-money);
		System.out.println("결과: 출금이 성공적으로 완료되었습니다.");
		
		}


//================================================================================
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;
for(int i =0; i<accountArray.length; i++) {
	if(accountArray[i]!=null) {
	String Ano=	accountArray[i].getAno();//accountArray배열에 있는 계좌 번호를 가져와서 새로운 변수에 저장
	if(Ano.equals(ano)) {
		account =accountArray[i];
		break;
	}
	
	
	}
}
		return account;
	}

}
