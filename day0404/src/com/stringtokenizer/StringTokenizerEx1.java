package com.stringtokenizer;

import java.util.StringTokenizer;
import static java.lang.System.out;

public class StringTokenizerEx1 {

	StringTokenizer st;

	public StringTokenizerEx1(String str) {
		out.println("str:" + str);
		// �����ڿ� ���޵� str ���ڰ��� ���
		st = new StringTokenizer(str);
		// ��� ��ü ����
	}

	public StringTokenizerEx1(String str, String delim) {

		out.println("str:" + str);
		// �����ڿ� ���޵� str���ڰ��� ���
		st = new StringTokenizer(str, delim);
		// ���ڿ��� �����ϱ� ���� �ι�° �Ű������� Ȱ��
		// delim("\")
	}

	public void print() {
		out.println("Token count:" + st.countTokens());
		while (st.hasMoreTokens()) {
			// ��ū�� �ִ� ���� �ݺ��ؼ� ��´�.
			String token = st.nextToken();
			out.println(token);

		}
		out.println("========================================");
	}

	public static void main(String[] args) {

		StringTokenizerEx1 st1 = new StringTokenizerEx1("�� ���Ⱑ ���ܿ� ���Ƕ����� ������ ����");
		st1.print();
		StringTokenizerEx1 st2 = new StringTokenizerEx1("2018/04/04", "/");
		st2.print();
		//��Ʈ�� Ŭ������ ���� �� ���ڿ��� ��� �����ϴ���, �� ���� ��ũ������ Ŭ���� ���� �޼ҵ带 ����Ѵ�.		
		//StringTokenizer�� ��� ������ �����ϰ� �����Ѵ�.
	}

}
