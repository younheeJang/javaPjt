package reference;

public class ReferExam1 {

	public static void main(String[] args) {
		
		 ReferEx1 re1;//���۷��� ���� ����
		 re1= new  ReferEx1();//���۷��� ���� ����
		 //. �� ���� ������ 
		 
		 ReferEx1 re2 = new  ReferEx1();
		 
		 int a, b;
		 //����� ������ ���� ���� ���� ����� �ؼ� ����
		
		 //void���̹Ƿ� ���ϰ��� ��� �ڷ��� �� ���� �� ��ü�� ���� �������� �ʰ� 
		 //�Ʒ��� ���� ������ ���ο��� ���࿡ �̿��� �� �ִ�.
		 //setData�޼ҵ�� ���� ó�� ��ȣ�� �����Ѵ�.
		 re1.setData(10, 5);
		 re2.setData(50, 60);
		 
		 a=re1.area();//50
		 b=re1.length();//220
		 
		 System.out.printf("���� : %d. ���� : %d, ���� : %d. �ѷ� : %d\n", re1.width, re1.height, a, b);
	
		 a=re2.area();//50
		 b=re2.length();//220
		 
		 System.out.printf("���� : %d. ���� : %d, ���� : %d. �ѷ� : %d\n", re2.width, re2.height, a, b);
	}

}
