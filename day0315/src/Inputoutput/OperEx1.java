package Inputoutput;

import java.util.*; // ��ĳ�� �̿�� �ݵ�� ����

public class OperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//��ĳ�� �ν��Ͻ� ����
		
		int a, b; // �� ���� ���� �Է� ���� ���� ����
		 
		int c, d, e, f, g ; // ���� �����ڸ� �����հ踦 ������ ���� 
		
		
	System.out.print("ù ��° �� �Է� :");
	a = sc.nextInt();
	System.out.print("�� ��° �� �Է� :");	
	b = sc.nextInt();
	//�� ���� ���� ��ĳ�ʷ� �Է� �޴´�.
	
	c = a + b;
	d = a - b;
	e = a * b;
	f = a / b;
	g = a % b;
	
	//����Ʈ������ ���� ������
	System.out.printf("%4d+%4d=%4d\n", a, b, c);
	System.out.printf("%4d-%4d=%4d\n", a, b, d);
	System.out.printf("%4d*%4d=%4d\n", a, b, e);
	System.out.printf("%4d/%4d=%4d\n", a, b, f);
	System.out.printf("%4d %% %4d=%4d\n", a, b, g);
   //%% �ϳ��� ���Ĺ��� �ϳ��� ������
	//%4d���� 4�� �ڸ���
	}
	
	
}
	
