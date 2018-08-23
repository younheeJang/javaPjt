package bank;
//멤버 2개 메소드 2개를 꾸며주었다!
public class Account {

	private String name;
	// 이름 멤버 필드
	private long balance;
	// 잔고 멤버 필드

	
	public Account(String name) {
		// TODO Auto-generated constructor stub
		this.name = name; // 클래스로 올라가서 값을 가져옴 this
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBalance() {
		return balance;
	}//잔액을 갖고 올 수 있는 메소드임

	public void setBalance(long balance) {
		this.balance = balance;
	}

	// 입금 메소드
	public void deposit(long amount) {
		// 입금 기능을 구현한 메소드
		// 잔고에 amount를 누적시킴
		balance += amount;

	}

	// 출금 메소드
	public void withdraw(long amount) {

		if (balance < amount)// 잔고가 출금하고자 하는 금액보다 작은 경우
			System.out.println("잔고가 부족하여 출금할 수 없습니다.");
		else
			balance -= amount;

	}

}
