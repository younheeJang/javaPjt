package com.excp;

import static java.lang.System.out;

import java.io.IOException;

public class Exception2 {
//Ʈ���� ĳġ ���̳θ� �� Ʈ���� ĳġ, Ʈ���� ���̳θ��� ����
	public static void main(String[] args)  throws Exception{
		//throws IOException�� Ʈ���� ĳġ ���̳θ� ��� ����� �� �ִ�. ���ο� �ѱ�ٰ� ��.
		out.println(1);
		out.println(2);
		try {
			out.println(3);
			out.println(0/0);//���� �߻�!!!!!
			out.println(4);
		
		}
		finally {
			//������ �����Ѵ�.
			//���� �߻� ���ο� �������.
			out.println("��� ���ؿ�!");
		}
		out.println(6);
	}

}
