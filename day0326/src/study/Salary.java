package study;

public class Salary  {

	
	//남들이 접근하면 안되는 입금된 돈
	private int pay;

	public int getPay() {
		return pay;

	}

	public void setPay(int pay, String pass) {
	
		
		
		if(pass.equals("1234"))
		this.pay = pay;
	
	}
}
