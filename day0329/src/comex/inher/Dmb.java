package comex.inher;

public class Dmb extends Cell {

	/*
	 * �𿥺� Ƽ�� ���ſ� �ʿ��� �ʵ� ����: ä�� �𿥺� Ƽ�� ���ſ� �ʿ��� ���, ���� ���� ������ �޼ҵ带 ���� : ���� on ä�� ����
	 * ���� off ���� �𿥺� ������ �ʵ带 ��½� ��Ȯ�� ����ϱ� ���� �ش� �ʵ���� ��Ƽ� �ʱ�ȭ�س��� �����ڸ� �����Ѵ�.
	 */

	// �ʵ� ����

	int channel;

	// ������

	Dmb (String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;

	}

	// �޼ҵ� ����
	void turnOnDmb() {
		System.out.println("ä��" + channel + "���� �����մϴ�.");
	}

	void changeChannelDmb(int channel) {
		System.out.println("ä��" + channel + "������ �����մϴ�.");
	}

	void turnOffDmb() {
		System.out.println("DMB������ �����մϴ�.");
	}

}
