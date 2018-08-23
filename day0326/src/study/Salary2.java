package study;

public class Salary2  {

	//나에게 입금된 돈
	private int pay;

	//프라이빗이니 입출력 개러 새러 해줘야 함
	public int getPay() {
		return pay;
	}
//세러는 입력인데 다른 클래스에서 추후 사용시 이 계좌에 알맞은 패스워드를 입력 받아야 하므로
	//세러에만 스트링 패스(워드)를 지정해준다.
	public void setPay(int pay, String pass) {
		
		if(pass.equals("1234"));// 가져올 수 있다고 하기 전에 패스워드 설정 해줘야 함.
		this.pay = pay;//이곳에서 페이를 가져올 수 있으려면
	}
	
	
	
	
}
