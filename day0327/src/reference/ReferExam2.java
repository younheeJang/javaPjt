package reference;

public class ReferExam2 {
//�ν��Ͻ� ���� ����(�ʵ�)
	private int w, h;
//������ Ŭ���� �������� �����̺��� ������ ����.
	
	public int area() {
		//�ν��Ͻ� �޼ҵ�
		return w*h;
	}
	
	public void write(int a) {
		//�ν��Ͻ� �޼ҵ�
		System.out.println(" ��� : "+a);
	}
	
	//����� a�� area�� ���ϰ��� �޾Ƽ� ����Ѵ�.
	
	public static void main(String[] args) {

		//�ν��Ͻ� ����
		
		ReferExam2 rr = new ReferExam2();
		rr.w = 10;
		rr.h= 20;
		
		
		int a =rr.area(); //���갪�� a�� �Ѿ�� 
		rr.write(a); //�����  
		
	}

}
