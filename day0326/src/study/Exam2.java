package study;

public class Exam2 {

	public static void main(String[] args) {
		// r������ �޼ҵ� ȣ�� �� ���
		Exam ee = new Exam();
//�ٸ������� ������ ���Ƿ� �ڵ����� �߸��� ���� �־� ������ ���ٸ�
		//������ �߻��� ���� ã�� �� ����.
		
		int d = ee.add(10, 20);
		int e = ee.sub(10, 20);
		int f = ee.mul(10, 20);
		int g = ee.div(10, 20);
		System.out.println("����:" + d);
		System.out.println("�E��:" + e);
		System.out.println("����:" + f);
		System.out.println("������:" + g);
		// ������ �������� �ڷ����� ��Ʈ�̹Ƿ� �Ҽ����ڸ����� ������ �ʴ´�.
		// 0���� ©��.

	}

}
