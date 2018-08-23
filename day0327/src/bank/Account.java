package bank;
//��� 2�� �޼ҵ� 2���� �ٸ��־���!
public class Account {

	private String name;
	// �̸� ��� �ʵ�
	private long balance;
	// �ܰ� ��� �ʵ�

	
	public Account(String name) {
		// TODO Auto-generated constructor stub
		this.name = name; // Ŭ������ �ö󰡼� ���� ������ this
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}//�ܾ��� ���� �� �� �ִ� �޼ҵ���

	public void setBalance(long balance) {
		this.balance = balance;
	}

	// �Ա� �޼ҵ�
	public void deposit(long amount) {
		// �Ա� ����� ������ �޼ҵ�
		// �ܰ� amount�� ������Ŵ
		balance += amount;

	}

	// ��� �޼ҵ�
	public void withdraw(long amount) {

		if (balance < amount)// �ܰ� ����ϰ��� �ϴ� �ݾ׺��� ���� ���
			System.out.println("�ܰ� �����Ͽ� ����� �� �����ϴ�.");
		else
			balance -= amount;

	}

}
