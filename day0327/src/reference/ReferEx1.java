package reference;

public class ReferEx1 {

	int width, height;//�ν��Ͻ� ���� =  �ʵ尪

	//������ Ȱ��(����)�ϴ� �޼ҵ� �����!
	public int area() {
		//�ν��Ͻ� �޼ҵ�
		//�ڷ��� ������ ������  ������ �־�� �� ��, ���̵尡 ���� �ڷ����� �־ ���� �� �͵� ��
		//��Ʈ�� �������� ���ϰ��� �����Ƹ� ���ϴ� �Ŀ� �ش���.
		return 	width * height;
	}
	/*public void area(int width, int height) {


	}*/
	
	public int length() {//�ν��Ͻ� �޼ҵ�
		
		return(width+height)*2;
		
		
	}
	
	public void setData(int w, int h) {
		this.width = w;
		this.height = h;
		//Ŭ���� ���Ժο� ����� �ش� ���� ��Ī���� ��
		//�Ű� ������ Ŭ���� ������ �����ϱ� ���� this.�� �ٿ���� �� 
	}
	
	
}
