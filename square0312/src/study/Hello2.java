package study;

import java.util.Scanner; // �ܼ� �Է��� ���� Ŭ����

public class Hello2 {

	int special;
	
	public static void main(String[] args) {
		       // �������� ���𹮵�
				int base;
			    int height;
			    int area;
		       // �������� ����, ���� �׸��� �ʱ�ȭ
			   Scanner scanner = new Scanner (System.in);
			        
			        //1. ������ ����Ѵ�.
			        System.out.println("���� ����\t���� ����\t�簢�� ����\t\tspecial");
			        //2. ���� ���̿� ���� ���̸� �Է¹޴´�.
			        base = scanner.nextInt();
			        height = scanner.nextInt();
			        Hello2 fe = new Hello2();
			        fe.special = scanner.nextInt();
			            // 2.1. ���� ���̸� ��ȯ�Ѵ�.
			            base = base + 7;
			            //2.2. ���� ���̸� ��ȯ�Ѵ�.
			            height = height*3;
			            //2.3. �簢�� ���̸� ���Ѵ�.
			            area = base*height;
			            //2.4. �簢���� ���̿� special ���� ���Ѵ�.
			            area = area + fe.special;
			        //3. ���� ���̿� ���� ���� �׸��� �簢�� ���̸� ����Ѵ�.
			            
	                System.out.printf("%d\t\t %d\t\t %d\t\t\t %d\n\n", base, height, area, fe.special);
	                //4. ������ �Ѵ�.
	                System.out.println("���� : special�� �簢�� ���̸� ���ϴ� ���Ŀ��� ��� ���Ǿ�����?");
	
	}
	
}
