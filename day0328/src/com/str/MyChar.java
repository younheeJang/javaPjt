package com.str;

public class MyChar {

	// 대문자 ---> 소문자로 변환

	public char lower(char ch) {

		// A = 65// +32 소문자로 감
		// 들어오는 범위를 잡기
		if (ch >= 'A' && ch <= 'Z')
			return (char) (ch + 32);

		return ch;
	}

	// 소문자 ---> 대문자로 변환
	public char upper(char ch) {

		// a = 97// -32 소문자로 감
		// 들어오는 범위를 잡기
		if (ch >= 'a' && ch <= 'z')
			return (char) (ch - 32);

		return ch;
	}

	// 문자 ---> ASCII 코드
	public int ascii(char ch) {
		return (int) ch;
	}

	// ASCII --->문자

	public char character(int ch) {
		return (char) ch;
	}

	// 만든 메소드가 맞는지의 여부를 가늠할 수 있는 불린을 사용

	// 대문자를 소문자로 변환했는데 이것이 맞는지의 여부를 가늠하기 위해
	// 불린은 무조건 앞에 is붙여줌
	public boolean isLower(char ch) {

		boolean b = false;
		if (ch >= 'a' && ch <= 'z')
			b = true;
		return b;
	}

	// 소문자를 대문자로 변환하는 메소드에서 메소드가 맞는지의 여부 불린 사용

	public boolean isUpper(char ch) {

		boolean b = false;
		if (ch >= 'A' && ch <= 'Z')
			b = true;
		return b;
	}
	
	// 입력받은 문자(알파벳)가 아스키 코드가 맞는지의 여부
	
	public boolean isAlph(char ch) {
		
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
		return true;
		return false;
		
	}
	
	
	//들어온 문자이 숫자로 변환되었는지의 여부
	//숫자를 문자로 받았음
	public boolean isNumber(char ch) {
		if(ch>='0'&&ch<='9')
		return true;
			return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
