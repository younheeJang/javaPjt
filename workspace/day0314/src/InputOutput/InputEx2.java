package InputOutput;

import java.io.*;//r

public class InputEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//��������
		
		String name;
		String year;
		String addr;
		String tel;
	
		//���� ����
		BufferedReader br = new BufferedReader(
			 new InputStreamReader(System.in));
		System.out.print("�̸�:");
		
		//�Է��� �޾Ƽ� ����� �ٹδ�.
		name = br.readLine();
	
		System.out.print("����:");
		year = br.readLine();
		
		System.out.print("�ּ�:");
		addr = br.readLine();
		
		System.out.print("��ȭ��ȣ:");
		tel = br.readLine();
		
		System.out.println();//���ٻ��� 
	    System.out.println("����� �̸��� "+name+"�� �̽ñ���");
	    System.out.println("���̴� "+ year +"�̰�");
	    System.out.println("�ּҴ� "+addr+"�̸�");
	    System.out.println("��ȭ��ȣ�� "+tel+"�̱���");
	    
	
	}
	

}
