package bank;

public class Account2 {

	
	private String name;
	
	private int balance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//입금 메소드
	
	public void deposit(long amount )  {
	 balance+=amount;
	}
	
	
	//출금 메소드
	
	public void withdraw(long amount) {
	if(balance < amount) {
		
		System.out.println("출금 가능 금액 부족");
	}else {
		balance-=amount;
	}
	}
}
