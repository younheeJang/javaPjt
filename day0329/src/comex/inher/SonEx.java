package comex.inher;

public class SonEx  extends ParentEx {

	int foo = 7;
	
	public int getNumber(int a) {
		return a+2;
	}
	
	public static void main(String[] args) {
		//������
		ParentEx  pe = new SonEx ();
		//�θ� Ŭ������ �ִ� �ʵ常 ���ڴ�. �޼ҵ�� �ڽ� Ŭ������ �ִ� ���� ��
		//�������̵� �ڽ��� �θ� Ŭ������ �ִ� �ʵ�� �޼ҵ� ��θ� �����ٰ� �� �� �ִ�
   System.out.println("�޼ҵ�� ?:"+pe.getNumber(0));
	System.out.println("����ʵ�?:"+pe.foo);
	
	}

}
