package comex.inher;

public class SonEx  extends ParentEx {

	int foo = 7;
	
	public int getNumber(int a) {
		return a+2;
	}
	
	public static void main(String[] args) {
		//다형성
		ParentEx  pe = new SonEx ();
		//부모 클래스에 있는 필드만 쓰겠다. 메소드는 자식 클래스에 있는 것을 用
		//오버라이딩 자식이 부모 클레스에 있는 필드와 메소드 모두를 가져다가 쓸 수 있다
   System.out.println("메소드는 ?:"+pe.getNumber(0));
	System.out.println("멤버필드?:"+pe.foo);
	
	}

}
