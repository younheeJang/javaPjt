package com.excp;

import static java.lang.System.out;

public class ExceptionEx4 {
	// ���ο� throws Exception�� ���ֵ�
	private static void test() throws Exception {

		out.println(6 / 0);

	}

	// Ʈ���� ĳġ ���� ����ϵ� ����ó���� ����� �� ������ �����Ǵ� �� �ƴϴ�.
	public static void main(String[] args) {

		ExceptionEx4 ee = new ExceptionEx4();
		try {

			ee.test();
			// �޼ҵ带 ȣ���� �������� Ʈ���� ĳġ �������� ����ó���ؾ� ��

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
