package study;

class ThisEx {

	String name, jumin, tel; //스트링 

	//개터와 새터는 private에서 서로 다른 클래스 사이에서 값을 입출력하기 위해서 쓰이는
//메소드이지만,  그러나 스트링에서도 개터와 세터가 쓰일 수 있다. 여기서는 스트링 변수에
	//개터를 주었고, 그래서 다른 클래스에서 이 변수에 해당하는 값을 출력을 할 수 있도록 만들어 준다.
	//개터는 있는데 새터가 없는 이유는 입력이 이미 다른 메소드에서 되어 있기 때문이다.
	//그리고 여기에서 스트링 변수에 해당하는 앞자리 퍼블릭을 프라이베이트로 바꾼다면
	//개터를 썼어도 출력이 불가능하다.
	//그 이유는 애초에 클래스가 다르기 때문이다.
	
	
	public ThisEx() {
		this.name = "Guest"; //this 객체 자신의 참조
		this.jumin = "000000-1000000";
		this.tel = "000-1111-1234";
	}
	
	
	public  String getName() {
	return name;
	}
	
	

	public  String getJumin() {
	return jumin;
	}
	

	public  String getTel() {
	return tel;
	}
	


	
	//세 가지의 변수를 설정
	public ThisEx(String name) {
		this();// 위의 매개변수가 없는 생성자함수 호출  위+밑 name
		this.name = name;
	}

	public ThisEx(String name, String jumin) {
		this(name);
		this.jumin = jumin;

	}

	public ThisEx(String name, String jumin, String tel) {
		this(name, jumin);
		this.tel = tel;
	}

}





public class ThisEx1 {

	public static void main(String[] args) {
		ThisEx t = new ThisEx();
		System.out.println(t.name);
		System.out.println(t.jumin);
		System.out.println(t.tel);
		System.out.println();
		
		
		
		System.out.println(t.getName());
		System.out.println(t.getJumin());
		System.out.println(t.getTel());
	}

}
