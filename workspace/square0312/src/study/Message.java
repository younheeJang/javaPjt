
//��Ʈ�� ����Ʈ ����

package study;

import java.util.*;

public class Message {

	public static void main(String[] args) {

		/*
		 * ���� �̸� : Message.java 
		 * �� �� : �г�� ������ �Է¹޾� �г� �޽����� ��� 
		 * �� �� �� : �� �� �� �ۼ� ���� :
		 * 2018-03-15
		 */

		// ���� ����
		int grade = 0;
		String name;
		String message;

		// ���� ���� ����, ���� �׸��� �ʱ�ȭ
		Scanner sc = new Scanner(System.in);

		/*
		 * 1.�г��� �Է¹޴´�.
		 *  1.1. 1�г��� ���, �ش� �޽����� ����Ѵ�.
		 *  1.2. 2�г��� ���, �ش� �޽����� ����Ѵ� 
		 *  1.3. 3�г��� ���, �ش� �޽����� ����Ѵ�.
		 *  1.4. 4�г��� ���, �ش� �޽����� ����Ѵ�
		 *  1.5. 5�г��� ���, �ش� �޽����� ����Ѵ� 
		 *  1.6. 6�г��� ���, �ش� �޽����� ����Ѵ�
		 * 
		 * 2. �ش� �г⿡ �´� ���� ������ �˷��ش�.
		 *  2.1. 1�г��� ���, "����"�� ����Ѵ�.
		 *  2.2. 2�г��� ���, "��Ȳ"�� ����Ѵ�
		 *  2.3. 3�г��� ���, "���"�� ����Ѵ�.
		 *  2.4. 4�г��� ���, "�ʷ�"�� ����Ѵ�
		 *  2.5. 5�г��� ���, "�Ķ�"�� ����Ѵ�
		 *  2.6. 6�г��� ���, "����"�� ����Ѵ�
		 */

		// System.out.println("\"Hello World\"");

		System.out.println("�̸��� �Է��ϼ���.");
		name = sc.nextLine();

		System.out.println("�г��� �Է��ϼ���.");
		grade = sc.nextInt();

		switch (grade) {

		case 1:
			System.out.println("\"FRESHMAN\"\n");
			System.out.println("������ ������ �޾��ּ���.");
			break;

		case 2:
			System.out.println("\"SOPHOMORE\"\n");
			System.out.println("��Ȳ�� ������ �޾��ּ���.");
			break;
		case 3:
			System.out.println("\"JUNIOR\"\n");
			System.out.println("����� ������ �޾��ּ���.");
			break;
		case 4:
			System.out.println("\"SENIOR\"\n");
			System.out.println("�ʷϻ� ������ �޾��ּ���.");
			break;
		case 5:
			System.out.println("\"5th GRADE\"\n");
			System.out.println("�Ķ��� ������ �޾��ּ���.");
			break;
		case 6:
			System.out.println("\"6th GRADE\"\n");
			System.out.println("����� ������ �޾��ּ���.");
			break;
		}

	}

}
