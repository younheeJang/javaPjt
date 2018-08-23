package study;

//import exam.Exam;// 패키지와 패키지 


//클래스를 따로 만들었을 때 메인에서 사용하기 위해서는
class CreditCard{
	//public은 접근 연산자임

	
	
	
static	public long number; // 메인에서 객체 생성 후 객체 이름.을 눌렀을 때 지정해 놓은 연산자가 나옴
	public String owner;
    private String literate;//private는 메인에서 사용못함. 접근 제한 기능 때문에 은행에서 쓰임
	public String getLiterate() {
		return literate;
	}
	public void setLiterate(String literate) {
		
		//포인터 this 동일 클래스 내에 있다는 뜻
		this.literate = literate;
	}
	
 public int aa(int a, int b) {
	 
	 
	 
	 
	 int c;
	 return c=a+b;
	 
 }
 /*getter와 setter만들기
  * Private 입출력
  * 
  *  입력시 set
  *  출력시 get
  */
   
 
	
}


public class Exam1 extends CreditCard{

protected void name() {
	
	
}	

@Override
public void setLiterate(String literate) {
	//TODO Auto-generated merhod stub
	super.setLiterate(literate);
	
}

	public static void main(String[] args) {
		//1.객체를 생성해야 한다.
		//클래스이름 객체이름 = new 연산자;
		
		
		//다른 클래스에서 static을 붙인 메소드는 메인에서 메소드이름만으로 메소드 활용이 가능하다.
		CreditCard.number=100;
		
		
		//다른 클래스에서 static을 붙이지 않은 메소드를 활용시 
		//다음과 같이 인스턴스 변수를 만들어주어야만 활용이 가능함.
		CreditCard card = new CreditCard();
		card.number=123456;
		card.owner = "홍길동";
		
		//private
	    card.setLiterate("홍길동");
		System.out.println(card.number);
		System.out.println(card.getLiterate());
		
	}

}
