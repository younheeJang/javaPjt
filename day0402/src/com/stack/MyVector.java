package com.stack;

import java.util.*;
//API에 이미 생성되어 있는 클래스이므로 
public class MyVector extends Vector {

	public MyVector() {
		super(1, 1);// 매개변수가 두 개인 벡터 생성자 이용
	}

	public void addInt(int i) {// 정수 추가
		addElement(new Integer(i));
	}

	public void addFloat(float f) {// 실수 추가
		addElement(new Float(f));
	}

	public void addString(String s) {
		// 문자열 추가
		addElement(s);
	}

	public void addCharArray(char a[]) {
		// 문자 추가
		addElement(a);
	}

	// 출력 메소드
	public void write() {

		Object o;

		int length = size();

		System.out.println("Number of vector elements is" + length + "and they : ");

		for (int i = 0; i < length; i++) {

			o = elementAt(i);

			if (o instanceof char[]) {
				System.out.println(String.copyValueOf((char[]) o));

			} else {
				System.out.println(o.toString());
			}
		}
	}

}