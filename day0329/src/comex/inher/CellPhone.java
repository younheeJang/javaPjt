package comex.inher;

public class CellPhone {

	// �ʵ�
	String model;
	String color;

	// ������

	// �޼ҵ�
	void PowerOn() {
		System.out.println("������ �մϴ�.");
	}

	void PowerOff() {
		System.out.println("������ ���ϴ�.");
	}

	void Bell() {
		System.out.println("���� �︳�ϴ�.");
	}

	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}

	// �����(ó�� ����)�� ������ ���ϰ��� ����???
	// ��Ʈ�� �޽����� �Ű� ������ Ȱ���Ͽ� ���庸�̽���� �޼ҵ��� ��뿡 Ȱ���Ѵ�.
	void sendVoice(String message) {
		System.out.println("�ڱ�:" + message);
	}

	void receiveVoice(String message) {
		System.out.println("����:" + message);
	}

}




