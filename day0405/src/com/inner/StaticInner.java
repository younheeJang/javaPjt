package com.inner;

public class StaticInner {

	int a = 1;
	private int b = 100;
	static int c = 200;

	static class Inner {
/*어쩔 수 없이 내부 클래스를 static으로 선언해야 할 경우가 있음
 * 내부 클래스의 멤버 필드 중 하나라도 static 필드가 있을 경우 사용함
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
