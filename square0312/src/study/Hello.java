package study;

import java.util.Scanner; // �ܼ� �Է��� ���� Ŭ����

public class Hello {

	public static void main(String[] args) {
		       // �������� ���𹮵�
				int base;
			    int height;
			    int area;
		       // �������� ����, ���� �׸��� �ʱ�ȭ
			   Scanner sc = new Scanner (System.in);
			        
			        //1. ������ ����Ѵ�.
			        System.out.println("���� ����\t���� ����\t�簢�� ����");
			        //2. ���� ���̿� ���� ���̸� �Է¹޴´�.
			        base = sc.nextInt();
			        height = sc.nextInt();
			        
			            // 2.1. ���� ���̸� ��ȯ�Ѵ�.
			            base = base + 7;
			            //2.2. ���� ���̸� ��ȯ�Ѵ�.
			            height = height*3;
			            //2.3. �簢�� ���̸� ���Ѵ�.
			            area = base*height;
			        //3. ���� ���̿� ���� ���� �׸��� �簢�� ���̸� ����Ѵ�.
	                System.out.printf("%d\t\t %d\t\t %d", base, height, area);
	}
	
}
