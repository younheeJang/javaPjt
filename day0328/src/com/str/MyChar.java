package com.str;

public class MyChar {

	// �빮�� ---> �ҹ��ڷ� ��ȯ

	public char lower(char ch) {

		// A = 65// +32 �ҹ��ڷ� ��
		// ������ ������ ���
		if (ch >= 'A' && ch <= 'Z')
			return (char) (ch + 32);

		return ch;
	}

	// �ҹ��� ---> �빮�ڷ� ��ȯ
	public char upper(char ch) {

		// a = 97// -32 �ҹ��ڷ� ��
		// ������ ������ ���
		if (ch >= 'a' && ch <= 'z')
			return (char) (ch - 32);

		return ch;
	}

	// ���� ---> ASCII �ڵ�
	public int ascii(char ch) {
		return (int) ch;
	}

	// ASCII --->����

	public char character(int ch) {
		return (char) ch;
	}

	// ���� �޼ҵ尡 �´����� ���θ� ������ �� �ִ� �Ҹ��� ���

	// �빮�ڸ� �ҹ��ڷ� ��ȯ�ߴµ� �̰��� �´����� ���θ� �����ϱ� ����
	// �Ҹ��� ������ �տ� is�ٿ���
	public boolean isLower(char ch) {

		boolean b = false;
		if (ch >= 'a' && ch <= 'z')
			b = true;
		return b;
	}

	// �ҹ��ڸ� �빮�ڷ� ��ȯ�ϴ� �޼ҵ忡�� �޼ҵ尡 �´����� ���� �Ҹ� ���

	public boolean isUpper(char ch) {

		boolean b = false;
		if (ch >= 'A' && ch <= 'Z')
			b = true;
		return b;
	}
	
	// �Է¹��� ����(���ĺ�)�� �ƽ�Ű �ڵ尡 �´����� ����
	
	public boolean isAlph(char ch) {
		
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
		return true;
		return false;
		
	}
	
	
	//���� ������ ���ڷ� ��ȯ�Ǿ������� ����
	//���ڸ� ���ڷ� �޾���
	public boolean isNumber(char ch) {
		if(ch>='0'&&ch<='9')
		return true;
			return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
