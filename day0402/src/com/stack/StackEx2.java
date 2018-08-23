package com.stack;

import java.util.*;

import static java.lang.System.out;

public class StackEx2 {

	private static final String colors[] = { "����", "���", "���", "û��", "����", "���λ�" };

	public StackEx2() {  // Ǫ�� ���Ƽ�� �ƴѵ��� ��

		Stack<String> st = new Stack<String>();

		for (String color : colors)
	
			st.push(color);// �迭 �� �����͵��� Ǫ�� �޼ҵ忡 ���� Į��� ��
			
		 	popStack(st); //�� ���� �޼ҵ带 ȣ�������ν� �Է°� ���ÿ� ����� �� �� �ְ� �ȴ�.
	
	}


	
	public void popStack(Stack<String> st) {
		//����Ʈ�� ������ƽ �ڹ� �� �� �� �ý��� �� �ƿ��� �������ָ�
		//����Ʈ�� �ƿ�.����Ʈ�� �����ϰ� ����Ʈ�� ������ ��
		out.println("pop:");
		while (!st.isEmpty()) {
			
			out.print(st.pop()+"   ");

		}

		
	}

	public static void main(String[] args) {
		
		//�̹� �� �������� �޼ҵ��̹Ƿ� �� �����ڸ� ������ָ� ������ ����������.
		
		new StackEx2();
		
	}

}
