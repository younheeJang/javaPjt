package com.excp;

import static java.lang.System.out;

public class ExceptionEx3 {

	int[] ss;

	public ExceptionEx3() {
		ss = new int[3];
	}

	public void program() {

		for (int i = 0; i < ss.length; i++) {
			out.println("for�� ����" + i + "��°");

			try {
				out.println(ss[i]);
			} catch (Exception e) {
				out.println("���ܹ߻�:" + e);
				return;
			} finally {
				out.println("��������");
			}

			out.println("for�� ��" + i + "��°");
		}

	}
     //�ڽ��� ȣ���� �޼ҵ�� �ͼ����� ������(����)

	public void test()  throws Exception{
		out.println(6/0);
	}
	
	public static void main(String[] args) throws Exception {

		 ExceptionEx3 ee = new  ExceptionEx3()	;
		 ee.program();
		 ee.test();
	}

}
