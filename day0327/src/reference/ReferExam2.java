package reference;

public class ReferExam2 {
//인스턴스 변수 선언(필드)
	private int w, h;
//동일한 클래스 내에서는 프라이빗도 접근이 가능.
	
	public int area() {
		//인스턴스 메소드
		return w*h;
	}
	
	public void write(int a) {
		//인스턴스 메소드
		System.out.println(" 결과 : "+a);
	}
	
	//결과값 a는 area의 리턴값을 받아서 출력한다.
	
	public static void main(String[] args) {

		//인스턴스 생성
		
		ReferExam2 rr = new ReferExam2();
		rr.w = 10;
		rr.h= 20;
		
		
		int a =rr.area(); //연산값이 a로 넘어가고 
		rr.write(a); //결과값  
		
	}

}
