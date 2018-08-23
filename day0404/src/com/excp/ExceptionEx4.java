package com.excp;

import static java.lang.System.out;

public class ExceptionEx4 {
	// 메인에 throws Exception를 써주든
	private static void test() throws Exception {

		out.println(6 / 0);

	}

	// 트라이 캐치 문을 사용하든 예외처리의 방법은 한 가지에 한정되는 건 아니다.
	public static void main(String[] args) {

		ExceptionEx4 ee = new ExceptionEx4();
		try {

			ee.test();
			// 메소드를 호출한 곳에서도 트라이 캐치 구문으로 예외처리해야 함

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}
