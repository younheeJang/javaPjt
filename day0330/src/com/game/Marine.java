package com.game;

public class Marine extends Unit {

	
	//���� Ŭ���� ��� ���� �������̵�
	@Override
	void move(int x, int y) {
		System.out.println("������ ��ġ �̵� ��ǥ�� x:" + x + ", y:" + y + "�Դϴ�.");
	}

	@Override
	void stop() {
		System.out.println("������ ��� ���¿� �ֽ��ϴ�.");
	}

	@Override
	void message() {
		System.out.println("Message:: Standing back");
	}

	
	//������ ������ �ִ� �޼ҵ�
	void stimPack() {
		System.out.println("������ �������� ����Ѵ�.");
	}

}
