package com.icex;

import java.io.*;
import static java.lang.System.out;
public class StringBufferEx2 {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("1234567890");
		// 스트링 버퍼 생성 기본적인 버퍼의 크기는 16 그리고 객체 안에 들어있는 숫자는 10개이므로 전체 용량은 26이다.

		System.out.println(sb.capacity());
		// 버퍼의 용량

		System.out.println(sb.length());
		// 버퍼에 저장된 문자열의 길이

		out.println();
		out.println("문자열 추가 후 용량 및 문자열의 길이 비교");
		
		// 추가
		sb.append("abcdefghijklmnopq");
		System.out.println(sb.capacity());
		// 기존 버퍼 용량에 용량인 26에 +2를 함
		System.out.println(sb.length());

		sb.append("abcdefghijklmnopqrstuvwxyzabcdefgh");// 용량이 늘어나려면 기존 54를 초과해야 한다.
		System.out.println(sb.capacity());
		System.out.println(sb.length());

		sb.delete(1, 50);
		System.out.println(sb.capacity());//한번 늘어난 버퍼의 "용량"은 문자열의 길이를 지워 삭제한다고 해도
		System.out.println(sb.length());//줄어들지 않는다.

		
	}
}
