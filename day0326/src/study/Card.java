
package study;

//메인 메소드가 들어있는 클래스 외의 클래스 안에 변수 설정 및 메소드 만듦
class Credit {

	 static public int number;
	public String owner;
	private String literate;

	public String getLiterate() {
		return literate;
	}

	public void setLiterate(String literate) {
		this.literate = literate;
	}

	
	//메소드
	public int h(int a, int b) {
		int c;
		return c = a + b;

	}

}


//메인 메소드가 들어있는 클래스에서 다른 클래스의 메소드 및 변수를 사용하고자 한다면,
//아래와 같이 선언해준다.
// 퍼블릭 클래스 카드(자) 익스텐즈 크레디트(부)



public class Card extends Credit {


	
	@Override
	public void setLiterate(String literate) {
		//TODO Auto-generated merhod stub
		super.setLiterate(literate);
		
	}
	
	public static void main(String[] args) {

	 Credit.number=100;
		
		
	 Credit a = new Credit();
	a.owner = "홍길동";
	
	a.setLiterate("홍길동");
	System.out.println(a.number);
	 System.out.println(a.getLiterate());
	}
}