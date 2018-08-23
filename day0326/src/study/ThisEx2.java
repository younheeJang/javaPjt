/*package study;

public class ThisEx2 {
public static void main(String[] args) {
		System.out.println();
		
	}
	
	
}



public class ThisEx3 {

	String name, jumin, tel;
	
	public ThisEx3() {
		//자신을 참조하는 초기값을 준다.
		this.name = "Guest";
	this.jumin="000000-0000000";
	this.tel="000-000-0000";
	
	}
	
	
	//리턴을 사용하여 다른 메소드에서 호출시 값을 출력하도록 하는 메소드
	public String getName(){
		return name;
	}
	
	public String getJumin() {
		return jumin;
	}
	
	public String getTel() {
		return tel;
	}
	
	
	//세 가지 변수를 설정
	public ThisEx3(String name) {
		this();
		this.name=name;
	}
	
	public ThisEx3(String name, String jumin) {
		this();
		this.jumin = jumin;
	}
	
	public ThisEx3(String name, String jumin, String tel) {
		this();
		this.tel = tel;
	}
	
	
	
}*/