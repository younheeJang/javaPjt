package InputOutput;

import java.io.*;

public class InputEx3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		//�����ϳ� �Է¹ޱ�
		//int x = System.in.read() - 48;
		//int x = System.in.read() - '0';
		
		
		//�Է¹��� �� �ν��� �� �ִ� ���ڴ� 0-9������ 10�̻��� ���� �Է¹����� ������
		//�ϳ� ó���� ��. �� �� �̻� ó�� ���� �� ���
		
		//���� ����
		int num1;
		int num2;
		
		
		//�����
		System.out.print("ù��° ��:");
		
		num1 = System.in.read()-48;
		System.in.read();
		System.in.read();
		//System.in.skip(0);
		System.out.print("�ι�° ��:");
		num2 =  System.in.read() - '0';
		
		int c = num1 + num2;
		System.out.println("�� ���� �հ� :"+c);
		
		
	}

}
