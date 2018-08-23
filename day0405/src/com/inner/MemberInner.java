package com.inner;
import static java.lang.System.out;
public class MemberInner {

	int a = 10;

	private int b = 100;

	static int c = 200;

	class Inner {
		// 내부클래스 정의

		public void printData() {
			out.println("int a : " + a + "\n" + "private int b :" + b + "\n" + "static int c:" + c);
			//private 외부클래스를 참조하여 데이터를 출력하고자 할 때 
			//private 내부클래스에 대한 접근을 아무 거부없이 허용
		}
	}

	public static void main(String[] args) {
		MemberInner.Inner mi = new MemberInner().new Inner();
		mi.printData();
	}
}
