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
	
@Override//����� �޾ƿԱ� ������ �����ε��� �ƴ� �������̵��(�Ű��������� ���ƾ� ��
	public void write() {
	System.out.println("w:"+w+",h:"+h);
System.out.println("�簢��:"+area);

}
}
