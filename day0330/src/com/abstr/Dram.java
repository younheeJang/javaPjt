package com.abstr;

public class Dram {

	public static void main(String[] args) {
		// �� ��Ű������ ����� ���� ���ݱ����� �߻� Ŭ������ ���� Ŭ�������� ���������� ������
		// ���� �޼ҵ尡 ���Ե� Ŭ����.

		//���̾Ʊ׷� Ŭ���� ��ü�� �迭�� ������.
		Diagram[] ref = new Diagram[3];
		
		ref[0]=new Triangle();
		
		ref[1]= new Circle();
		
		ref[2]= new Rectangle();
	
	for(int i = 0; i<ref.length; i++) {
		ref[i].draw();
		//��ο�� ���̾Ʊ׷� Ŭ������ �ִ� �߻� �޼ҵ��̴�.
		
	}
	
	}

}

