package study;

public class OverloadingEx {

	// �Լ��� �̸��� ����. �����ε��̴�. "������ Ŭ���� ��"���� �Լ��� �̸��� �Ȱ���
	// �ᵵ �ߺ����� �ʰԲ� ���ִ� ��.

	public void getLength(int n) {

		String s = String.valueOf(n);
		getLength(s);

	}

	void getLength(float n) {
		String s = String.valueOf(n);
		getLength(s);

	}

	private int getLength(String str) {

		System.out.println("�Է��� ���ڿ��� ����:" + str.length());
		return 0;
	}

	public static void main(String[] args) {

		OverloadingEx ov = new OverloadingEx();

		ov.getLength(100);//int ��
		ov.getLength(3.14f);//float ��
		ov.getLength("ȫ�浿");//String ��

	}

}
