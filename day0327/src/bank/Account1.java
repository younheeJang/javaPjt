package bank;

public class Account1 {

	//����� ����
	
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
	
	//�Ա� �޼ҵ�
	
	public void deposit(long amount) {
	 balance +=amount;
	}
	
	
	//��� �޼ҵ�
	public void withdraw(long amount) {
		
		if(balance<amount) {
			System.out.println("�ܰ� �������� ����� �� ����");
		}else {
			balance -=amount;	
		}
		
	}
	
	
	
}
