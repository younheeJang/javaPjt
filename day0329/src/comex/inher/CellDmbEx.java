package comex.inher;

public class CellDmbEx {

	public static void main(String[] args) {
	
		/*�ռ� ����� ���� �� ���� Ŭ������ ��� �ִ� �ʵ� �� �޼ҵ带 Ȱ���Ͽ� ��� ���� ����ֱ� ���ؼ� 
		 *�� Ŭ������ ��ӹ��� �𿥺� Ŭ������ �� ���� ��ü �������ش�.
		 */
		
// ��ü ����
		Dmb d = new Dmb("�ڹ���","���",9);
		
		
		//Cell���� ��ӹ��� �ʵ带 ���
		System.out.println("��:"+d.model);
		System.out.println("����:"+d.color);
		//Dmb���� ��ӹ��� �ʵ带 ���
		
		System.out.println("ä��:"+d.channel);
		
		//Cell���� ��ӹ��� �޼ҵ带 ���
		
		d.turnOn();
		d.bell();
		d.sendVoice("��������~");
		d.receiveVoice("�ȳ��ϼ���, ���� ȫ�浿�̶�� �մϴ�~");
		d.sendVoice("��, �ȳ��ϼ���~!");
		//Dmb���� ��ӹ��� �޼ҵ带 ���
		d.turnOnDmb();
		d.changeChannelDmb(10);
		d.turnOffDmb();
		
		
	}

}
