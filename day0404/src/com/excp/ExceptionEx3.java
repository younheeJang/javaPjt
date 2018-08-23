package com.excp;

import static java.lang.System.out;

public class ExceptionEx3 {

	int[] ss;

	public ExceptionEx3() {
		ss = new int[3];
	}

	public void program() {

		for (int i = 0; i < ss.length; i++) {
			out.println("for문 시작" + i + "번째");

			try {
				out.println(ss[i]);
			} catch (Exception e) {
				out.println("예외발생:" + e);
				return;
			} finally {
				out.println("나오세요");
			}

			out.println("for문 끝" + i + "번째");
		}

	}
     //자신을 호출한 메소드로 익셉션을 위임함(전가)

	public void test()  throws Exception{
		out.println(6/0);
	}
	
	public static void main(String[] args) throws Exception {

		 ExceptionEx3 ee = new  ExceptionEx3()	;
		 ee.program();
		 ee.test();
	}

}
