package bank;

import java. io.*;

public class Banking {

	public static void main(String[] args) throws IOException {
		
		Account na = new Account("ȫ�浿");
		//ȫ�浿�� ������ �Լ��� ���� ��Ʈ�� �������� ��
		/*public Account(String name) {
			// TODO Auto-generated constructor stub
		this.name= name; //Ŭ������ �ö󰡼� ���� ������ this
		} <-���*/
		BufferedReader br = new 	BufferedReader(new InputStreamReader(System.in));
		
		String strWork;
		do {
			
			System.out.println("\n �޴��� �����ϼ���");
			System.out.println("==========================");
			System.out.println("��                      �� ==========>  1");
			System.out.println("��                      �� ==========>  2");
			System.out.println("��     ��     ��     ȸ ==========>  3");
			System.out.println("��                      �� ==========>  0");
			System.out.println("==========================");
			
			
			System.out.print("�޴��� �����ϼ���.");
			strWork = br.readLine();
			
			int switchInt = 0;
			if(strWork != null) {//�ƹ� �޴��� �������� ���� ����
				switchInt = Integer.parseInt(strWork);
			}else {
				System.out.println("�޴��� ���� �ʾҽ��ϴ�");
				System.exit(0);
			}
			
			switch(switchInt) {
			
			case 0: break;
			
			case 1: 
				//�ݾ� �۷�
				System.out.println("\n ===================");
				System.out.println("�Ա��Ͻ� �ݾ��Է� :");
				String strdepositIn = br.readLine();//��Ʈ������ �Է� ����
				long depositLong = Long.parseLong(strdepositIn);//������ ��ȯ�� ��
				na
				.deposit(depositLong);
				break;
				
			case 2: 
				//��� �ݾ�
				System.out.println("\n ===================");
				System.out.println("����Ͻ� �ݾ��Է� :");
				String strwithdrawIn = br.readLine();//��Ʈ������ �Է� ����
				long withdrawLong = Long.parseLong(strwithdrawIn);//������ ��ȯ�� ��
				na.withdraw(withdrawLong);
				break;
				
			case 3: 
				//�ܰ� Ȯ��
           System.out.println(na.getName()+"���� �ܾ���"+na.getBalance()+"�Դϴ�.");
			break;
			
			default :
				System.out.println("0~3������ �����Է�\n");
				
				
			}

		}while(! strWork.equals("0"));//���ڿ��� ���� ���� �������� ����. ���ڴ� ==�� ��
		//���� 0 �� ������ �ʴ� �� ��� �ȴ�. ���Ϲ��� ������ ��
		
		
	}

}
