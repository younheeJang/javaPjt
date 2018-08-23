package study;

public class SalaryEx {

	public static void main(String[] args) {
		Salary sa = new Salary();
		
	 sa.setPay(10000,"1234");
int myPay = sa.getPay();
System.out.println("나의 계좌에 입금한 금액:"+myPay);
	 

	}

}
