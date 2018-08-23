package reference;

public class ReferEx1 {

	int width, height;//인스턴스 변수 =  필드값

	//변수를 활용(참조)하는 메소드 만들기!
	public int area() {
		//인스턴스 메소드
		//자료형 있으면 무조건  리턴이 있어야 함 단, 보이드가 오면 자료형이 있어도 리턴 안 와도 됨
		//인트형 에리아의 리턴값은 에리아를 구하는 식에 해당함.
		return 	width * height;
	}
	/*public void area(int width, int height) {


	}*/
	
	public int length() {//인스턴스 메소드
		
		return(width+height)*2;
		
		
	}
	
	public void setData(int w, int h) {
		this.width = w;
		this.height = h;
		//클래스 도입부에 선언된 해당 변수 명칭으로 감
		//매개 변수와 클래스 변수를 구분하기 위해 this.을 붙여줘야 함 
	}
	
	
}
