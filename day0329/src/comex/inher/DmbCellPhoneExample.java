package comex.inher;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		// ���ϴ� ������� ����� ���ֱ� ����

		// DmbCellPhone ��ü ���� //�����ڸ� �ҷ����� �ǰ�?
		DmbCellPhone dmbcellphone = new DmbCellPhone("�ڹ���", "��ȫ", 12);
		// �������ִ� �Ű������� �ڷ����� ��Ʈ���̸� "", �׳� ������ �� ��Ʈ�̸� ""���� ���� ��

		// CellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("��:" + dmbcellphone.model);
		System.out.println("����:" + dmbcellphone.color);
		
		// DmbCellPhone���κ��� ��ӹ��� �ʵ�
		System.out.println("ä��:" + dmbcellphone.channel);
		
		
		
		// CellPhone���κ��� ��ӹ��� �޼ҵ�(���) ȣ��
		 dmbcellphone.PowerOn();
		 dmbcellphone.Bell();
		 dmbcellphone.sendVoice("��������~");
		 dmbcellphone.receiveVoice("�ȳ��ϼ���, ���� ȫ�浿�ε���~");
		 dmbcellphone.sendVoice("��, �ȳ��ϼ���~!");
		 dmbcellphone.hangUp();
		 
		// DmbCellPhone���κ��� ��ӹ��� �޼ҵ�(���) ȣ��
		 dmbcellphone.turnOnDmb();
		 dmbcellphone.changeChannelDmb(10);
		 dmbcellphone.turnOffDmd();
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
