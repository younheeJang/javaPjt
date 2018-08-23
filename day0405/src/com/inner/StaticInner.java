package com.inner;

public class StaticInner {

	int a = 1;
	private int b = 100;
	static int c = 200;

	static class Inner {
/*��¿ �� ���� ���� Ŭ������ static���� �����ؾ� �� ��찡 ����
 * ���� Ŭ������ ��� �ʵ� �� �ϳ��� static �ʵ尡 ���� ��� �����
 * 
 */
		static int d = 1000;

		public void printData() {

			/*System.out.println("int a : " + a);
			System.out.println("private int b :" + b);*/
			System.out.println("static int c :" + c);
			System.out.println("static int d :" + d);
		
		}

	}

	public static void main(String[] args) {
		 
		StaticInner.Inner si = new StaticInner.Inner();
		si.printData();
	}
}
