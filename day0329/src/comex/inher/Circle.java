package comex.inher;

public class Circle extends SuperEx2{
public Circle(String title) {
	
	super(title);//상위클래스를 의미
	
}


public void calc(int r) {
	area = r*r*3.14;
	write();
	
}

}
