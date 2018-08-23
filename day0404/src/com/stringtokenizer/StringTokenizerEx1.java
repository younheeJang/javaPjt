package com.stringtokenizer;

import java.util.StringTokenizer;
import static java.lang.System.out;

public class StringTokenizerEx1 {

	StringTokenizer st;

	public StringTokenizerEx1(String str) {
		out.println("str:" + str);
		// 생성자에 전달된 str 인자값을 출력
		st = new StringTokenizer(str);
		// 멤버 객체 생성
	}

	public StringTokenizerEx1(String str, String delim) {

		out.println("str:" + str);
		// 생성자에 전달된 str인자값을 출력
		st = new StringTokenizer(str, delim);
		// 문자열을 구분하기 위한 두번째 매개변수를 활용
		// delim("\")
	}

	public void print() {
		out.println("Token count:" + st.countTokens());
		while (st.hasMoreTokens()) {
			// 토큰이 있는 동안 반복해서 찍는다.
			String token = st.nextToken();
			out.println(token);

		}
		out.println("========================================");
	}

	public static void main(String[] args) {

		StringTokenizerEx1 st1 = new StringTokenizerEx1("나 보기가 역겨워 가실때에는 말없이 고이");
		st1.print();
		StringTokenizerEx1 st2 = new StringTokenizerEx1("2018/04/04", "/");
		st2.print();
		//스트링 클래스를 썼을 때 문자열을 어떻게 구분하는지, 이 때는 토크나이저 클래스 말고 메소드를 사용한다.		
		//StringTokenizer의 경우 공백을 무시하고 제거한다.
	}

}
