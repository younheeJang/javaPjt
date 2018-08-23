package comex.inher;

public class InherEx2 {

	public static void main(String[] args) {
		
		Rect r = new Rect();//제목이 없는 생성자
		Circle c = new Circle("원:");//해당 클래스에서 제목이 있는 생성자
		
		r.calc(10,5);
		c.calc(30);
		
		
	} 
}
