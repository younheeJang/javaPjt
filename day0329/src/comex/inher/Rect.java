package comex.inher;

public class Rect extends SuperEx2{
private int w, h;
public Rect() {
	
}
public void calc(int w, int h) {
	
	this.w=w;
	this.h=h;
	area = w*h;
	write();
	
}	
	
@Override//상속을 받아왔기 때문에 오버로딩이 아닌 오버라이드로(매개변수까지 같아야 함
	public void write() {
	System.out.println("w:"+w+",h:"+h);
System.out.println("사각형:"+area);

}
}
