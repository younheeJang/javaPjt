package com.inner;

public class LocalInner {

	int a = 100;

	// Ŭ������ �ν��Ͻ� ����
	public void innerEx(int k) {
		// �ν��Ͻ� �޼ҵ�

		int b = 200;
		// ��������
		final int c = k;
		// ������ ���̸� ���ȭ ��Ű�ڴٴ� ��.
		// static int d = 300;//static ������ ���Ұ�
		class Inner {
			// �޼ҵ� �ȿ� ����ִ� ����Ŭ����
			public void getData() {

				System.out.println("int a:" + a + "\n" + "int b :" + b + "\n" + "final int c :" + c);
				// ���� ����Ŭ������ ���������� ��� ��� ��� �����ϴ�.
			}
		}//end ����Ŭ����

		//�޼ҵ� ������ ���� ���� Ŭ������ �ν��Ͻ�  ��������
		Inner i = new Inner();
		i.getData();
		//������ �ν��Ͻ�(��ü)�� ���ؼ� �޼ҵ� ȣ�Ⱑ����
		
		
	}// end innerEx()

	public static void main(String[] args) {

		LocalInner li = new LocalInner ();
		li.innerEx(1000);
		
	}

}
