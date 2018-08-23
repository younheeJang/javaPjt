package study;

public class SalaryEx2 {

	public static void main(String[] args) {
		//다른 클래스를 호출한다. 필요한 기능을 가지고 있기 때문
		//클래스 호출 방법  클래스의 이름 그 다음 명칭 = new 클래스의 이름();
		Salary sa = new Salary();
		
		
		//입력받는다.프라이빗으로 지정해놓았으므로 세터를 찾는다.
		sa.setPay(10000, "1234"); //정답을 지정해 준다. 그리고 입력을 받는다.
	
		
		//출력을 한다.
		int k = sa.getPay();
		System.out.println(k);//출력을 해준다.
		
	}

}
