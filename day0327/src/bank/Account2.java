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
	
	//�Ա� �޼ҵ�
	
	public void deposit(long amount )  {
	 balance+=amount;
	}
	
	
	//��� �޼ҵ�
	
	public void withdraw(long amount) {
	if(balance < amount) {
		
		System.out.println("��� ���� �ݾ� ����");
	}else {
		balance-=amount;
	}
	}
}
