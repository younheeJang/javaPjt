package com.inner;
import static java.lang.System.out;
public class MemberInner {

	int a = 10;

	private int b = 100;

	static int c = 200;

	class Inner {
		// ����Ŭ���� ����

		public void printData() {
			out.println("int a : " + a + "\n" + "private int b :" + b + "\n" + "static int c:" + c);
			//private �ܺ�Ŭ������ �����Ͽ� �����͸� ����ϰ��� �� �� 
			//private ����Ŭ������ ���� ������ �ƹ� �źξ��� ���
		}
	}

	public static void main(String[] args) {
		MemberInner.Inner mi = new MemberInner().new Inner();
		mi.printData();
	}
}
