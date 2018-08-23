package study;

class Max{
	
	public static int max (int num1, int num2) {
		int result;
		
		if(num1>num2) 
			result = num1;
			
		else
			result = num2;
		
		return result;
	}
	
	
}

public class Book2 {

	public static void main(String[] args) {
	
		Book1 bb = new Book1();//다른 파일의 클래스에 있던 메소드 불러온 것 책 설명 메소드
	/*bb.name = "정의란 무엇인가";
	bb.writer = "micheal";
	bb.price=10000;
*/

		 Max a =new Max(); //같은 파일의 다른 클래스에 있던 메소드를 불러온 것 맥스 메소드
		int b = a.max(10, 20);
		
		System.out.println(b);
	}

}
