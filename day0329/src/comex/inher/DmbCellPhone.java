package comex.inher;

public class DmbCellPhone extends CellPhone {

	//�ʵ�
	int channel;
	
	//������ �� ���� ä�� �� ������ �Ű� ������ ������ ���� ���� �޶��� �� �ִ�.
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel=channel;
	}
	
	//�޼ҵ�(�ϳ��� ����� ���� ������ ����)
	//��� ���� , ä�� ����, ���� ���� �� ���� ����� ���� �޼ҵ带 �� Ŭ�������� �����Ѵ�.
	void turnOnDmb() {
		System.out.println("ä��"+channel+"�� DMB��� ������ �����մϴ�.");
	}
	//�� �޼ҵ忡���� ä���� �ٲ� �� �����Ƿ� �ٲ� ä���� ������ �� �ִ� �Ű� ������ �ʿ���.
	void changeChannelDmb(int channel) {
	 this.channel = channel;
	 System.out.println("ä�� "+channel+"������ �ٲߴϴ�.");
	}
	
	void turnOffDmd() {
		System.out.println("DMB��� ������ ����ϴ�.");
		
	}

	
}
