package bank;

public class Account1 {

	//입출금 계좌
	
	private String name;
	private long balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	//입금 메소드
	
	public void deposit(long amount) {
	 balance +=amount;
	}
	
	
	//출금 메소드
	public void withdraw(long amount) {
		
		if(balance<amount) {
			System.out.println("잔고 부족으로 출금할 수 없음");
		}else {
			balance -=amount;	
		}
		
	}
	
	
	
}
