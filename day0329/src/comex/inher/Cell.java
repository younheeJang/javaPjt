package comex.inher;

public class Cell {

	/*
	 * �ڵ����� �𵨸�, ���� ���� �ʵ带 �����ϰ� �ڵ����� ����� ���� �� ���� ���� ��ȭ ���� ��Ҹ����� ��Ҹ����� ���� ����� ������
	 * �޼ҵ带 �����Ѵ�.
	 */

	// �ʵ� ����

	String model;
	String color;

	// �޼ҵ� ����

	// turnOn turnOff sendVoice receiveVoice bell hangOff

	void turnOn() {
		System.out.println("���� on");
	}

	void turnOff() {

		System.out.println("���� off");

	}

	void sendVoice(String message) {
		System.out.println("�ڱ� : " + message);

	}

	void receiveVoice(String message) {

		System.out.println("����:" + message);

	}

	void bell() {
		System.out.println("���� �︳�ϴ�.");

	}

	void hangOff() {

		System.out.println("��ȭ ����");
	}

}
