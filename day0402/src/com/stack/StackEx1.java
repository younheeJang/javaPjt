package com.stack;

import java.util.*;

public class StackEx1 {

	public static void main(String[] args) {
		
		//��Ʈ����  �迭 ������ ����
		String[] group = {"���Ű��ź", "�����Ʈ", "����", "���ѹα�"};
		
		
		//��Ʈ���� �迭���� �����͸� �������� ���� ����
		Stack<String> stack = new Stack<String>();
		
		
		for(String n : group)
			stack.push(n);
		//Ǫ�� �޼ҵ带 �̿��ؼ� �迭 ���� �����͸� ���ÿ� ���� �ִ´�.
		
		while(!stack.isEmpty())//�� ������ ������� ������ �̶�� ����
		{
			System.out.println(stack.pop());//������ Ǫ�� �� �޼ҵ带 ���� �� ��¿� Ȱ���Ѵ�.
		}
		
		

	}

}
