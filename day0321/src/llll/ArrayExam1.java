package llll;

public class ArrayExam1 {
	/*
	 * 1���� �迭 ���� ������ ���ڰ� ����ִ� �迭�� ���� �����͵� �� ¦���� ��Ҹ� ��� ����ϰ�, 3�� ����� ��Ҹ� ��� �ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
	 * 
	 * ������ �迭 ������ : 4 7 9 1 3 2 5 6 8 1���� �迭�� ����
	 * 
	 * �迭�� ��ü������: 4 7 9 1 3 2 5 6 8
	 * 
	 * ¦�� ������ : 4 2 6 8
	 * 
	 * 3�� ��� ������: 9 3 6
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };
		int i, j;

		System.out.println("array�迭�� ����" + array.length); // �迭�� ������ ���̸� �˰� ���� ��

		// ��ü ������ ���

		System.out.print("��ü ������ ���");
		for (i = 0; i < array.length; i++)
			System.out.printf("%d\t", array[i]);

		// ¦�� ������ ���
		System.out.print("\n¦�� ������ ���:\n");
		for (i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				System.out.printf("%d\t", array[i]);

			System.out.print("3�� ��� ������ ���:\n");
			for (i = 0; i < array.length; i++) {
				if (array[i] % 3 == 0)
					System.out.printf("%d\t", array[i]);

			}

		}
	}
}
